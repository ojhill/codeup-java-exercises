import java.util.Locale;
import java.util.Scanner;

public class MyTherapist {
    public static void main(String[] args) {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you feeling today?");
        userInput = scanner.nextLine().toLowerCase();
        if (userInput.equals("good")|| userInput.equals("great")){
            System.out.println("Good, I'm glad to hear you are doing well");
        }else if (userInput.equals ("bad")|| userInput.equals("not great")||userInput.equals("not good")){
            System.out.println("Let's explore that");
        }

    }
}
