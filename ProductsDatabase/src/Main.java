import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main extends Products{

	public static void main(String[] args) {
	
		Scanner scanner= new Scanner(System.in); //Standard input system
		
		String jdbcURL ="jdbc:mysql://database-2.cbi7cswaaxew.us-west-1.rds.amazonaws.com/sampledb";
		String dbusername= "admin";
		String dbpassword = "test1234";
		
		Statement statement; 
		
		//Connects to the Database
		
		//Connection connection = DriverManager.getConnection(jdbcURL, dbusername, dbpassword);
		
	try {
			
			Connection connection = DriverManager.getConnection(jdbcURL, dbusername, dbpassword);
			
			if( connection != null) {
				
				
				System.out.println("Connected to the DataBase");
				
				
				//Visual 
				System.out.println("                  JAVA JDBC Assignment  ");
				System.out.println("=======================++++++++++++++===========================");
				System.out.println();
				System.out.println("Hello, Welcome to the Products Database.");
				
				
				Products Products = new Products();
		
				//Options for User to do
				System.out.println("If you'd like to... ");
				System.out.println();
				System.out.println("1. Add a Product- type 1.");
				System.out.println("2. Look at all the Products- type 2.");
				System.out.println("3. Update Products from the Database- type 3.");
				System.out.println("4. Delete Items from the Database - type 4.");
				System.out.println("5. Exit out of the Program - type 5.");
				
				//Do while loop for User to use endlessly
				do 
				{
					int num = scanner.nextInt(); //user inputs number 1-4
					System.out.println();
				
				   	switch(num) 
				      {
				          //switch method to switch from actions
				         case 1: 
				        	    
				        	   String sql =  Products.Add(); // adds to the database
				        	    
				        	    
				        	    Statement product = connection.createStatement();
				        	    
				        	    int rows = product.executeUpdate(sql);
				        	    
				        	    if( rows > 0) {
				        	    	
				        	    	System.out.print("The user's information has been updated");
				        	    }
				              
				        	    break;
					
				          case 2: 
					
				         	    String read = Products.Read(); // reads off of the database
				         	    Statement Read = connection.createStatement();
				         	    ResultSet result = Read.executeQuery(read);
				         	    
				         	    while(result.next()) {
				         	    	
				         	    	String ProductID= result.getString(1);
				         	    	String Product= result.getString(2);
				         	    	String Price = result.getString(3);
				         	    	String Description = result.getString(4);
				         	    	String Quantity = result.getString(5);
				         	    	
				         	    	System.out.println("=========================================");
				         	    	System.out.println(ProductID + ":Product Name: "+ Product + "  Price: $" + Price 
				         	    			+ "0" + "   Description: " + Description + "   Quantity: " + Quantity);
				         	    	
				         	    }
				         	  
				        	    break;
					
				          case 3: 
					
				        	    String update = Products.Update(); // updates the database
				        	    
				        	    Statement Update = connection.createStatement();
				        	    
				        	    int check = Update.executeUpdate(update);
				        	    
				        	    if( check > 0) {
				        	    	
				        	    	System.out.println("The user's Information has been Updated");
				        	    	
				        	    }
				        	    
				        	    break;
				
				          case 4: 
				        	  
				        	  	String del = Products.Delete(); // deletes from the database
				        	     
				        	  	String Del= "DELETE FROM Products WHERE productName=?";
				        	  	
				        	    PreparedStatement delete = connection.prepareStatement(Del);
				        	    delete.setString(1, del);
				        	    
				        	    int Rows = delete.executeUpdate();
				        	    
                                if( Rows > 0) {
				        	    	
				        	    	System.out.print("The Product has been deleted.");
				        	    }
				        	  	
				        	  	break;
				        	  	
				          case 5: 
				      
				        	    connection.close();
				        	    System.out.println("Connection is Closed.");
				        	    System.out.println("Thank You for using the Products Database. Have a Good Day!"); //says farewell to customer
				        	    return;
				        }
				   	
				} while(!scanner.equals("5")); //if user inputs exit or 5, get out of loop
				
			
			
			//connection.close();
			}
			
	     }catch (SQLException ex) {
			ex.printStackTrace();
	     }
	

	

		
	     
		

	}

}
	