/**
 * @author Ketan Kumar
 * Illustrating Different file operation like creating a file, reading and Writing file using File Handling methods.
 *
 */

package banking.Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandaling  {

	//Method 1
	//Main Method
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter File Name");
		String name = scan.next();
		
		// Creating file by giving path and name of the file
		File f1 = new File("C:\\TestFolder\\"+name);
		if(f1.createNewFile()) {
			System.out.println("File Created Successfully.\nFile Name : "+ f1.getName());
			int choice =0;
			while (choice < 5) {
				// Requesting user to select one operation from Reading the file or Writing on file
				System.out.println("\nENTER CHOICE :\n1 - Write \n2 - Read \n3 - Exit ");
				choice = scan.nextInt();
				
				switch(choice) {
					
				case 1 : System.out.println("ENTER TEXT : ");
						String content = scan.next();
						// Asking user what user want to write on file
						fileHandaling.fileWrite(f1, content);// Calling file Write method to write on the file
				break;
				
				case 2 : fileHandaling.fileRead(f1);// Calling file Reader method to access and display the content of file
				break;
				
				default : System.out.println("\nCLOSING FILE.....\n=====FILE CLOSED===== ");
					System.exit(0);
				}
				
				 
			}
			
		}
		else {
			System.out.println("File already exist!!!");
		}
		// closing Scanner Object
		scan.close();
	}
	
	//Method 2
	//FileWrite method for adding user input data on the file.
	//Taking file and content to add on file as parameter
	public static void fileWrite(File f1,String content) throws IOException {
		// TODO Auto-generated stub
		String path = f1.getAbsolutePath();
		FileWriter writer = new FileWriter(path);// Creating fileWriter to write on a file
		writer.write(content);// Storing content in file
		System.out.println("\nSuccessFully Written.\n");
		//Closing fileWriter object
		writer.close();
		
	}
	
	//Method 3
	//FileRead method to access and display the file
	//Taking file as parameter
	public static void fileRead(File f1) {
		
		// TODO Auto-generated stub
		try {  
            // Create f1 object of the file to read data      
            Scanner Reader = new Scanner(f1); 
            System.out.println("\n"+f1.getName()+" Opening \nFile Contains : \n");
            // Reading file content until reach the end of the file
            while (Reader.hasNextLine()) {  
                String fileData = Reader.nextLine();  
                System.out.println(fileData);  
            }  
            //Closing Scanner object
            Reader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        }  
	}
}

	


