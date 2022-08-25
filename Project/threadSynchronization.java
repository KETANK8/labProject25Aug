package banking.Project;

import java.util.Scanner;

public class threadSynchronization {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		counter obj = new counter();
		count obj1 = new count();
		int choice = 0;
		while(choice<5) {
			System.out.println("Enter Choice : \n1 - Asynchronized Threads \n2 - Synchronized Threads \n3 - Exit1");
			choice = scan.nextInt();
			switch (choice) {
			case 1 : Thread t1 = new Thread() {
							public void run(){
								 obj.count(10);
							}
						};
						Thread t2 = new Thread() {
							public void run(){
								 obj.count(10);
							}
						};
						t1.start();
						t2.start();
						break;
						
			case 2 :  Thread T1 = new Thread() {
						public void run(){
							obj1.counter(10);
						}
					};
					Thread T2 = new Thread() {
						public void run(){
							obj1.counter(10);
						}
					};
					T1.start();
					T2.start();
					break;
					
			default : System.exit(0);
			
			}
		}
	scan.close();
	}
}

class counter{
		
		public void count(int n) {
			
			// TODO Auto-generated constructor stub
			for(int i=0;i<=n;i++) {
				int count = 1;
				count += i;
				System.out.println(Thread.currentThread().getName()+" Count : "+ count);
				
			}
		}
	}
	
class count{
		
	synchronized public void counter(int n) {
			
			// TODO Auto-generated constructor stub
			for(int i=0;i<=n;i++) {
				int count = 1;
				count += i;
				System.out.println(Thread.currentThread().getName()+" Count : "+ count);
				
		}
	}
}
