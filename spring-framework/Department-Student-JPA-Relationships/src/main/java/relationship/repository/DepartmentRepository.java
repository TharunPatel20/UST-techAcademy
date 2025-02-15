package relationship.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import relationship.model.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByName(String deptname);
	Department findByLocation(String location);
	
	@Query("SELECT d from Department d ORDER by d.name ASC")
	List<Department> findAllByOrderByNameAsc();
	
	
	@Query("SELECT d from Department d ORDER by d.name DESC")
	List<Department> findAllByOrderByNameDesc();
	
}

