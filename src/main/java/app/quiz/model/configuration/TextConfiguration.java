package app.quiz.model.configuration;

import app.quiz.model.validator.ValidatorType;

public class TextConfiguration extends QuestionConfiguration{
    public TextConfiguration(){
        super(false, ValidatorType.REQUIRED, ValidatorType.MIN_LENGTH, ValidatorType.MAX_LENGTH, ValidatorType.UPPERCASE);
    }
}
