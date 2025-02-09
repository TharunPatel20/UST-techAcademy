package collegeDetails;

import java.util.Date;

public class Teaching_Staff {
    private int teacherId;
    private String teacherName;
    private String teacherQualification;
    private Date teacherJoiningDate;
    private String departmentCode;

    public Teaching_Staff(int teacherId, String teacherName, String teacherQualification, Date teacherJoiningDate, String departmentCode) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherQualification = teacherQualification;
        this.teacherJoiningDate = teacherJoiningDate;
        this.departmentCode = departmentCode;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getTeacherQualification() {
        return teacherQualification;
    }

    public Date getTeacherJoiningDate() {
        return teacherJoiningDate;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }
}
