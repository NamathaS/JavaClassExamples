package basic;

import java.util.Scanner;

public class Shop {
	Scanner sc = new Scanner(System.in);
	
	public int ShopID;
	public String ShopName;
	public String ShopLocation;
	Product products;
	public int Stoke;
	public double TotalPurchase;
	
	public Shop() {}
	
	public Shop(int id, String name, String location,int stoke,double purchase) {
		this.ShopID=id;
		this.ShopName=name;
		this.ShopLocation=location;
		this.products=new Product();
		this.Stoke=stoke;
		this.TotalPurchase=purchase;
	}
	
	public void setShopId(int id){
		ShopID=id;
	}
	public void setShopName(String name) {
		ShopName=name;
	}
	public void setShopLocation(String location) {
		ShopLocation=location;
	}
	public void setStoke(int stoke) {
		Stoke=stoke;
	}
	

	public int getShopId(){
		return ShopID;
	}
	public String getShopName() {
		return ShopName;
	}
	public String getShopLocation() {
		return ShopLocation;
	}
	public int getStoke() {
		return Stoke;
	}
	public double getTotalPurchase(){
		return TotalPurchase;
	}
	
	public void addShopDetails() {
		int prods;
		System.out.println("Please enter shop details :");
		
		System.out.println("Shop ID  :");
		ShopID=sc.nextInt();
		
		System.out.println("Shop Name  :");
		ShopName=sc.next();
		
		System.out.println("Shop location  :");
		ShopLocation=sc.next();
			
		System.out.println("Please enter number of products: ");
		prods= sc.nextInt();
		
		Product products[] = new Product[prods];
		
		for(int i=0;i<prods;i++) {
			products[i] = new Product();
			products[i].addProductDetails();
		}	
		TotalPurchase = calcualtePurchasePrice(products);
		
	}
	private double calcualtePurchasePrice(Product[] prod) {
		double totalprice=0;
		
		int len = prod.length;
		for(int i=0;i<len;i++)
		{
			
			totalprice+=prod[i].TotalPrice;	
		}
		return totalprice;
	}
	public void displayShopDetails() {
		
		System.out.println("Shop ID  :"+ ShopID);
		
		System.out.println("Shop Name  :"+ ShopName);
		
		System.out.println("Shop location  :"+ ShopLocation);

		System.out.println("Shop Total Purchase   :"+TotalPurchase);

		
	}
	
	
}
