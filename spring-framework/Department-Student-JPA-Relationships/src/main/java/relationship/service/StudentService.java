package relationship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import relationship.model.Department;
import relationship.model.Student;
import relationship.repository.DepartmentRepository;
import relationship.repository.StudentRepository;
import java.util.List;


@Service
public class StudentService {

	@Autowired
	private StudentRepository  studentRepository ; //student: name,marks, department, email
	@Autowired
	private DepartmentRepository departmentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Transactional
    public Student saveStudent(Long DeptId, Student student) {
    	
    	Department dep = departmentRepository.findById(DeptId).orElseThrow(()->new EntityNotFoundException());
    		student.setDepartment(dep);
    		
    		return studentRepository.save(student);
    	}

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student with ID " + id + " not found"));
    }
    
    public List<Student> getStudentByName(String name) {
        return studentRepository.findByName(name);  // .orElseThrow(() -> new RuntimeException("Student with name " + name + " not found"));
    }
    
    public List<Student> getStudentByEmail(String email) {
        return studentRepository.findByEmail(email); //.orElseThrow(() -> new RuntimeException("Student with email " + email + " not found"));
    }

    public List<Student> getStudentByMarksGreaterThan(int marks) {
        return studentRepository.findByMarksGreaterThan(marks); //.orElseThrow(() -> new RuntimeException("Student with marks > " +marks  + " not found"));
    }
      
    public void updateStudent(Long id, Student student) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        
        if (student.getName() != null) existingStudent.setName(student.getName());
        if (student.getEmail() != null) existingStudent.setEmail(student.getEmail());
        if (student.getAge() != 0) existingStudent.setAge(student.getAge());
        if (student.getDepartment() != null) existingStudent.setDepartment(student.getDepartment());
        
        studentRepository.save(existingStudent);
    }

    
    public List<Student> sortStudentAgeInAsc(){
		return studentRepository.findAllByOrderByAgeAsc(); 
	}
	
    public List<Student> sortStudentAgeInDesc(){
		return studentRepository.findAllByOrderByAgeDesc(); 
	}
        
    public String deleteStudentById(Long id) {
        if (studentRepository.existsById(id)) {
        studentRepository.deleteById(id);
        } else {
            return "Student with ID " + id + " not found";
        }
		return "Student with ID " + id + "deleted successfully";
    }
}
