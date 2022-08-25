/**
 * @author Ketan Kumar
 * Illustrating execution of thread using synchronized method in multi threading
 *
 */

package banking.Project;

import java.util.Scanner;

//Class 1
//Creating threadSynchroniztion to create and execute threads
public class threadSynchronization {

	//Main method
	public static void main(String[] args) {
		//creating scanner object
		Scanner scan = new Scanner(System.in);
		
		//creating object of counter class(Class 2)
		counter obj = new counter();
		
		//creating object of count class(Class 3)
		count obj1 = new count();
		int choice = 0;
		while(choice<5) {
			
			//Requesting user to enter to select type of thread execution
			System.out.println("Enter Choice : \n1 - Asynchronized Threads \n2 - Synchronized Threads \n3 - Exit");
			choice = scan.nextInt();
			
			//Requesting user to enter the no of time a thread will execute
			System.out.println("\nEnter No of Cycles : ");
			int cycle = scan.nextInt();
			
			switch (choice) {
			
			case 1 : Thread t1 = new Thread() { //Creating anonymous thread
							public void run(){
								// calling count method of class2 using its object obj to perform Asynchronous execution
								 obj.count(cycle); 
								 }
						};
						Thread t2 = new Thread() { //Creating anonymous thread
							public void run(){
								// calling count method of class2 using its object obj to perform Asynchronous execution
								 obj.count(cycle);
							}
						};
						t1.start();// thread starts running/executing
						t2.start();// thread starts running/executing
						break;
						
			case 2 :Thread T1 = new Thread() { //Creating anonymous thread
						public void run(){
							// calling counter method of class3 using its object obj1 to perform Synchronous execution
							obj1.counter(cycle);
						}
					};
					Thread T2 = new Thread() { //Creating anonymous thread
						public void run(){
							// calling counter method of class3 using its object obj1 to perform Synchronous execution
							obj1.counter(cycle);
						}
					};
					T1.start();// thread starts running/executing
					T2.start();// thread starts running/executing
					break;
					
			default : System.exit(0);
			
			}
		}
		// closing scanner object
	scan.close();
	}
}

//class 2
// creating counter class to count the no of time a thread executes
class counter{
		
		//method 2
		//method to perform Asynchronous thread execution
		public void count(int n) {
			//executing thread n no of times
			for(int i=0;i<=n;i++) {
				int count = 1;
				count += i; // incrementing counter
				System.out.println(Thread.currentThread().getName()+" Count : "+ count);
				
			}
		}
	}
	
//class 3
//creating count class to count the no of time a thread executes
class count{
		
	//method 3
	//method to perform Synchronous thread execution by using "synchronized" keyword
	synchronized public void counter(int n) {
			//executing thread n no of times
			for(int i=0;i<=n;i++) {
				int count = 1;
				count += i; // incrementing counter
				System.out.println(Thread.currentThread().getName()+" Count : "+ count);
				
		}
	}
}
