package app.quiz.model.validator.validators;
import app.quiz.model.validator.Validator;
import app.quiz.model.validator.myIntegerParser;

import java.util.List;

public class Min_Validator implements Validator {
    private static final String ERROR_MESSAGE_GREATER_THAN = "The value must be greater than ";

    @Override
    public boolean validate(String valueString, String conditionValue, List<String> errors) {
        try{
            int value = myIntegerParser.parse(valueString);
            int conditionalValue = Integer.parseInt(conditionValue);
            if(value < conditionalValue){
                errors.add(ERROR_MESSAGE_GREATER_THAN + conditionalValue);
                return false;
            }
            return true;
        }catch (NumberFormatException ne){
            //ne.printStackTrace();
            errors.add(myIntegerParser.ERROR_MESSAGE_INVALID_NUMBER);
            return false;
        }
    }
}
