package relationship.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import relationship.model.Student;
;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findByName(String name);

//	@Query("SELECT s FROM Student s WHERE s.marks > :marks")
	List<Student> findByMarksGreaterThan(int marks);

	
//	@Query("SELECT s FROM Student ORDER  by s.age ASC")
	List<Student> findAllByOrderByAgeAsc();
	
//	@Query("SELECT s FROM Student ORDER  by s.age DESC")
	List<Student> findAllByOrderByAgeDesc();

	List<Student> findByEmail(String email);
}

