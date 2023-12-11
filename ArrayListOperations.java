package genp;
import java.util.*;
import java.util.ArrayList;
public class ArrayListOperations {
    private ArrayList<Integer>list=new ArrayList<>();
    private ArrayList<Integer>even=new ArrayList<>();
    private ArrayList<Integer>odd=new ArrayList<>();
    private ArrayList<Integer>prime=new ArrayList<>();
    private ArrayList<String>string=new ArrayList<>();
    private ArrayList<String>palindrome=new ArrayList<>();
    
public void getdata()
{
	Scanner sc=new Scanner (System.in);
	int element, num;
	System.out.println("Enter element");
	element=sc.nextInt();
	for(int i=0;i<element;i++) {
    System.out.println("Enter number");
    num=sc.nextInt();
    list.add(num);
	}
}
public void evenOdd()
{
	
	for  (int i=0;i<list.size();i++) {
		if((list.get(i))%2==0) {
			even.add(list.get(i));
		}
		else {
			odd.add(list.get(i));
		}
}
}
public void prime()
{
	int i,j,flag=0;
	for(i=0;i<list.size();i++)
	{
		flag=0;
		for(j=2;j<list.get(i);j++) {
			if((list.get(i))%j==0)
			{
				flag=1;
		         break;
			}
		}if(flag==0)
			{
				prime.add(list.get(i));
			}

		
	
}
}
public void display()
	{
		System.out.println("List:"+list);
		System.out.println("Even:"+even);
		System.out.println("Odd:"+odd);
		System.out.println("Prime:"+prime);
		
	}
	

public void getString() {
	Scanner sc=new Scanner(System.in);
	int num;
	String s;
	 System.out.println("Enter no of string you want to enter:");
	 num=sc.nextInt();
	 for( int i=0;i<num;i++) {
	 System.out.println("Enter sting:");
	 s=sc.next();
	 string.add(s);
}
	 System.out.println("String:"+string);
}
 public void setPalindrome() {
	 int i,j,flag;
	 for(i=0;i<string.size();i++) {
		 flag=0;
		 String s=string.get(i);
		 
		 for( j=0;j<s.length();j++) {
			 if(s.charAt(j)==s.charAt(s.length()-1-j))
			 {
				 flag=1;
				 
			 }}
			 if(flag==1)
			 {
				 palindrome.add(s);
			 }
			
		 
		 
	 }
	 System.out.println("Palindrome"+palindrome);
	 
 }
   
    
}
