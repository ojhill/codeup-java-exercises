import java.util.Scanner;
public class ConsoleIOLecture {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String userInput = scanner.nextLine();
//        System.out.println("Your word was " + userInput);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Your Name: ");
//        String userInput = scanner.nextLine();
//        System.out.printf("Your name is %s",userInput);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer");
    int userInput = scanner.nextInt();
    System.out.printf("You entered %d%n",userInput);
    }
}

