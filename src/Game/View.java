package Game;

import java.util.ArrayList;

public class View {

    public static final String USER_GUESS_NUMBER = "Try to guess the number" ;
    public static final String USER_ERROR = " You didnt guess ";
    public static final String USER_GUESSED = "You guessed the number, good job!";
    public static final String OUT_OF_BOUND = "You typed not appropriate number " ;
    public static final String ARRAY = "Your previous tries: " ;
    public static final String SUCCESSFUL_NUMBER = "The number to guess was:  " ;
    public static final String RANGE_OF_NUMBER = "the range is:" ;
    public static final String LEFT_BRACKET = "[";
    public static final String RIGHT_BRACKET = "]";
    public static final String NUMBER_IS_BIGGER = "try to type in lesser number";
    public static final String NUMBER_IS_LESSER = "try to type in bigger number";

    public void printMessage(String message)
    {
        System.out.println(message);
    }
    public void printMessage(String message, ArrayList a)
    {
        System.out.println(message + a);
    }
    public void printMessage(String message, int a) {
        System.out.println(message + a);

    }




}
