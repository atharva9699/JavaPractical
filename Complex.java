package practical1;
public class Complex{
	int real,img;
	
public Complex()
{
	real=0;
	img=0;
}
public Complex(int real,int img) {
	this.real=real;
	this.img=img;
	
}
public void add(Complex x,Complex y) {
	real=x.real+y.real;
	img=x.img+y.img;
	System.out.println("The addition of two numbers is");
	System.out.println(real+"+"+img+"i");
}
public void sub(Complex x,Complex y) {
	real=x.real-y.real;
	img=x.img-y.img;
	System.out.println("The Subtraction of two numbers is");
	System.out.println(real+"+"+img+"i");
}
public void mult(Complex x,Complex y) {
	real=(x.real*y.real)-(x.img*y.img);
	img=(x.real*y.img)+(x.img*y.real);
	System.out.println("The Multiplication of two numbers is");
	System.out.println(real+"+"+img+"i");
}
public void div(Complex x,Complex y) {
	real=((x.real*y.real)+(x.img*y.img))/((y.real*y.real)+(y.img*y.img));
	img=((x.real*y.img)-(x.img*y.real))/((y.real*y.real)+(y.img*y.img));
	System.out.println("The division of two numbers is");
	System.out.println(real+"+"+img+"i");
	
}
}

package practical1;
import java.util.*;
public class Complex_op{
	public static void main(String[]args) {
		int r1,r2,i1,i2;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter num 1:");
		r1=sc.nextInt();
		System.out.println("Enter num 2:");
		r2=sc.nextInt();
		System.out.println("Enter num 1:");
		i1=sc.nextInt();
		System.out.println("Enter num 2:");
		i2=sc.nextInt();
		
		Complex c1 =new Complex(r1,i1);
		Complex c2=new Complex(r2,i2);
		Complex c3 =new Complex();
		
		c3.add(c1, c2);
		c3.sub(c1, c2);
		c3.mult(c1, c2);
		c3.div(c1, c2);
		
		
		
	}
}






