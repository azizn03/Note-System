package postit;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

class NewStorage extends NoteInfomation {


	Scanner inputID = new Scanner(System.in);


    HashMap<String, String> Note = new HashMap<String, String>();



	public void printinfo(){
	System.out.println("--- Fill note here  ---");
                           }
	
	public void Notestore(){

		System.out.println("Enter the note ID you wish to attach the note with\n\n");
        inputIDnote = inputID.nextLine();
        System.out.println("Enter your note\n\n");
        noteDescription = inputID.nextLine();
        Note.put(inputIDnote, noteDescription );
	}

    public void PrintNotes(){

	    System.out.println("Please Enter the ID of the note you wish to view");
        String value = inputID.nextLine();
	    Note.get(inputIDnote);
        System.out.println(": " + inputIDnote + noteDescription );
        Note.clear();


        }

	}
	
	

