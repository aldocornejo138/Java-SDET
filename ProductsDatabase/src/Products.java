import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.SQLException;

public class Products {
	
	private String productName;
	private double productPrice;
	private String productDescription;
	private int productQuantity; 
	
	Scanner sc= new Scanner(System.in);
	
	
	
	public Products() {
		
		
	
	}
	
	//SETTERS AND GETTERS
	
		//Gets the product Name
		public String getProductName()
		{
			return productName;
		}
		
		//sets the Product name
		public void setProductName(String name) {
			
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
		public String Add() {
			
			
			String name;
			double price;
			String description;
			int quantity; 
			
			System.out.println("What is the name of your Product?");
			name = sc.nextLine();
			this.setProductName(name);
			
			System.out.println("What is the price of your Product?");
			price = sc.nextDouble();
			this.setProductPrice(price);
			
			System.out.println();
			System.out.println("What is the Description of your Product?");
			description= sc.next();
			this.setProductDescription(description);
			
			System.out.println();
			System.out.println("What is the Quantity of this Product?");
			quantity = sc.nextInt();
			this.setProductQuantity(quantity);
			System.out.println();
			
			String sql = "INSERT INTO Products (productName, productPrice, productDescription, productQuantity) "
					+ " VALUES ('" + this.getProductName() + "', '" + this.getProductPrice() +"', '" 
					+ this.getProductDescription() + "', '" + this.getProductQuantity() + "')";
			
			return sql;
			
			
		}
		
		//Function reads Products off of the DataBase
		public String Read() {
			
			//String read;
			
			//System.out.println("What Product do you want to get the details about?");
			//read = sc.nextLine();
			
			String Read = "SELECT * FROM Products";
			
			return Read; 
			
		}
		
		//Function Updates Products from the Database
		public String Update() {
			
			int Update;
			String Product;
			
			System.out.println("What Product would you like to update?");
			Product = sc.nextLine();
			System.out.println("What do you want the new quantity to be? ");
			Update = sc.nextInt();
			
			String update = "UPDATE Products SET productQuantity = '" + Update + "' WHERE productName = '" + Product + "'";
			
			return update; 
			
			
		}
		
		//Function Deletes Products from the Database
		public String Delete() {
			
			String delete;
			
			System.out.println("What Product would you like to Delete?");
			delete = sc.nextLine();
			
			//String deleteString = "DELETE FROM Products WHERE productName = "+ delete;
			
			return delete;
			
			
		}
		
		
		
		
		
}