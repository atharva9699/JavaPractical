package prac2; 
public class Employee {
	protected String Name,address,emailid;
	protected int id;
	protected long mobileno;
	
public Employee(String Name,String address,String emailid,int id,long mobileno)
{
	this.Name=Name;
	this.address=address;
	this.emailid=emailid;
	this.id=id;
	this.mobileno=mobileno;
}
public void display()
{
	System.out.println("Name is:"+Name);
	System.out.println("Address is:"+address);
	System.out.println("mailid is is:"+emailid);
	System.out.println("id is:"+id);
	System.out.println("Mobileno is:"+mobileno);
}
	

}


//==================================================





import java.util.*;
public class Programmer extends Employee {
     double basic_pay;
     float DA,HRA,PF,SCF;
     Scanner sc=new Scanner (System.in);
     
public Programmer(String Name,String address,String emailid,int id,long mobileno) 
{
	super(Name,address,emailid,id,mobileno);
}
public void accept()
{
	System.out.println("Enter basic pay");
	basic_pay=sc.nextDouble();
}
public void calculate() {
	DA=(float)(basic_pay*97/100);
	HRA=(float)(basic_pay*10/100);
	PF=(float)(basic_pay*12/100);
    SCF=(float)(basic_pay*1/1000);
	
}
public void output()
{
	System.out.println("DA"+DA+"\nHRA"+HRA+"\nPF"+PF+"\nSCF"+SCF);
}
	
}

//==================================================







import java.util.*;
public class Employee_op {
	public static void main(String[]args) {
		String Name ,address,emailid;
		int id;
		long mobileno;
		int ch;
		Scanner sc=new Scanner (System.in);
		do {
			System.out.println("1.Programmer");
			System.out.println("2.Team_Lead");
			System.out.println("3.Project_Manager");
			System.out.println("EXit");
			
			System.out.println("Enter choice:");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter name:");
				Name=sc.next();
				System.out.println("Enter address:");
				address=sc.next();
				System.out.println("Enter emailid:");
				emailid=sc.next();
				System.out.println("Enter id:");
				id=sc.nextInt();
				System.out.println("Enter mobileno:");
				mobileno=sc.nextLong();
				
				Programmer p=new Programmer(Name,address,emailid,id,mobileno);
				p.display();
				p.accept();
				p.calculate();
				p.output();
				break;
				
				
			case 2:
				System.out.println("Enter name:");
				Name=sc.next();
				System.out.println("Enter address:");
				address=sc.next();
				System.out.println("Enter emailid:");
				emailid=sc.next();
				System.out.println("Enter id:");
				id=sc.nextInt();
				System.out.println("Enter mobileno:");
				mobileno=sc.nextLong();
				
				Team_lead t=new Team_lead(Name,address,emailid,id,mobileno);
				t.display();
				t.accept();
				t.calculate();
				t.output();
				break;
				
			case 3:
				System.out.println("Enter name:");
				Name=sc.next();
				System.out.println("Enter address:");
				address=sc.next();
				System.out.println("Enter emailid:");
				emailid=sc.next();
				System.out.println("Enter id:");
				id=sc.nextInt();
				System.out.println("Enter mobileno:");
				mobileno=sc.nextLong();
				
			project_manager m =new project_manager (Name,address,emailid,id,mobileno);
				m.display();
				m.accept();
				m.calculate();
				m.output();
				break;
					
				
			
			}
			
			
		}while(ch!=3);
		
		
	}

}




