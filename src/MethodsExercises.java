import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        int integer = integerInput();
//        addInt(6, 6);
//        subtractInt(6, 3);
//        multiplication(4, 4);
//        division(6, 2);
//        modulus(20, 3);
//        getInteger(1, 10);
//        integerInput(1, 10);
//        factorial(integer);
//        System.out.println(factorial(integer));
        diceRoll();
    }


    public static int addInt(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;

    }

    public static int subtractInt(int a, int b) {
        int c = a - b;
        System.out.println(c);
        return c;
    }

    public static int multiplication(int a, int b) {
        int c = a * b;
        System.out.println(c);
        return c;
    }

    public static int division(int a, int b) {
        int c = a / b;
        System.out.println(c);
        return c;
    }

    public static int modulus(int a, int b) {
        int c = a % b;
        System.out.println(c);
        return c;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            return getInteger(min, max);
        } else {
            return userInput;
        }
    }

    public static int integerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
//        if (userInput > min || userInput < max) {
        return userInput;
//        }
    }

    public static long factorial(int x) {
        if (x == 1) return 1;
        return x * factorial(x - 1);
    }


    public static void diceRoll(int sides, int numberOfDice) {
        for (int i = 1; i <= numberOfDice; i++) {
            int result = (int) Math.floor(Math.random() * ((sides - 1) + 1) + 1);
            System.out.println(result);
        }
    }
    public static void diceRoll() {
        boolean keepGoing = true;
        while (keepGoing) {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many sides is the die?");
            int sides = sc.nextInt();
            System.out.println("How many die are you wanting to roll?");
            int numDice = sc.nextInt();
            diceRoll(sides, numDice);
            sc.nextLine();
            String answer = " ";
            while (!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("No")) {
                System.out.println("Keep playing? [Yes/No]");
                answer = sc.nextLine();
            }
            if (answer.equalsIgnoreCase("No")) {
                System.out.println("Thanks for playing!");
                keepGoing = false;
            }
        }
}
}