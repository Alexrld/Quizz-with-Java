package app.quiz.console;

import app.quiz.console.util.myInputReader;
import app.quiz.model.Answer;
import app.quiz.model.Question;
import app.quiz.model.Quiz;
import app.quiz.model.QuizAnswers;
import java.util.Set;

public class Quiz_UI_Handler {

    public static Quiz createQuiz(){
        return new Quiz_UI_Menu().handleCreateQuiz();
    }

    public static QuizAnswers fillQuiz(Quiz quiz){
        QuizAnswers quizAnswers = new QuizAnswers(quiz);
        QuestionInputHandler questionInputHandler = new QuestionInputHandler();
        System.out.println("Quiz: " + quiz.getTitle());
        for(Question question : quiz.getQuestions()){
            Set<String> answers = questionInputHandler.askQuestion(question);
            Answer answer = new Answer(question, answers);
            quizAnswers.addAnswer(answer);
        }
        return quizAnswers;
    }

    public static void showQuiz(QuizAnswers quizAnswers){
        System.out.println("Quiz: " + quizAnswers.getQuiz().getTitle());
        System.out.println("===========================================");
        for(Answer answer : quizAnswers.getAnswers()){
            System.out.println(answer);
        }
        System.out.println("===========================================");
        System.out.println("Press ENTER to continue.");
        myInputReader.readLine();
    }
}
