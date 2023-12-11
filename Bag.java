package baguniassignment;
public class Bag {
    private String col;
    private int wt;
    private static int total_object;
    private static int total_wt;
    
    public Bag() {
    	this.wt=10;
    	this.col="Red";
    	total_object=total_object+1;
    	total_wt=total_wt+wt;
    	
    }
    public Bag(String col,int wt) {
    	this.col=col;
    	this.wt=wt;
    	total_object=total_object+1;
    	total_wt=total_wt+wt;
    	
    }
    public Bag(String col) {
         this.col=col;
         this.wt=10;
         total_object=total_object+1;
         total_wt=total_wt+wt;
    }
    public Bag(int wt) {
    	this.col="red";
    	this.wt=wt;
    	total_object=total_object+1;
    	total_wt=total_wt+wt;
    }
    public void display(int i) {
    	i=i+1;
    	System.out.println(i+" "+col+" "+wt);
    }
    public static void  output() {
    	System.out.println("Total Objects:"+total_object+"\n"+"Total weight"+total_wt); 
    	
    }
}


//=============================--=--=-=--=-=--=

package baguniassignment;
import java.util.*;
public class Bag_op {
	public static void main(String[]args) {
		int w,ch1,ch2,n=0;
		String c;
		Bag obj[]=new Bag[10];
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Exit");
			
			System.out.println("Enter your choice:");
			ch1=sc.nextInt();
			switch(ch1) {
			case 1:
				do {
					System.out.println("1.Both Default");
					System.out.println("2.Both from the user");
					System.out.println("3.wt default,column from user");
					System.out.println("4.col default,wt from the user");
					System.out.println("5.Exit");
					
					System.out.println("Enter your choice:");
					ch2=sc.nextInt();
					
					switch(ch2) {
					case 1:
						obj[n]=new Bag();
						n=n+1;
						System.out.println("Ball is added");
						break;
					case 2:
						System.out.println("Enter colour of ball:");
						c=sc.next();
						System.out.println("Enter wt of the ball:");
						w=sc.nextInt();	
						obj[n]=new Bag(c,w);
						n=n+1;
						System.out.println("Ball is added");
						break;
					case 3:
						System.out.println("Enter colour of ball:");
						c=sc.next();
						obj[n]=new Bag(c);
						n=n+1;
						System.out.println("Ball is added");
						break;
					case 4:
						System.out.println("Enter weight of ball:");
						w=sc.nextInt();
						obj[n]=new Bag(w);
		                 n=n+1;
						System.out.println("Ball is added");
						break;
					case 5:
						System.out.println("Exit");
						break;
						
						
				}
			}while(ch2!=6);
			
				break;
			case 2:
				for(int j=0;j<n;j++) {
					obj[j].display(j);
				}
				Bag.output();
				break;
			case 3:
				System.out.println("Exit");
				break;		
				
		}
		
	}while(ch1!=3);
		

	}
}

