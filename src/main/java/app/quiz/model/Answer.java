package app.quiz.model;

import java.util.Arrays;
import java.util.Set;

public class Answer {
    private final Question question;
    private final Set<String> answers;

    public Answer(Question question, Set<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "question: " + question.getTitle() +
                "\nR: " + Arrays.toString(answers.toArray());
    }
}
