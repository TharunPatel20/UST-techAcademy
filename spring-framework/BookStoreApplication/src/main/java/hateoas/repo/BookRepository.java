package hateoas.repo;

//Implement a BookRepository class for managing book data 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hateoas.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}





