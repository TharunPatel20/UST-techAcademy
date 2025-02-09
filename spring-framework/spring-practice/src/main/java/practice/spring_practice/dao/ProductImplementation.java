package practice.spring_practice.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import practice.spring_practice.pojo.Product;

@Repository
public class ProductImplementation {
	
	List<Product> products;
	public ProductImplementation() {
		products = new ArrayList<>();
		products.add(new Product(101,"laptop", 80000.00, 4.3 ," "));
		products.add(new Product(102,"mobile", 20000.00, 3.9 ," "));
		products.add(new Product(103,"mouse" , 2000.00 , 3.5 ," "));
		products.add(new Product(104,"tablet", 15000.00, 3.2 ," "));
		
	}

	public List<Product> fetchAllProducts() {
		
		return products;
	}

	public List<Product> fetchById(int id) {
		List<Product> list = new ArrayList<>();
		for (Product p : products) {
		    if (p.getProductId() == id) {
		        list.add(p);
		    }
		}
		return  list;
	}

	public void addProduct(Product product) {
		products.add(product);
		
		
	}

	public void deleteProduct(int id) {
		products.removeIf(p->p.getProductId() == id);
//		products = products.stream().filter(p->id !=p.getProductId()).collect(Collectors.toCollection(ArrayList::new));
		
	}

	public void updateProduct(Product updateProduct) {
		int id=0;
		for (Product p : products) {
		    if (p.getProductId() == updateProduct.getProductId()) break; 
		    id++;
		}
		products.set(id,updateProduct);
		
	}

}
