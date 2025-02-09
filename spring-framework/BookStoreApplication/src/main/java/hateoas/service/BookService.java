package hateoas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hateoas.model.Book;
import hateoas.repo.BookRepository;

@Service
public class BookService {
	BookRepository repo;
	public Book addBook(Book book) {
		repo.save(book);
		return book;
	}
	public Book updateBook(Book book) {
		return book;
	}
	
	public void deleteBook(Long Id) {
		
	}
	
	public List<Book> getAllBooks() {
		return null;
	}
	
	public Book getBookById(Long Id) {
		return null;
	}
}
