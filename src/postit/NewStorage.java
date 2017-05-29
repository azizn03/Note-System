package postit;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class NewStorage {

	Scanner input = new Scanner(System.in);
	String[] array = new String[5];
	
	
	
	public void printinfo(){
	
	System.out.println("--- Fill note here  ---");
		}
	
	public void Notestore(){
		
			System.out.print("Enter your note " + (i+1) + " : ");
		     array[5] = input.nextLine();
		        break;
		
							}
	
	
							
	
	
	public void PrintNotes(){
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("My friend " + (i+1) + " : ");
		        System.out.print(array[i] + "\n");
		}
				
	}
	
	
}
