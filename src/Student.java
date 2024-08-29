import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses ;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int ID = 1000; //Belongs to the class not to the object

    //Constructor prompts to enter students name and year
    public Student (){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the first name:");
        this.firstName = in.nextLine();

        System.out.println("Enter the last name:");
        this.lastName = in.nextLine();

        System.out.println("1 - First Year\n2 - Sophomore \n3 - Third year \n4 - Senior year\nEnter the class/grade year:");
        this.gradeYear = in.nextInt();

        //Create studentId
        setStudentID();

        System.out.println( firstName + " " + lastName  + " " + "Year= " + gradeYear + " Student Id = " + studentID);


    }

    //Generate an Id
    private void  setStudentID(){
        //Grade level + id
        ID++;
        this.studentID = gradeYear + " " + ID;
    }

    //Enroll in courses
    public void enroll() {
        //Get inside a loop , user hits 0 when done
        do {
            System.out.print("Enter Course to enroll (Press Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals( "Q") && !course.equals("q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);


    }

    //View Balance
    public void viewBalance () {
        System.out.println("Your Balance is : $" + tuitionBalance);
    }

    //Pay tuition
    public void payTuition () {
        viewBalance();
        System.out.print("Enter the amount of tuition fees to pay: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance =  payment - tuitionBalance;
        System.out.println("Thank you for your payment of : " + payment);
        viewBalance();
    }

    //Show status
    public String toString() {
        return "Name:" + firstName +" " +lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\n Courses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
