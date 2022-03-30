package app.quiz.console;

import app.quiz.console.util.myInputReader;
import app.quiz.model.Question;
import app.quiz.model.validator.ValidatorType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QuestionInputHandler {

    private final List<String> errors = new ArrayList<>();
    public static int conditionValue;

    public Set<String> askQuestion(Question question){
        System.out.println("Question: " + question.getTitle());
        return getAnswer(question);
    }

    public Set<String> getAnswer (Question question){
        Set<String> answers = new HashSet<>();
        if(question.getType().getConfiguration().hasAdditionalData()){
            //TODO implement additional data.
        } else {
            while (true){
                System.out.print("(" + question.getType().getDisplayName() + ")" + " answer:");
                String value = myInputReader.readLine();
                if(ApplyValidations(question, value)){
                    answers.add(value);
                    break;
                }
                System.out.println(errors.get(errors.size()-1));
            }
        }
        return answers;
    }

    private boolean  ApplyValidations(Question question, String value){
        List<ValidatorType> validatorTypes = question.getValidations();
        for(ValidatorType validatorType : validatorTypes){
            switch (validatorType){
                //case DATE:
                case REQUIRED:
                case UPPERCASE:
                    return validatorType.getValidator().validate(value, 0, errors);
                case MIN:
                case MIN_LENGTH:
                case MAX_LENGTH:
                    return (validatorType.getValidator().validate(value, conditionValue, errors));
                default:
                    break;
            }
        }
        return false;
    }

    private String collectAnswerFromOptions(Question question){
        String answer = null;
        while (true){
            //TODO show menu.
            //TODO additional data.
        }
    }

    private void showOptions(Question question){
        System.out.println("Select an option:");
    }
}
