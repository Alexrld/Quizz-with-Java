package app.quiz.console.util;

import java.util.Scanner;

public class myInputReader {
    private static final String INPUT_CURSOR = "> ";
    private static final Scanner scanner = new Scanner(System.in);

    private myInputReader(){}

    public static String readLine(){
        System.out.print(INPUT_CURSOR);
        return scanner.nextLine();
    }

    public static char readOption(){
        String option = readLine().trim();
        if(option.length() > 1) return '0';
        return option.charAt(0);
    }
}
