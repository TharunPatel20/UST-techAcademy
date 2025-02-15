package relationship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import relationship.model.Student;
import relationship.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //localhost:2002/student/1
    @PostMapping("/{departmentId}")
    public Student createStudent(@RequestBody Student student, @PathVariable long departmentId) {
        return studentService.saveStudent(departmentId, student);
    }
    //localhost:2002/student/all
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    //localhost:2002/student/1
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    //localhost:2002/student/1
    @PutMapping(value = "/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable Long id, @RequestBody Student student) {
         studentService.updateStudent(id, student);
//         return ResponseEntity.ok("{\"message\": \"Student updated successfully\"}");
         return ResponseEntity.ok("");
         
    }
    
    //localhost:2002/student/sort-asc
    @GetMapping("sort-age-asc")
    public ResponseEntity<List<Student>> sortAgeInAsc(){
    	return new ResponseEntity<> (studentService.sortStudentAgeInAsc(), HttpStatus.OK);
    }
    //localhost:2002/student/sort-desc
    @GetMapping("sort-age-desc")
    public ResponseEntity<List<Student>> sortAgeInDesc(){
    	return new ResponseEntity<> (studentService.sortStudentAgeInDesc(), HttpStatus.OK);
    }
    //localhost:2002/student/1
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.deleteStudentById(id) );
    }
    
  //localhost:2002/student?name=user
    @GetMapping("/by-name")
    public ResponseEntity<List<Student>> getStudentByName(@RequestParam String name){
    	return new ResponseEntity<> (studentService.getStudentByName(name), HttpStatus.OK);
    }
  //localhost:2002/student/by-email?email=user
    @GetMapping("/by-email")
    public ResponseEntity<List<Student>> getStudentByEmail(@RequestParam String email){
    	return new ResponseEntity<> (studentService.getStudentByEmail(email), HttpStatus.OK);
    }
    
    
  //localhost:2002/student
    @GetMapping("/marks/{minMarks}")
    public ResponseEntity<List<Student>> getStudentByEmail(@PathVariable int minMarks){
    	return new ResponseEntity<> (studentService.getStudentByMarksGreaterThan(minMarks), HttpStatus.OK);
    }
    
}
