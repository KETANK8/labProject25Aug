package banking.Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandaling  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter File Name");
		String name = scan.next();
		File f1 = new File("C:\\TestFolder\\"+name);
		if(f1.createNewFile()) {
			System.out.println("File Created Successfully.\nFile Name : "+ f1.getName());
			int choice =0;
			while (choice < 5) {
				System.out.println("\nENTER CHOICE :\n1 - Write \n2 - Read \n3 - Exit ");
				choice = scan.nextInt();
				
				switch(choice) {
					
				case 1 : System.out.println("ENTER TEXT : ");
						String content = scan.next();
						fileHandaling.fileWrite(f1, content);
				break;
				
				case 2 : fileHandaling.fileRead(f1);
				break;
				
				default : System.out.println("\nCLOSING FILE.....\n=====FILE CLOSED===== ");
					System.exit(0);
				}
				
				 
			}
			
		}
		else {
			System.out.println("File already exist!!!");
		}
		scan.close();
	}
	
	public static void fileWrite(File f1,String content) throws IOException {
		// TODO Auto-generated stub
		String path = f1.getAbsolutePath();
		FileWriter writer = new FileWriter(path);
		writer.write(content);
		System.out.println("\nSuccessFully Written.\n");
		writer.close();
		
	}
	
	public static void fileRead(File f1) {
		
		// TODO Auto-generated stub
		try {  
            // Create f1 object of the file to read data      
            Scanner dataReader = new Scanner(f1); 
            System.out.println("\n"+f1.getName()+" Opening \nFile Contains : \n");
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        }  
	}
}

	


