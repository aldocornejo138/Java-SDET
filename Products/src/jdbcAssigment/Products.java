package jdbcAssigment;

public class Products {
	
	private String productName;
	private double productPrice;
	private String productDescription;
	private int productQuantity; 
	
	
	public Products() {
		
		
	
	}
	
	//SETTERS AND GETTERS
	
		//Gets the product Name
		public String getProductName()
		{
			return productName;
		}
		
		//sets the Product name
		public void setCustomerName(String name) {
			
			this.productName = name;
		}
		
		//gets Product Price
		public double getProductPrice() {
			
			return productPrice;
		}
		
		//Sets Product price
		public void setProductPrice( double price) {
			
			this.productPrice = price;
		}
		
		//Gets the product Description
		public String getProductDescription()
		{
			return productDescription;
		}
		
		//sets the Product Description
		public void setProductDescription(String description) {
			
			this.productDescription = description;
		}
		
		//gets Product Quantity
		public int getProductQuantity() {
			
			return productQuantity;
		}
		
		//Sets Product Quantity
		public void setProductQuantity( int quantity) {
			
			this.productQuantity = quantity;
		}
		
		
		
	
		//METHODS
	

		//Function adds Products to the Database
		public void Add() {
			
			
		}
		
		//Function reads Products off of the DataBase
		public void Read() {
			
			
			
			
		}
		
		//Function Updates Products from the Databae
		public void Update() {
			
			
		}
		
		//Function Deletes Products from the Database
		public void Delete() {
			
			
			
		}
		
		
		
		
		
}
