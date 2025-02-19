package relationship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import relationship.model.Department;
import relationship.repository.DepartmentRepository;


import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;
    
//    @Autowired
//    private DepartmentService departmentService;

//	localhost:2002/department/all
    @GetMapping("/all")
    public ResponseEntity<List<Department>> getAllDepartments() {
        return ResponseEntity.ok().body(departmentRepository.findAll());
    }
//	localhost:2002/department/1
    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
        return ResponseEntity.of(departmentRepository.findById(id));
    }
//	localhost:2002/department
    @PostMapping
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        Department savedDepartment = departmentRepository.save(department);
        return ResponseEntity.ok(savedDepartment);
    }
    
//    localhost:2002/department/name?name=abc
    @GetMapping("/name")
    public ResponseEntity<Department> findDepartmentByName(@RequestParam String name) {
    	return ResponseEntity.ok().body( departmentRepository.findByName(name));
    }
    
//	localhost:2002/department/sort-asc
    @GetMapping("sort-asc")
    public ResponseEntity<List<Department>> sortDepartmentsInAsc(){
    	return new ResponseEntity<> (departmentRepository.findAllByOrderByNameAsc(), HttpStatus.OK);
    }
//	localhost:2002/department/sort-desc
    @GetMapping("sort-desc")
    public ResponseEntity<List<Department>> sortDepartmentsInDesc(){
    	return new ResponseEntity<> (departmentRepository.findAllByOrderByNameDesc(), HttpStatus.OK);
    }
}
