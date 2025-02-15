package relationship.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "department")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Department implements Serializable{

	private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Changed to IDENTITY for MySQL auto-increment
    private Long departmentId;
    
    private String location;
    private String name;

    @OneToMany(
        mappedBy = "department",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    @JsonManagedReference
    private List<Student> students;
}
