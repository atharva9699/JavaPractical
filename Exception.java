import java.util.*;
public class Exception{
	private int num1,num2,ans;
	Scanner sc =new Scanner(System.in);
	
  void getdata() {
	  System.out.println("Enter num 1:");
	  num1=sc.nextInt();
	  System.out.println("Enter num 2:");
	  num2=sc.nextInt();
  }
  void division() {
	  try
	  {
		  ans=num1/num2;
		  System.out.println(ans);
		  
	  }
	  catch(ArithmeticException e) {
		  System.out.println (e);
		  
	  }
	  catch(InputMismatchException e) {
		  System.out.println (e);
		  
	  }
	  
  }
 void nullpoint() {
	 
		 String str=null, pass="sdegoogle";
	
	try
		 {
		 if(str.equals(pass)) {
			 System.out.println("Equal");
		 }
		 else {	 System.out.println("Not Equal");
	 }
   }
	 catch(NullPointerException e) {
		  System.out.println (e);
	 }
		 
	 }
 void arrayindex() {
	 try {
		 int arr[]=new int[4];
		 arr[0]=10;
		 arr[1]=20;
		 arr[2]=30;
		 arr[3]=40;
		 System.out.println(arr[5]);
	 }
	 catch(ArrayIndexOutOfBoundsException e){
		 System.out.println (e);
		 
		 
	 }
 }
 public static void main(String[]args) {
	 int ch;
	 Exception e = new Exception();
	 Scanner sc=new Scanner (System.in);
	 do {
		 System.out.println("Enter your Choice\n1.getdata\n 2.division\n3.nullpoint\n4.arrayindex\n");
		 ch=sc.nextInt();
		 
		 switch(ch)
		 {
		 case 1:e.getdata();
		 break;
		 case 2:e.division();
		 break;
		 case 3:e.nullpoint();
		 break;
		 case 4:e.arrayindex();
		 break;
		 }
	 }while(ch!=4);
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
}