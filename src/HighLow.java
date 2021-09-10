import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        rndomNum();
    }

    public static void rndomNum () {
        boolean keepGoing = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100: ");
        int result = (int) Math.floor(Math.random() * 100 + 1);
        //        System.out.println(result);
        while (keepGoing) {
            int userGuess = sc.nextInt();
            if (userGuess == result) {
                System.out.println("GOOD GUESS!");
                keepGoing = false;
            } else if (userGuess < result) {
                System.out.println("HIGHER");
            } else if (userGuess > result) {
                System.out.println("LOWER");
            }
        }
    }
}


