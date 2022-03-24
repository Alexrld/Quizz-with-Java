package app.quiz;

public class QuizC {
    public void run(){
        Menu menu = new Menu();
        boolean shouldExit;
        do{
            shouldExit = menu.process();
        }while(!shouldExit);
    }
}
