package app.quiz.model.configuration;

import app.quiz.model.validator.ValidatorType;
import app.quiz.model.validator.myIntegerParser;

public class QuestionConfiguration {
    private final boolean hasAdditionalData;
    private final ValidatorType[] supportedValidations;

    public QuestionConfiguration(boolean hasAdditionalData, ValidatorType... supportedValidations) {
        this.hasAdditionalData = hasAdditionalData;
        this.supportedValidations = supportedValidations;
    }

    public ValidatorType[] getSupportedValidations(){
        return supportedValidations;
    }

    public boolean hasAdditionalData(){
        return hasAdditionalData;
    }

    public int IntConverter(String value){
        return myIntegerParser.parse(value);
    }
}
