import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ask how many students to add
        System.out.println("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student [] students = new  Student[numOfStudents] ;

        //create n number of students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();

            //print all students
            //System.out.println(students[n].toString());
        }

        //show all students
        for (int i =0; i < students.length; i++){
            System.out.println(students[i]);
        }
    }
}