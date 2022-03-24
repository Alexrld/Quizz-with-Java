package app.quiz.model.configuration;

import app.quiz.model.validator.ValidatorType;
import app.quiz.model.validator.myIntegerParser;

public class NumericConfiguration extends QuestionConfiguration{
    public NumericConfiguration(){
        super(false, ValidatorType.REQUIRED, ValidatorType.MIN);
    }

    @Override
    public int IntConverter(String value) {
        System.out.println("DONE!!");
        return myIntegerParser.parse(value);
    }
}
