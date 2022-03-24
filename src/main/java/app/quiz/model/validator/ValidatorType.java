package app.quiz.model.validator;

import app.quiz.model.validator.validators.*;

public enum ValidatorType {

    REQUIRED(1, "Required", new Required_Validator()),
    DATE(2, "Date", new Date_Validator()),
    MIN(3, "Min", new Min_Validator()),
    MIN_LENGTH(4, "Min Length", new Min_Length_Validator()),
    MAX_LENGTH(5, "Max Length", new Max_Length_Validator()),
    UPPERCASE(6, "Uppercase", new Uppercase_Validator());

    private final int code;
    private final String displayName;
    private final Validator validator;

    ValidatorType(int code, String displayName, Validator validator) {
        this.code = code;
        this.displayName = displayName;
        this.validator = validator;
    }

    public int getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Validator getValidator() {
        return validator;
    }

    public static ValidatorType getByCode(int option){
        for(ValidatorType validator : ValidatorType.values()){
            if(validator.getCode() == option){
                return validator;
            }
        }
        return null;
    }
}
