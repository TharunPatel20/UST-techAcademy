package arrays;

public class StudentGrades {

	public static void main(String[] args) {
		
		int studentCount =10;
		//assuming 10 student grades
		int[] grades = new int[studentCount];
		// grades range 0-100
		grades[0] = 69; // student-1 grade
		grades[1] = 92; // student-2 grade
		grades[2] = 80; // student-3 grade
		grades[3] = 70; // student-4 grade
		grades[4] = 60; // student-5 grade
		grades[5] = 39; // student-6 grade
		grades[6] = 35; // student-7 grade
		grades[7] = 34; // student-8 grade
		grades[8] = 30; // student-9 grade
		grades[9] = 40; // student-10 grade
		
		StudentGrades  studentGrades = new StudentGrades();

		System.out.println("Average marks: "+studentGrades.averageMarks(grades));
		System.out.println("low marks: "+studentGrades.lowMarks(grades));
		System.out.println("high marks: "+studentGrades.highMarks(grades));
		int passStudents = studentGrades.passCount(grades);
		System.out.println("students passed: "+passStudents+"\nPassed Percent: "+(passStudents%studentCount )*10 + "%");


	}


	private int passCount(int[] grades) {
		int passCount = 0;
		for(int x:grades) {
			if(x>34)passCount++;
		}
		return passCount;
		
	}

	
	private int highMarks(int[] grades) {
		int high =0;
		for(int x:grades) {
			high  = Math.max(x, high);
		}
		return high;
	}
	
	
	private int lowMarks(int[] grades) {
		int low = Integer.MAX_VALUE;
		for(int x:grades) {
			low  = Math.min(x, low);
		}
		return low;
	}

	private int averageMarks(int[] grades) {
		int avg=0;
		for(int x:grades) {
			avg +=x;
		}
		return avg/grades.length;
	}

}
