import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userQuestion = scanner.nextLine().toLowerCase();
        System.out.println(userQuestion);
            if (userQuestion.endsWith("?")) {
                System.out.println("Sure");
            } else if (userQuestion.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever");
            }
    }
}
