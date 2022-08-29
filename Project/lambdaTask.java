/**
 * @author Ketan Kumar
 * Illustrating arithmetic operation using functional interface and lambda expression
 *
 */

package banking.Project;

import java.util.Scanner;

//Creating functional interface sum to return calculated addition value
interface sum{
	int calculate(int a,int b);
}
//Creating functional interface sub to return calculated subtracted value
interface sub{
	int calculate(int a,int b);
}
//Creating functional interface product to return calculated product value
interface product{
	int calculate(int a,int b);
}
//Creating functional interface division to return calculated divided value
interface division{
	float calculate(float a,float b);
}

public class lambdaTask{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//performing addition using lambda expression
		sum value1 = (a,b)->{return a+b;};
		
		//performing subtraction using lambda expression
		sub value2 = (a,b)->{ return a-b; };
		
		//performing multiplication using lambda expression
		product value3 = (a,b)->{ return a*b; };
		
		//performing division using lambda expression
		division value4 = (a,b)->{ return a/b; };
		
		int choice = 0,first,sec;
		while(choice<5) {
			
			//Requesting User to select any following sorting method to sort the Student list
			System.out.print("\n\n----CALCULATE----\n1 - Addition \n2 - Subtraction \n3 - Multiplication \n4 - Division \n5 - Exit \nENTER CHOICE : ");
			choice = scan.nextInt();
			switch(choice) {
			case 1 : System.out.print("\nEnter First Value : ");
					first = scan.nextInt();
					 System.out.print("Enter Next Value : ");
					sec = scan.nextInt();
					//Displaying calculated addition value by passing parameter
					System.out.println("\nResult : "+value1.calculate(first,sec));
					break;
			
			case 2 : System.out.print("\nEnter First Value : ");
					first = scan.nextInt();
					System.out.print("Enter Next Value : ");
					sec = scan.nextInt();
					//Displaying calculated subtraction value by passing parameter
					System.out.println("\nResult : "+value2.calculate(first,sec));
					break;
					
			case 3 : System.out.print("\nEnter First Value : ");
					first = scan.nextInt();
					System.out.print("Enter Next Value : ");
					sec = scan.nextInt();
					//Displaying calculated multiplication value by passing parameter
					System.out.println("\nResult : "+value3.calculate(first,sec));
					break;
			
			case 4 : System.out.print("\nEnter First Value : ");
					first = scan.nextInt();
					System.out.print("Enter Next Value : ");
					sec = scan.nextInt();
					//Displaying calculated division value by passing parameter
					System.out.println("\nResult : "+value4.calculate(first,sec));
					break;
			
			default : System.exit(0);
			
			}
		}
		//closing scanner object
		scan.close();
	}
}