 interface vehicle{
	void gear_change(int a);
	void speed_up();
	void apply_brakes();
	void display();
}
 
 //===========//====//=/==/=/==/==/=/
 
 
 
 
 
 class bicycle implements vehicle{
		int gear,speed;
		
	public bicycle()
	{
		System.out.println("\nBicycle started successfully.\n");
		gear=1;
		speed=10;
		
	}
	public void gear_change(int gearx)
	{
		if(gearx<7 && gearx>0)
		{
		 gear=gearx;
		 System.out.println("\nGear Changed Successfully.\n\t Current Gear is"+gear);
		 
		}
		else {
			System.out.println("Gear out of range.\n");
		}
	}
	public void speed_up()
	{
		if(speed+5<50)
		{
			speed+=5;
			System.out.println("\nSpeed increased successfully\n\tCurrent speed is"+speed+"kmhr");
			
		}
		else {
			System.out.println("Speed cannot be more than 50 kmhr");
		}
	}
	public void apply_brakes()
	{
		gear=0;
		speed=0;
		System.out.println("\nBicycle stopped Successfully\n");
	} 
	public void display()
	{
		System.out.println("YOUR BICYCLE'S CURRENT SPEED IS"+speed+"CURRENT GEAR IS"+gear);
	}








	}
 //===========//====//=/==/=/==/==/=/
 
 import java.util.*;
 public class main1 {
 	public static void main(String args[]) {
 		Scanner sc=new Scanner(System.in);
 		vehicle v =null;
 		System.out.println("==================================================");
 		int y;
 		do {
 			System.out.println("ENTER VEHICLE  \n\t 1.BICYCLE \n\t 2.CAR \n\t 3.BIKE\n\t4.Exit \nchoice =");
 			y=sc.nextInt();
 			System.out.println("==================================================");

 			if(y==1) 
 				v=new bicycle();
 			else if(y==2)
 				v=new car();
 			else if(y==3)
 				v=new bike();
 			else if(y==4)
 				break;
 			else
 				System.out.println("Invalid input!!");
 			System.out.println("==================================================");
 			do {
 				System.out.println("\t1.change gear\n\t2.Speed up\n\t3.apply brakes\n\t4.Display vehicle status\n\t5.Exit\nchoce=");
 				int z=sc.nextInt();
 				System.out.println("==================================================");
 				switch(z)
 				{
 				case 1:
 					System.out.println("Which gear you want ?");
 					int a=sc.nextInt();
 					v.gear_change(a);
 					break;
 					
 				case 2:
 					v.speed_up();
 					break;
 					
 				case 3:
 					v.apply_brakes();
 					break;
 					
 				case 4:
 					v.display();
 					break;
 					
 				case 5:
 					break;
 					
 					
 				}
 				 
 			}while(true);
 		}while(y!=4);

 }
 }

