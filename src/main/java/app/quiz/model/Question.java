package app.quiz.model;

import app.quiz.model.validator.ValidatorType;
import java.util.ArrayList;
import java.util.List;

public class Question {
    private final String questionTitle;
    private final QuestionType questionType;
    private final List<ValidatorType> validations;
    private List<String> additionalData;

    private Question(String title, QuestionType questionType, List<ValidatorType> validations){
        this.questionTitle = title;
        this.questionType = questionType;
        this.validations = validations;
    }
//TODO: implements these methods for tests.
    public String getTitle() {
        return questionTitle;
    }

    public QuestionType getType() {
        return questionType;
    }

    public List<ValidatorType> getValidations() {
        return validations;
    }

    public static class QuestionBuilder{
        private final String title;
        private final QuestionType questionType;
        private final List<ValidatorType> validations;
        private List<String> additionalData;

        public QuestionBuilder(String title, QuestionType questionType){
            this.title = title;
            this.questionType = questionType;
            validations = new ArrayList<>();
            additionalData = new ArrayList<>();
        }

        public Question build(){
            return new Question(title, questionType, validations);
        }

        public boolean addValidationType(ValidatorType validation){
            if(validations.contains(validation)) return false;
            validations.add(validation);
            return true;
        }

        public List<ValidatorType> getValidations() {
            return validations;
        }
    }
}
