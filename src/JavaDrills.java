import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

//work in progress
public class JavaDrills {
//    public static String flipOuterCase(String str){
//        char[] chars = str.toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            char c = chars[i];
//            if (Character.isUpperCase(c)) {
//                chars[i] = Character.toLowerCase(c);
//            }
//            else if (Character.isLowerCase(c))
//            {
//                chars[i] = Character.toUpperCase(c);
//            }
//        }
//        return new String(chars);
//    }
//    public static void main(String[] args) {
//        System.out.println(flipOuterCase("Cat"));
//
//    }

//    ================================= WARM UP
//    In `codeup-java-exercises`, in `JavaDrills`:
//    Create a static method, returnTotalDifference, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.
//            returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)); // returns 9
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)); // returns 3
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)); // returns 2
//public static int returnTotalDifference(List<Integer> integerListOne, List<Integer> integerListTwo){
//    int sumOfOne = 0;
//    int sumOfTwo = 0;
//
//    for (int integer : integerListOne){
//      sumOfOne += integer;
//    }
//    for (int integer: integerListTwo){
//        sumOfTwo += integer;
//    }
//    return sumOfOne - sumOfTwo;
//}
//
//
//    public static void main(String[] args) {
//        System.out.println(returnTotalDifference(Arrays.asList(10,2,3),Arrays.asList(1,2,3)));
//    }

    public static String flipInnerCase(String str){
        char[] chars = str.toCharArray();

        for (int i = 1; i < chars.length-1; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        System.out.println(flipInnerCase("TerMInAToR"));

    }
}
