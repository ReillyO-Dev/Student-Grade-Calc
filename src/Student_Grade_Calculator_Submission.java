
import java.util.Scanner; //Imports a Scanner

//Defining the Classes for Grade Calculator
//Defining the Class for Students and what Attributes it contains
class Students{ 
	String Name;
	int Student_ID;
	String Courses_Enrolled;

	public Students(String Name, int Student_ID, String Courses_Enrolled) {
		this.Name = Name;
		this.Student_ID = Student_ID;
		this.Courses_Enrolled = Courses_Enrolled;
	}
}

//Defining the Class for Courses that people can be enrolled on
class Courses{
	String Course_Name;
	int Course_ID;
	String Course_Leader;	
	String Enrolled_Student;
	double Grade;

	public Courses(String Course_Name, int Course_ID, String Course_Leader, String Enrolled_Student, double Grade ){
		this.Course_Name = Course_Name;
		this.Course_ID = Course_ID;
		this.Course_Leader = Course_Leader;
		this.Enrolled_Student = Enrolled_Student;
		this.Grade = Grade;
	}
}

//Defines the class for the Grades
class Grades{
	double Grade;
	int Student_ID;
	int Course_ID;
	
	public Grades(double Grade, int Student_ID, int Course_ID){
		this.Course_ID = Course_ID;
		this.Grade = Grade;
		this.Student_ID = Student_ID;
	}
}


public class Student_Grade_Classes {
	public static void main(String[] args) {
		//Data Input for the Classes
		Students Student_1 = new Students("Owen", 26197766, "Programming_2, Professional_Practice, Systems_Architecture");
		Courses Programming_2 = new Courses ("Programming_2", 1703, "Saad", "Owen", 90);
		Courses Professional_Practice = new Courses ("Professsional_Practice", 1704, "Lindsey", "Owen", 87);
		Courses Systems_Architecture = new Courses ("Systems_Architecture", 1701, "Husnain", "Owen", 65);
		
		//Testing Outputs
		//System.out.print("Student 1. Name: " + Student_1.Name + ", ID: " + Student_1.Student_ID + ", Enrolled Courses: " + Student_1.Courses_Enrolled + "\n");
		//System.out.println("Course 1. Course Name: " + Programming_2.Course_Name + ", Course ID: " + Programming_2.Course_ID + ", Course Leader: " + Programming_2.Course_Leader + ", Students Enrolled: " + Programming_2.Enrolled_Student + ", Grade: " + Programming_2.Grade + "\n");
		//System.out.println("Course 1. Course Name: " + Professional_Practice.Course_Name + ", Course ID: " + Professional_Practice.Course_ID + ", Course Leader: " + Professional_Practice.Course_Leader + ", Students Enrolled: " + Professional_Practice.Enrolled_Student + ", Grade: " + Professional_Practice.Grade + "\n");
		//System.out.println("Course 1. Course Name: " + Systems_Architecture.Course_Name + ", Course ID: " + Systems_Architecture.Course_ID + ", Course Leader: " + Systems_Architecture.Course_Leader + ", Students Enrolled: " + Systems_Architecture.Enrolled_Student + ", Grade: " + Systems_Architecture.Grade + "\n");
		Scanner scanner = new Scanner(System.in); //Opens the Scanner for Data Input
		int Selection = 0;
		while (Selection != 4 ) { //Creates a while loop to allow multiple re-entries
		System.out.print("Would you like to see \n 1.All PreExisting Data \n 2.Add a Student \n 3.Add a Course \n 4.Exit \n");
		Selection = scanner.nextInt();
		if (Selection == 1) { //Will Output all Pre-Made data
			System.out.println("Outputting Data: \n");
			System.out.println("Student 1. Name: " + Student_1.Name + ", ID: " + Student_1.Student_ID + ", Enrolled Courses: " + Student_1.Courses_Enrolled );
			System.out.println("Course 1. Course Name: " + Programming_2.Course_Name + ", Course ID: " + Programming_2.Course_ID + ", Course Leader: " + Programming_2.Course_Leader + ", Students Enrolled: " + Programming_2.Enrolled_Student + ", Grade: " + Programming_2.Grade );
			System.out.println("Course 2. Course Name: " + Professional_Practice.Course_Name + ", Course ID: " + Professional_Practice.Course_ID + ", Course Leader: " + Professional_Practice.Course_Leader + ", Students Enrolled: " + Professional_Practice.Enrolled_Student + ", Grade: " + Professional_Practice.Grade );
			System.out.println("Course 3. Course Name: " + Systems_Architecture.Course_Name + ", Course ID: " + Systems_Architecture.Course_ID + ", Course Leader: " + Systems_Architecture.Course_Leader + ", Students Enrolled: " + Systems_Architecture.Enrolled_Student + ", Grade: " + Systems_Architecture.Grade);
			
		}
		if (Selection == 2) { //Allows the user to add more Students
			scanner.nextLine();
			System.out.print("Name of Student: ");
			String New_Name = scanner.nextLine();
			//scanner.nextLine();
			System.out.print("Student ID: ");
			int New_Student_ID = scanner.nextInt();
			scanner.nextLine();
			System.out.print("What is their 1st of 3 Courses if less than 3 type N/A");
			String New_Course_1 = scanner.nextLine();
			System.out.print("What is their 2nd of 3 Courses if less than 3 type N/A");
			String New_Course_2 = scanner.nextLine();
			System.out.print("What is their Final Course if they dont have a 3rd course type N/A");
			String New_Course_3 = scanner.nextLine();
			Students Student_2 = new Students(New_Name, New_Student_ID, New_Course_1 + New_Course_2 + New_Course_3);
			System.out.println("New Student. Name: " + Student_2.Name + ", ID: " + Student_2.Student_ID + ", Enrolled Courses: " + Student_2.Courses_Enrolled );
			
		}
		if (Selection == 3) { //Allows the user to add another course
			//scanner.nextLine();
			System.out.println("What is the name of the course: ");
			String New_Course_Name = scanner.nextLine();
			scanner.nextLine();
			System.out.println("What is the ID Number of the course: ");
			int New_Course_ID = scanner.nextInt();
			scanner.nextLine();
			System.out.println("What is the name of the Course's Leader: ");
			String New_Course_Leader = scanner.nextLine();
			System.out.println("What is the name of person enrolling on the course: ");
			String Enrolled_name = scanner.nextLine();
			System.out.print("What is the Grade of the person on the course: ");
			double New_Grade = scanner.nextDouble();
			Courses New_Course = new Courses (New_Course_Name, New_Course_ID, New_Course_Leader, Enrolled_name, New_Grade);
			System.out.print("New Course. Course Name: " + New_Course.Course_Name + ", Course ID: " + New_Course.Course_ID + ", Course Leader: " + New_Course.Course_Leader + ", Students Enrolled: " + New_Course.Enrolled_Student + ", Grade: " + New_Course.Grade );
			System.out.print("\n");
		}
		}
	}
	}
	

