package app.quiz.model.validator.validators;

import app.quiz.model.validator.Validator;
import java.util.List;

public class Min_Length_Validator implements Validator {
    private static final String ERROR_MESSAGE = "The value length must not be less than";
    @Override
    public boolean validate(String value, String conditionValue, List<String> errors) {
        try{
            if(value.length() < conditionValue.length()){
                errors.add(ERROR_MESSAGE + " " +conditionValue.length() + " characters");
                return false;
            }
        }catch (NumberFormatException numberFormatException){
            numberFormatException.printStackTrace();
            return false;
        }
        return true;
    }
}
