package app.quiz.console;

import app.quiz.console.util.myInputReader;
import app.quiz.model.Question;
import app.quiz.model.Quiz;

public class Quiz_UI_Menu {

    public Quiz handleCreateQuiz(){

        String title = askQuizTitle();
        Quiz quiz = new Quiz(title);
        boolean ShouldExit = false;

        do{
            showMenu();
            char option = myInputReader.readOption();
            switch (option){
                case '1':
                    Question question = new Question_UI_Menu().handleCreateQuestion();
                    quiz.AddQuestion(question);
                    break;
                case '0':
                    ShouldExit = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (!ShouldExit);

        return quiz;
    }

    private void showMenu(){
        System.out.println("Select an option:");
        System.out.println("1. Add a new question.");
        System.out.println("0. Finish.");
    }

    private String askQuizTitle(){
        System.out.println("Type the quiz title:");
        return myInputReader.readLine();
    }
}
