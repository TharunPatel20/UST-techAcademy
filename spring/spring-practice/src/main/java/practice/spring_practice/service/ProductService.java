package practice.spring_practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practice.spring_practice.dao.ProductImplementation;
import practice.spring_practice.pojo.Product;


@Service
public class ProductService {

	@Autowired
	ProductImplementation productImp;
	
	public List<Product> getAllProducts() {
		
		return productImp.fetchAllProducts();
	}

	public List<Product> getProductById(int id) {
		
		return productImp.fetchById(id);
	}

	public void addProduct(Product product) {
		productImp.addProduct( product);	
	}

	public void deleteProductById(int id) {
		productImp.deleteProduct(id);
		
	}

	public void updateProduct(Product UpdateProduct) {
		productImp.updateProduct(UpdateProduct);
		
	}

}
