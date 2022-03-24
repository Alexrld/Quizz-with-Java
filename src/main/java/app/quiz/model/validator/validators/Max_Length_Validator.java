package app.quiz.model.validator.validators;

import app.quiz.model.validator.Validator;

import java.util.List;

public class Max_Length_Validator implements Validator {
    private static final String ERROR_MESSAGE = "The value must be less than: ";
    @Override
    public boolean validate(String value, String conditionValue, List<String> errors) {
        if(value.length() > conditionValue.length()){
            errors.add(ERROR_MESSAGE + conditionValue.length() + " characters");
            return false;
        }
        return true;
    }
}
