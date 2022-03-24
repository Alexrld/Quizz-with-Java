package app.quiz.model.configuration;

import app.quiz.model.validator.ValidatorType;
import java.text.SimpleDateFormat;

public class DateConfiguration extends QuestionConfiguration{
    public static SimpleDateFormat FORMATTER = new SimpleDateFormat("dd/MM/yyyy");

    public DateConfiguration(){
        super(false, ValidatorType.REQUIRED, ValidatorType.DATE);
    }
}
