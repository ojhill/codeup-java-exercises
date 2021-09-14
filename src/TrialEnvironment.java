import java.util.Arrays;

public class TrialEnvironment {
//    public static void main(String[] args) {
//        int x = string;
//        System.out.println(x);
//    }
//
public static void main(String[] args) {
    double[] numbers={1,2,3,4,5};
    System.out.println(Arrays.toString(numbers));
    double total = 0;
    for( double number : numbers){
        total += number;
        System.out.println(total);
    }
}
}
