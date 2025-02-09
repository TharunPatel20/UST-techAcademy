package collegeDetails;

public class Student_Marks {
    private String studentId;
    private int semesterNumber;
    private int[] marksIn4Subjects;

    public Student_Marks(String studentId, int semesterNumber, int[] marksIn4Subjects) {
        this.studentId = studentId;
        this.semesterNumber = semesterNumber;
        this.marksIn4Subjects = marksIn4Subjects;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getSemesterNumber() {
        return semesterNumber;
    }

    public int calculateTotal() {
        int total = 0;
        for (int mark : marksIn4Subjects) {
            total += mark;
        }
        return total;
    }

    public double calculateAverage() {
        return calculateTotal() / 4.0;
    }
}
