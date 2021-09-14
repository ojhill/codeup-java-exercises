import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


        Person[] people = {
                new Person("Anthony"),
                new Person("Shelby"),
                new Person("Kristen")
        };


        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

        Person OJ = new Person(("OJ"));
        people = addPerson(people, OJ);

        for (Person person : people) {
            System.out.println(person.getName());
        }



    }

    public static Person[] addPerson (Person[]arr, Person addPerson){
        Person[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[arr.length] = addPerson;
        return newArray;
    }

}
