package basic;

public class Area {
	public double length;
	public double breadth;
	public double area;
	
	Area(){}
	
	Area(double l, double b){
		length=l;
		breadth=b;
	}
	
	public void setLength(double l) {
		length=l;
	}
	public void setbreadth(double b) {
		breadth=b;
	}
	public double getLength() {
		return length;
	}
	public double setbreadth() {
		return breadth;
	}
	
	public void calculateArea(double side) {
		
		area=side*side;		
	}
	
	public void calculateArea(double len,double breadth) {
		
		area= len*breadth;
	}
	public void calculateArea(double len,double breadth,boolean triangle) {
		
		if(triangle){
			area= (len*breadth)/2;
		}
		else
		{
			System.out.println(" Please enter triangle's diamentions");
			area=0;
		}
	}
	public void displayArea() {
		System.out.println("Area = "+area);
	}
}
