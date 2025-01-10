package collegeDetails;

import java.util.Date;

public class CollegeMain {

	public static void main(String[] args) {
		
		//Departments
		Department cse = new Department("CSE", "Computer Science","Block-A",2000);
		Department ece = new Department("ECE", "Electronics","Block-B",2001);
//		Department mech = new Department("MECH", "Mechanical","Block-C",1999);
		
		//Teachers
		Teaching_Staff teacher1 = new Teaching_Staff(1, "Alice", "M.Tech", new Date(),cse.getDepartmentCode());
	    Teaching_Staff teacher2 = new Teaching_Staff(2, "Bob", "Ph.D.", new Date(), ece.getDepartmentCode());

	    // Students
        Student_Details student1 = new Student_Details("S1", "John", "1234567890", "john@example.com", cse.getDepartmentCode(), 1);
        Student_Details student2 = new Student_Details("S2", "Jane", "9876543210", "jane@example.com", ece.getDepartmentCode(), 2);

	    // Marks
        Student_Marks marks1 = new Student_Marks(student1.getStudentId(), 1, new int[]{80, 85, 90, 75});
        Student_Marks marks2 = new Student_Marks(student2.getStudentId(), 1, new int[]{70, 75, 80, 65});

        // Display Student Details and Marks
        displayStudentMarks(student1, marks1);
        displayStudentMarks(student2, marks2);
    }

    public static void displayStudentMarks(Student_Details student, Student_Marks marks) {
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getStudentName());
        System.out.println("Department: " + student.getDepartmentCode());
        System.out.println("Total Marks: " + marks.calculateTotal());
        System.out.println("Average Marks: " + marks.calculateAverage());
        System.out.println("-----------------------");
    }
}
		

