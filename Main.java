 abstract class publication {
    String title;
    double price;
    int copies;
	public publication(String title, double price, int copies) { 
		this.title = title;
		this.price = price;
		this.copies = copies;
}
public void saleCopy() {
	System.out.println("price of publication of " + price); 
	System.out.println("copies of publication of " + copies);
}

abstract void calculateTotalSale(); }


 
 
 
 //---------------------------------------------------------------------------
 
 
 
 
class Magazine extends publication { int orderQty;
    	String currentIssue;
    	public Magazine(String title, double price, int copies, int orderQty, String currentIssue) {
    		super(title, price, copies); 
    		this.orderQty = orderQty; 
    		this.currentIssue = currentIssue;
    	}
    public void recievenewissue()
    {
    	System.out.println("orderQty is: "+orderQty); 
    	System.out.println("currentIssue is:"+currentIssue);
	}
	@Override
	void calculateTotalSale() { 
		System.out.println(price*orderQty );
} 
	}



//------------------------------------------------------------------------





class Book extends publication {
    String author;
    int newcopies;
    public Book(String title, double price, int copies, String author,int newcopies) {

    	super(title, price, copies); 
    	this.author = author; 
    	this.newcopies= newcopies;
    }
    public void ordercopies()
    {
    	System.out.println("newcopies are"+newcopies); 
    	System.out.println("author is"+author);
}
	@Override
	public void calculateTotalSale() { 
		System.out.println(price *(copies+newcopies));
	} 
	}



//---------------------------------------------------------------------------



import java.util.Scanner;
public class Main {
public static void main(String[] args) {
		int ch;
		Book b= new Book("The Great Gatsby", 15.99, 100, "F. Scott Fitzgerald",5);
		Magazine m = new Magazine("National Geographic", 5.99, 500, 1000, "January 2023");
	    publication p;
	    Scanner sc=new Scanner(System.in); do
		{
		System.out.println("1.book:"); 
		System.out.println("2.Magazine:"); 
		System.out.println("3.exit:");
		System.out.println("3.exit:"); 
		ch=sc.nextInt();
		switch(ch) {
                 case 1:p=b;
                        p.saleCopy();
						b.ordercopies(); 
						p.calculateTotalSale();
                 case 2:p=m;
                        p.saleCopy();
				    }
				}while(ch!=3);
				m.recievenewissue(); 
				p.calculateTotalSale();

 	} 
}
