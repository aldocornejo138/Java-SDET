package com.example.TestRestAPI.s.TestRestApi.s;

import java.util.ArrayList;

public class testDAO {
	
	private ArrayList<Product> Products =  new ArrayList(); 
	
	public void addNewProduct(Product product) {
		
		Products.add(product);
		}
	
	public ArrayList<Product> getProducts(){
		
		return Products;
	}
	
	public void deleteProduct(String description) {
		
		for( int i=0; i < Products.size(); i++) {
			
			Product temp = Products.get(i);
			String tempDescription = temp.getDescription();
			
			if( tempDescription.contentEquals(description)) {
				
				Products.remove(i);
			}
			
		}
		
		
	}
	
	public String updateProduct(String description, Product product) {
		

		
		for( int i=0 ; i < Products.size(); i++) {
			
			Product temp = Products.get(i);
			String tempDescription = temp.getDescription();
			
			if(tempDescription.equals(description)) {
				
				Products.set(i, product);
				
				String string= "UPDATE WAS SUCCESFUL!!";
				
				return string;
			}
			
		}
		
		String string= "UPDATE WAS NOT SUCCESSFUL!!";
		return string;
		
	}
	
	public double findByDescription(String description) {
		
		
		for( int i=0; i < Products.size(); i++) {
			
			Product temp = Products.get(i);
			String tempDescription = temp.getDescription();
			
			if( tempDescription.equals(description)) {
				
				Product total = Products.get(i);
		
				double Total = total.getPrice();
		
				return Total;
			}
			
		}
		
		return 0;
	}
		
	
	
	public int getSize(){
		
		return Products.size();
	}

}
