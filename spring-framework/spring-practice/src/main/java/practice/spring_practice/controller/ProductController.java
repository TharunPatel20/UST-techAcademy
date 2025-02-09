package practice.spring_practice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;
import practice.spring_practice.pojo.Product;
import practice.spring_practice.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/")
	public ResponseEntity<String> allURLs(){
		List<String> list = new ArrayList<>();
		String response = "EndPoints are:\n"+ 
				"/all -> (get),\n" +
				"/{id} -> (get),\n"+
				"/{id} -> (delete),\n"+
				"/add -> (put), \n"+
				"/update -> (post),\n";
		
		return new ResponseEntity<String>(response,HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/all")
	// http://localhost:1001/api/products
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	// http://localhost:1001/api/product/101
	@GetMapping("/{Id}")
	public List<Product> getProductById(@PathVariable int Id){
		return productService.getProductById(Id);
	}
	
	// http://localhost:1001/api/product/add
	@PutMapping("/add")
	public void addProducts(@RequestBody Product product){
		System.out.println(product);
		if(product !=null ) productService.addProduct( product);
		else System.out.println("RequestBody error");
	}
	
	//http://localhost:1001/api/product
	@PostMapping("/update")
	public void updateProducts(@RequestBody Product product){
		 productService.updateProduct( product);
	}
	
	//http://localhost:1001/api/product/101
	@DeleteMapping("/{Id}")
	public void deleteProductById(@PathVariable int Id){
		productService.deleteProductById(Id);
	}
}
