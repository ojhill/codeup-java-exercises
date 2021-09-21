import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrialEnvironment {

    public void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<String>();
        try {
            String[] stringArray = sentence.split(" ");

            for (String word : stringArray) {
                wordArrayList.add(word);
            }
            List<String> shorterList = wordArrayList.subList(firstInt, secondInt);
            String newSentence = String.join(" ", shorterList);
            System.out.println(newSentence);
        }

    }


    //    public static void main(String[] args) {
////        String getIt;
//        try{
//            String testString = "This is a String";
//            System.out.println(testString.length());
//            System.out.println(testString.substring(-5));
//        }catch (IndexOutOfBoundsException ioobe){
//            System.out.println("Whoa, outta bounds bro");
//        }
//        int x = string;
//        System.out.println(x);
//    }
//
public static void main(String[] args) {
//    double[] numbers={1,2,3,4,5};
//    System.out.println(Arrays.toString(numbers));
//    double total = 0;
//    for( double number : numbers){
//        total += number;
//        System.out.println(total);
//    }

}
}
