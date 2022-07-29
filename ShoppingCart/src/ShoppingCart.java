
public class ShoppingCart {

	//Attributes
		private double SubTotal = 0; 
		private double salesTax = 0; //set to 0 but will be 10% of sub total
		private int ProductQuantity= 0;
		private String cartName;
	
		
		//Constructor
		ShoppingCart(String cartName){
			this.cartName = cartName;
			System.out.println();
			System.out.println("=======================++++++++++++++===========================");
			System.out.println("Hi " + this.cartName + ", this is your personalized Shopping Cart!!");
			System.out.println();
		}
		
		
		
		//SETTERS and GETTERS
		
		//Gets the Sub Total before Tax 
		public void getSubTotal() {
			System.out.println("SubTotal: $" + this.SubTotal + "0");
			//System.out.println();
		}

		//sets the Sub total
		public void setSubTotal(int SubTotal) 
		     {
				this.SubTotal = this.SubTotal + SubTotal;
		
		     }

		//Gets the sales Tax and gets the TOTAL COST
		public void getSalesTax() {
			
			System.out.println("SalesTax: $" + this.salesTax + "0");
			double total = salesTax + SubTotal; //gets total
			System.out.println("Total: $" + total + "0"); //prints total
		}

		//Sets the Sales tax
		public void setSalesTax(int salesTax) {
			
			this.salesTax = this.salesTax + salesTax;
		}

		//Gets the Product Quantity
		public void getProductQuantity() {
			
			System.out.println("Quantity of products: " + this.ProductQuantity);
			//System.out.println();
		}
		
		//Sets the ProductQuantity
		public void setProductQuantity() {
			
			this.ProductQuantity= ProductQuantity;
		}
		
		
		
		
		//METHODS
		//Fuction to add a product
		public void addProduct() {
			
			System.out.println("Added a new product in Shopping Cart!!");
			System.out.println("-------------------------------------------");
    	      
			SubTotal = SubTotal + 5; // adds $5 to total 
			ProductQuantity = ProductQuantity +1; // adds to the quantity
			this.getProductQuantity(); //calls to get the quantity
			System.out.println();
            this.salesTax = this.SubTotal * 0.10; //SalesTax is 10% of product
			this.getSubTotal(); //calls sub total
			this.getSalesTax(); //calls sales tax
			System.out.println("-------------------------------------------");
		}
		
		//Function to delete a product
		public void deleteProduct() {
			
			//Products exist your able to delete otherwise you can't
			if(ProductQuantity > 0 ) 
			{
				System.out.println("Deleted a product from Shopping Cart!!");
				System.out.println("------------------------------------------");
				SubTotal = SubTotal - 5; //Total is subtracted $5
				ProductQuantity = ProductQuantity - 1; //Quantity is decremented by 1
				this.getProductQuantity(); // gets quantity function
				System.out.println();
				this.salesTax = this.salesTax -0.50; //minus 50 cents per product
				this.getSubTotal(); //gets Subtotal
				this.getSalesTax(); //gets Sales tax
				System.out.println("-------------------------------------------");
			}
			
			else //if there is no products to delete
			{
				System.out.println("There are no products to Delete!!");
				
			}
		}
		  
		  //Function to Display all the information
		  public void Display() {
			  
				System.out.println("This is the Sub Total Balance in your Cart right now:");
				System.out.println("------------------------------------------------------");
	      	    System.out.println(); 
	      	    this.getProductQuantity(); // gets productQuantity 
	      	    this.getSubTotal(); //gets Sub total
	      	    this.getSalesTax(); //gets Sales Tax
	      	  System.out.println("-------------------------------------------");
			  		
		  }
}
