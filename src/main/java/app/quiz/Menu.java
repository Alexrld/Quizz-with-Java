package app.quiz;

import app.quiz.console.Quiz_UI_Handler;
import app.quiz.console.util.myInputReader;
import app.quiz.model.Quiz;
import app.quiz.model.QuizAnswers;

public class Menu {

    private Quiz quiz;
    private QuizAnswers quizAnswers;

    public Menu(){
        //this.quiz = null;
    }

    public boolean process(){
        ShowMainMenu();
        char option = myInputReader.readOption();
        boolean shouldExit = false;
        switch (option){
            case '1':
                quiz = Quiz_UI_Handler.createQuiz();
                break;
            case '2':
                fillQuiz();
                break;
            case '3':
                showQuiz();
                break;
            case '4':
                shouldExit = true;
                break;
            default:
                System.out.println("Invalid option");
        }
        return shouldExit;
    }

    private void ShowMainMenu(){
        System.out.println("Quiz - A command quiz utility");
        System.out.println("=============================");
        System.out.println("1. Create a quiz");
        System.out.println("2. Fill quiz");
        System.out.println("3. Show quiz");
        System.out.println("4. Exit");
        System.out.println("=============================");
    }

    private void fillQuiz(){
        if(quiz == null){
            System.out.println("No quiz available, you must create first a quiz");
            return;
        }
        quizAnswers = Quiz_UI_Handler.fillQuiz(quiz);
    }

    private void showQuiz(){
        if(quiz == null || quizAnswers == null){
            System.out.println("No filled quiz available, you must create and fill a quiz");
            return;
        }
        Quiz_UI_Handler.showQuiz(quizAnswers);
    }
}
