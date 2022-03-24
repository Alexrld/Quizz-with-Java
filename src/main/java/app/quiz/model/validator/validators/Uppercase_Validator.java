package app.quiz.model.validator.validators;

import app.quiz.model.validator.Validator;

import javax.print.DocFlavor;
import java.util.List;
import java.util.Locale;

public class Uppercase_Validator implements Validator {
    private static final String ERROR_MESSAGE = "The answer must be in Uppercase.";
    @Override
    public boolean validate(String value, String conditionValue, List<String> errors) {
        if(value.equals(value.toUpperCase(Locale.ROOT))) return true;
        errors.add(ERROR_MESSAGE);
        return false;
    }
}
