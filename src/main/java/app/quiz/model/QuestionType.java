package app.quiz.model;

import app.quiz.model.configuration.DateConfiguration;
import app.quiz.model.configuration.NumericConfiguration;
import app.quiz.model.configuration.QuestionConfiguration;
import app.quiz.model.configuration.TextConfiguration;
import app.quiz.model.validator.ValidatorType;

public enum QuestionType {
    TEXT(1,"Text", new TextConfiguration()),
    DATE(2, "Date", new DateConfiguration()),
    NUMERIC(3, "Numeric", new NumericConfiguration()),
    PICK_ONE(4, "Pick One",new TextConfiguration());

    private final int code;
    private final String displayName;
    private final QuestionConfiguration configuration;

    QuestionType(int code, String displayName, QuestionConfiguration configuration) {
        this.code = code;
        this.displayName = displayName;
        this.configuration = configuration;
    }

    public int getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public QuestionConfiguration getConfiguration() {
        return configuration;
    }

    public static QuestionType getByCode(int option){
        for(QuestionType type : QuestionType.values()){
            if(type.getCode() == option){
                return type;
            }
        }
        return null;
    }

    public ValidatorType[] getValidator(){
        return configuration.getSupportedValidations();
    }
}
