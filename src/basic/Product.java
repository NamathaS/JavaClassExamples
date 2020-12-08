package basic;
import java.util.Scanner;

public class Product {

		Scanner sc = new Scanner(System.in);
		
		public int ProductId;
		public String ProductName;
		public double Price;
		public int Qnty;
		public String Category;
		public int DealerDetails;
		public double TotalPrice;
		
		public Product() {}
		
		public Product(int Id, String productName,double price,String category,int contact,
						int qty, String shop) {
			ProductId= Id;
			ProductName = productName;
			Price = price;
			Qnty=qty;
			Category= category;
			DealerDetails=contact;
		}
		
		//setters
		
		public void setProductId(int Id) {
			ProductId= Id;
		}
		public void setProductName(String productName) {
			ProductName = productName;
		}
		public void setPrice(double price) {
			Price = price;
		}
		public void setQnty(int qty) {
			Qnty = qty;
		}
		public void setCategory(String category) {
			Category= category;
		}
		public void setContactDetails(int contact) {
			DealerDetails=contact;
		}

		//getters
		
		public int getProductId() {
			return ProductId;
		}
		public String getProductName() {
			return ProductName;
		}
		public double getPrice() {
			return Price;
		}
		public int getQnty() {
			return Qnty;
		}
		public String getCategory() {
			return Category;
		}
		public int getContactDetails() {
			return DealerDetails;
		}
		public double getTotalPrice() {
			return TotalPrice;
		}
		
		//methods
		
		public void addProductDetails() {
			
			System.out.println("Product ID : ");
			ProductId= sc.nextInt();
			
			System.out.println("Product Name : ");	
			ProductName = sc.next();
					
			System.out.println("Product Price : ");
			Price = sc.nextDouble();
			
			System.out.println("Product Quantity : ");
			Qnty = sc.nextInt();
			
			System.out.println("Product Category: ");
			Category= sc.next();
			
			System.out.println("Dealer Contact Number : ");
			DealerDetails=sc.nextInt();
			
			calculateTotalPrice();
			
		}
		
		public void calculateTotalPrice() {
			
			TotalPrice= this.Qnty*this.Price;
			
		}
		
		public void displayProductDetails() {
			System.out.println("");
			System.out.println("");		
			System.out.println("ID : "+ProductId);
			System.out.println("Full Name : "+ ProductName);		
			System.out.println("Price : "+Price);
			System.out.println("Category: "+ Category);
			System.out.println("Contact Number : "+DealerDetails);	
			System.out.println("TotalPrice: "+TotalPrice);		
		}		
}
