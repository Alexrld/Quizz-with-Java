package app.quiz.model.validator;

import java.util.List;

//This interface was modified. The original was a void method instead boolean. //TODO: investigate why this method was void.
public interface Validator {
    boolean validate(String value, int conditionValue, List<String> errors);
}
