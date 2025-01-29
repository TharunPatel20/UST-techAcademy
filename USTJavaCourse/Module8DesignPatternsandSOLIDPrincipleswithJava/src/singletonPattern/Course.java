package singletonPattern;


//Problem Statement: : Singleton Pattern
//Singleton: Ensures a class has only one instance and provides a global access point.
public class Course{
	
	private Integer courseId;
	private String courseName;
	private Double courseFee;
	private Integer duration;
	// getter/ setter & constructors
	
	
	
	public Integer getCourseId() {
		return courseId;
	}
	public Course(Integer courseId, String courseName, Double courseFee, Integer duration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.duration = duration;
	}
	public Course() {
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(Double courseFee) {
		this.courseFee = courseFee;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee
				+ ", duration=" + duration + "]";
	}
	
}

	