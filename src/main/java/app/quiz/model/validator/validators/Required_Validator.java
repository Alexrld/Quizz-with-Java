package app.quiz.model.validator.validators;

import app.quiz.model.validator.Validator;
import java.util.List;

public class Required_Validator implements Validator {
    private static final String ERROR_MESSAGE = "This question is required";

    @Override
    public boolean validate(String value, int conditionValue, List<String> errors) {
        if(value == null || value.equals("")){
            errors.add(ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
