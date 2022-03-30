package app.quiz.console;

import app.quiz.console.util.myInputReader;
import app.quiz.model.Question;
import app.quiz.model.Question.QuestionBuilder;
import app.quiz.model.QuestionType;
import app.quiz.model.validator.ValidatorType;
import java.util.List;

public class Question_UI_Menu {

    public Question handleCreateQuestion(){
        String title = askQuestionTitle();
        QuestionType Qtype = askQuestionType();
        QuestionBuilder builder = new QuestionBuilder(title, Qtype);

        //I don't found a reason for the while cycle.
        while(true){
            ValidatorType validatorType = askValidatorType(Qtype, builder.getValidations());
            if(validatorType == null || builder.addValidationType(validatorType)) break;
        }

        return builder.build();
    }

    private QuestionType askQuestionType(){
        System.out.println("Select a question to add");
        for(QuestionType type : QuestionType.values()){
            System.out.printf("%d. %s" + System.lineSeparator(), type.getCode(), type.getDisplayName());
        }
        char option = myInputReader.readOption();
        return QuestionType.getByCode(Character.getNumericValue(option));
        //return QuestionType.getByCode(Integer.parseInt(String.valueOf(option)));
    }

    private String askQuestionTitle(){
        System.out.println("Type the question title:");
        return myInputReader.readLine();
    }

    private ValidatorType askValidatorType(QuestionType questionType, List<ValidatorType> validations){
        System.out.println("Select a validation type to add:");
        for(ValidatorType validator : questionType.getValidator()){
//            if(validations.contains(validator)){
//                System.out.println("Avoid the " + validator);
//            }
            System.out.format("%d. %s" + System.lineSeparator(), validator.getCode(), validator.getDisplayName());
        }

        char option = myInputReader.readOption();
        ValidatorType vtype = ValidatorType.getByCode(Character.getNumericValue(option));
        switch (vtype){
            case REQUIRED:
                System.out.println("This question now is required");
                break;
            case MIN:
                System.out.println("Type the minimum value:");
                QuestionInputHandler.conditionValue = myInputReader.readInt();
                break;
            case MIN_LENGTH:
                System.out.println("Type the minimum length:");
                QuestionInputHandler.conditionValue = myInputReader.readInt();
                break;
            case MAX_LENGTH:
                System.out.println("Type the maximum length:");
                QuestionInputHandler.conditionValue = myInputReader.readInt();
                break;
            case UPPERCASE:
                System.out.println("Only uppercase accepted");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        return vtype;
    }
}
