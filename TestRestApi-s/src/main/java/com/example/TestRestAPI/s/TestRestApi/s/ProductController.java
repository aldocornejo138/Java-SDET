package com.example.TestRestAPI.s.TestRestApi.s;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class ProductController {
	
	testDAO productDAO = new testDAO();
	
	double Total; 
	
	int Items; 
	

	
	@GetMapping(value = "/welcome")
	public String getMessage(){
		
		String message = " Hello";
		
		return message;
	}
	
	
	@PostMapping (value = "/addProduct")
	public String add(@RequestBody Product product) {
		
		
	

		Total = Total + product.getPrice(); 
		Items = Items + 1;
		productDAO.addNewProduct(product);
		
		
		return "New Product was Added!!" + "\n"
				+ "Total Items of Cart: " + Items + "\n"
				+ "Total Amount of Cart: $" + Total;
		
		
	}
	
	@GetMapping(value = "/products")
	public List<Product>getProducts(){
		
		return productDAO.getProducts();
	
	}
	
	@DeleteMapping(value = "/delete/{description}")
	public String delete(@PathVariable String description) {
		
		
		Total = Total - productDAO.findByDescription(description);
		Items = Items -1;
		productDAO.deleteProduct(description);
	    
		
		return "Product has been Deleted with Description: " + description + "\n"
				+ "Total Items of Cart: " + Items + "\n"
				+ "Total Amount of Cart: $" + Total;
		
	}
	
	@PutMapping(value = "/update/{description}")
	public String update(@PathVariable String description, @RequestBody Product product) {
		
		String string = productDAO.updateProduct(description, product);
		
		return string;
	}
	
	@GetMapping(value= "/totalAmount")
	public String totalAmount(){
	
		return "Total Items of Cart: " + Items + "\n"
				+ "Total Amount of Cart: $" + Total;
		
	}

}
