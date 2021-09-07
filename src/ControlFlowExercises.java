import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//                System.out.print(i + " ");
//            ++i;
//            }
//
//        long i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        }while(i <= 100);{
//
//        }
//        long i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        }while(i > -10);{
//
//        }
//        long number = 2L;
//        do {
//            System.out.println(number);
//            number *= number;
//        }while (number <= 1000000) ;{
//            System.out.println(number);
//        }

//        for (int i = 5; i<15; i++){
//            System.out.println(i);
//        }
//    for(long i = 100; i > -15; i-=5){
//        System.out.println(i);
//        }
//    for(long i = 2; i<100000; i*=i){
//        System.out.println(i);
//    }

//    int i = 0;
//    do {
//        System.out.println(i);
//        if( i % 3==0) {
//            System.out.println("Fizz");
//        }if (i % 5==0) {
//            System.out.println("Buzz");
//        }
//    }while(i<=100);{

//        }
//    String word1 = "Fizz";
//    String word2 = "Buzz";
//
//    for (int i = 1; i<=100; i++) {
//        if (i % 3 == 0 && i % 5 == 0) {
//            System.out.println(word1 + word2);
//        } else if (i % 3 == 0) {
//            System.out.println(word1);
//        } else if (i % 5==0){
//            System.out.println(word2);
//        }else{
//            System.out.println(i);
//        }
//
//    }
        Scanner scanner = new Scanner(System.in);
        System.out.print("What Number would you like to go up to?");
        int userInput = scanner.nextInt();
        System.out.println("");
        System.out.println("Here is your table!");
        System.out.println("");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for(int i = 1; i<= userInput; i++){
            System.out.printf("%-7d| %-8d| %-5d%n", i, i*i, i*i*i);
        }
    }
}

