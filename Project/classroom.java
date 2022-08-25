/**
 * @author Ketan Kumar
 * Illustrating Sorting of student list on different parameter using Comparator Interface and collections.
 *
 */

package banking.Project;
//Importing COllections
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter No of Students : ");
		int no = scan.nextInt();
		
		//Creating Array List to store Student data/Student Object
		ArrayList <student> studentList = new ArrayList<student>();
		
		//For loop to take input student data until all student object in not stored
		for(int i = 1;i<=no;i++) {
			System.out.println("Enter "+i+" Student Name : ");
			String name = scan.next();
			System.out.println("\nEnter "+i+" Student Id : ");
			int id = scan.nextInt();
			System.out.println("\nEnter "+i+" Student Age :");
			int age = scan.nextInt();
			System.out.println("\nEnter "+i+" Student Marks : ");
			int marks = scan.nextInt();
			
			//Creating object of student
			student stud = new student(id,age,marks,name);
			studentList.add(stud);//Passing student object in the ArrayList to store data in list
		}
		
		int choice = 0;
		while(choice<5) {
			
			//Requesting User to select any following sorting method to sort the Student list
			System.out.println("\nENTER CHOICE :\n1 - Sort by ID \n2 - Sort by Age \n3 - Sort by Marks \n4 - Exit ");
			choice = scan.nextInt();
			switch(choice) {
			case 1 : System.out.println("\n----Student List based on ID----");
			
					//Sorting list using collection sort method and IdComparator
					Collections.sort(studentList, new IdComparator());// Sorting by comparing Id number of students
					for(student s : studentList)//Displaying sorted List
						System.out.println("Name : "+s.studentName +"  Id : " +s.studentId +"  Age : " +s.studentAge +" Marks : " +s.studentMarks);
					break;
			
			case 2 : System.out.println("\n----Student List based on Age----");	
					
					//Sorting list using collection sort method and AgeComparator
					Collections.sort(studentList, new AgeComparator());// Sorting by comparing Age of students
					for(student s : studentList)//Displaying sorted List
						System.out.println("Name : "+s.studentName +"  Id : " +s.studentId +"  Age : " +s.studentAge +"  Marks : " +s.studentMarks);
					break;
					
			case 3 :System.out.println("\n----Student List based on Marks----");
			
					//Sorting list using collection sort method and MarksComparator
					Collections.sort(studentList, new MarksComparator());// Sorting by comparing marks of students
					for(student s : studentList)//Displaying sorted List
						System.out.println("Name : "+s.studentName +"  Id : " +s.studentId +"  Age : " +s.studentAge +"  Marks : " +s.studentMarks);
					break;
					
			default : System.exit(0);
			
			}
		}
		//Closing Scanner Object 
	scan.close();
	}

}
