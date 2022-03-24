package app.quiz.model.validator;

public class myIntegerParser {
    public static final String ERROR_MESSAGE_INVALID_NUMBER = "The value must be an integer.";
    public static int parse(String value) throws NumberFormatException{
        return Integer.parseInt(value);
    }
}
