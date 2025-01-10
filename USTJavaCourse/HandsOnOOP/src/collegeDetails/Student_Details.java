package collegeDetails;

public class Student_Details {
    private String studentId;
    private String studentName;
    private String studentMobileNo;
    private String studentEmailId;
    private String departmentCode;
    private int teacherCode;

    public Student_Details(String studentId, String studentName, String studentMobileNo, String studentEmailId, String departmentCode, int teacherCode) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMobileNo = studentMobileNo;
        this.studentEmailId = studentEmailId;
        this.departmentCode = departmentCode;
        this.teacherCode = teacherCode;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentMobileNo() {
        return studentMobileNo;
    }

    public String getStudentEmailId() {
        return studentEmailId;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public int getTeacherCode() {
        return teacherCode;
    }
}
