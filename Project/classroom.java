package banking.Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter No of Students : ");
		int no = scan.nextInt();
		ArrayList <student> studentList = new ArrayList<student>();
		
		for(int i = 1;i<=no;i++) {
			System.out.println("Enter "+i+" Student Name : ");
			String name = scan.next();
			System.out.println("\nEnter "+i+" Student Id : ");
			int id = scan.nextInt();
			System.out.println("\nEnter "+i+" Student Age :");
			int age = scan.nextInt();
			System.out.println("\nEnter "+i+" Student Marks : ");
			int marks = scan.nextInt();
			
			student stud = new student(id,age,marks,name);
			studentList.add(stud);
		}
		
		int choice = 0;
		while(choice<5) {
			System.out.println("\nENTER CHOICE :\n1 - Sort by ID \n2 - Sort by Age \n3 - Sort by Marks \n4 - Exit ");
			choice = scan.nextInt();
			switch(choice) {
			case 1 : System.out.println("\n----Student List based on ID----");
					Collections.sort(studentList, new IdComparator());
					for(student s : studentList)
						System.out.println("Name : "+s.studentName +"  Id : " +s.studentId +"  Age : " +s.studentAge +" Marks : " +s.studentMarks);
					break;
			
			case 2 : System.out.println("\n----Student List based on Age----");	
					Collections.sort(studentList, new AgeComparator());
					for(student s : studentList)
						System.out.println("Name : "+s.studentName +"  Id : " +s.studentId +"  Age : " +s.studentAge +"  Marks : " +s.studentMarks);
					break;
					
			case 3 :System.out.println("\n----Student List based on Marks----");	
					Collections.sort(studentList, new MarksComparator());
					for(student s : studentList)
						System.out.println("Name : "+s.studentName +"  Id : " +s.studentId +"  Age : " +s.studentAge +"  Marks : " +s.studentMarks);
					break;
					
			default : System.exit(0);
			
			}
		}
	scan.close();
	}

}
