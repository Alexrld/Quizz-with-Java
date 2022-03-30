package app.quiz.model.validator.validators;

import app.quiz.model.configuration.DateConfiguration;
import app.quiz.model.validator.Validator;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Date_Validator implements Validator {
    private static final String ERROR_MESSAGE = "The date format is invalid, it should be the format dd/MM/yyyy";
    @Override
    public boolean validate(String value, int conditionValue, List<String> errors) {
        try{
            Date parsedDate = DateConfiguration.FORMATTER.parse(value);
            return true;
        }catch (ParseException parseException){
            errors.add(ERROR_MESSAGE);
            return false;
        }
    }
}
