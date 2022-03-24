package app.quiz.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class QuizAnswers {
    private Quiz quiz;
    private UUID id;
    private List<Answer> answers;

    public QuizAnswers(Quiz quiz){
        this.quiz = quiz;
        id = UUID.randomUUID();
        answers = new ArrayList<>();
    }

    public void addAnswer(Answer answer){
        answers.add(answer);
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public UUID getId() {
        return id;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}
