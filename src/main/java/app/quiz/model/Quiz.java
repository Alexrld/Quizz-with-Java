package app.quiz.model;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private final String quizTitle;
    private final List<Question> questions;

    public Quiz(String title){
        this.quizTitle = title;
        questions = new ArrayList<>();
    }

    public String getTitle(){
        return quizTitle;
    }

    public void AddQuestion(Question question){
        questions.add(question);
    }

    public List<Question> getQuestions(){
        return questions;
    }
}
