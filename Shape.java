abstract public class Shape{
	double a;
	
abstract public void compute_area();

}



//===========================




import java.util.Scanner;
public class Rectangle extends Shape{
	double area,b;
	
public void getdata(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length:");
	a=sc.nextDouble();
	System.out.println("Enter breath:");
	b=sc.nextDouble();
	
}
public void compute_area() {
	area=a*b;
	
}
public void display() {
	System.out.println("Area of Rectangle is"+area);
}
		
	
	
}




//===========================



import java.util.*;
public class Shape_op{
	
	
	public static void main(String[]args) {
		int ch;
		Shape s;
		Scanner sc=new Scanner (System.in);
		do {
			System.out.println("1.Area of Rectangle");
			System.out.println("2.Area of Circle");
			System.out.println("3.Area of Triangle");
			System.out.println("4.exit!!");
			
			System.out.println("Enter choice:");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				Rectangle r=new Rectangle();
				s=r;
				r.getdata();
				s.compute_area();
				r.display();
				break;
				
			case 2:
				Trinangle t =new Trinangle();
				s=t;
				t.getdata();
				s.compute_area();
				t.display();
				break;
				
			case 3:
				Circle c =new Circle();
				s=c;
				c.getdata();
				s.compute_area();
				c.display();
				break;
				
					
				
			}
			
		}while(ch!=4);
	}
}