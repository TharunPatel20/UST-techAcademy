package hateoas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hateoas.model.Book;
import hateoas.service.BookService;

@RestController
@RequestMapping("/api/book")
class BookController { 
	@Autowired
	BookService service;
// Add methods for handling GET, POST, PUT, DELETE requests
	
	@PutMapping("/add")
	public Book addBook(Book book) {
		return service.addBook(book);
	}
	
	@PostMapping("/update")
	public Book updateBook( Book book) {
		return service.updateBook(book);
	}
	
	@DeleteMapping("/{Id}")
	public void deleteBook(Long Id) {
		
	}
	
	@GetMapping("/all")
	public List<Book> getAllBooks() {
		return null;
	}
	
	@GetMapping("/{Id}")
	public Book getBookById(@RequestParam Long Id) {
		return null;
	}

	
// Implement HATEOAS links for navigating between resources 
	private void addHateoasLinks(Book book) { 
	   // Add links for self, update, and delete actions 
	} 
	
	private void addHateoasLinks(List<Book> books) { 
	   // Add links for each book in the list 
	} 
} 
