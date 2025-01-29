package singletonPattern;

public class SingletonMain {

	public static void main(String[] args) {
		CourseData data = CourseData.getInstance();
		Course course = new Course();
		
		course.setCourseId(4000);
		
		data.updateCourse(course);
		data.getAllCourses();
		data.deleteCourse(400000);
		
		System.out.printf("\t After Deleting\n");
		data.getAllCourses();

		Course updateCourse = new Course();
		
		updateCourse.setCourseId(101);
		updateCourse.setCourseFee(20000.00);
		System.out.println("update course with id 101");
		data.updateCourse(updateCourse);
		
		data.getAllCourses();
	}

}
