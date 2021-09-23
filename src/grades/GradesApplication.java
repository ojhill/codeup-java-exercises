package grades;

import java.util.HashMap;
import java.util.Scanner;

import grades.Student;
public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student OJ = new Student("OJ");
        Student Kyla = new Student("Kyla");
        Student Byron = new Student("Byron");
        Student Kendra = new Student("Kendra");
        OJ.addGrade(80);
        OJ.addGrade(70);
        OJ.addGrade(60);
        OJ.addGrade(70);

        Kyla.addGrade(90);
        Kyla.addGrade(80);
        Kyla.addGrade(90);
        Kyla.addGrade(100);

        Byron.addGrade(50);
        Byron.addGrade(80);
        Byron.addGrade(90);
        Byron.addGrade(100);

        Kendra.addGrade(50);
        Kendra.addGrade(80);
        Kendra.addGrade(90);
        Kendra.addGrade(100);

//        System.out.println(OJ.getGradeAverage());
//        System.out.println(Kyla.getGradeAverage());
//        System.out.println(Byron.getGradeAverage());
//        System.out.println(Kendra.getGradeAverage());

        students.put("ojhill98", OJ);
        students.put("mcbubbleliciousfisheyes", Kyla);
        students.put("stealthkilla11", Byron);
        students.put("lilbawse09", Kendra);

        infoPrompt(students);
    }
        public static void infoPrompt(HashMap<String,Student> students) {

            for (String userName : students.keySet()) {
                System.out.println(userName);
            }
            System.out.println("Which student would you like more info on?");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();

            try{
                Student selectedStudent = students.get(input);
                System.out.printf("The student %s has a grade average of %.2f\n", selectedStudent.getName(), selectedStudent.getGradeAverage());
            } catch (Exception e){
                System.out.println("Invalid Student/Username");
                infoPrompt(students);
            }

            System.out.println("Would you like to continue y or no?");
            input = scanner.next();
            if (input.equalsIgnoreCase("y")) {
                infoPrompt(students);
            }
        }
    }

