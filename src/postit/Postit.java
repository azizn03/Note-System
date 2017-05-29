package postit;

import java.util.Scanner;

public class Postit {
	
	public static void main(String[] args) {
		int MenuOption = 0;	
		
		NewStorage G = new NewStorage();    // Case 1 Object 
		
		
	
		
			while(MenuOption != 3){													
																					
		System.out.println(
		
					"\n--------Note System-------\n" +
					"----------------------------\n" +
					"1.   Create a Note \n" +
					"2.   View Notes \n" +
					"3.   Close Program\n" +
					"----------------------------\n");
								  
			
			Scanner menu = new Scanner(System.in);									    
			MenuOption = menu.nextInt();												
			
			
			switch (MenuOption) {

				case 1: 
				
				G.printinfo();
				G.Notestore();
				
				break;
				
				case 2:
					
					G.PrintNotes();
				
				break;
				
				case 3: 
				
					System.out.println("Program is closing");												
					System.exit(0);	
					
				break;
				
				default:
				
					System.out.println("Invalid choice.");
					
	            break;
				}
			}
		}
	}
	
