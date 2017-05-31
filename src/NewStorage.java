package postit;

import java.util.Scanner;
import java.util.ArrayList;

class NewStorage  {

    Scanner inputID = new Scanner(System.in);   // Used for string inputs
    Scanner inputID2 = new Scanner(System.in);  // Used for integer inputs


    ArrayList<Note> NoteArray = new ArrayList<Note>(20);

    public void printinfo() {
        System.out.println("--- Fill note here  ---");
    }

    public void Notestore() {

        System.out.println("Enter the note ID you wish to attach the note with\n\n");
        String inputIDnote = inputID.nextLine();
        System.out.println("Enter your note\n\n");
        String noteDescription = inputID.nextLine();
        NoteArray.add(new Note(inputIDnote, noteDescription));
    }

    public void viewNotes() {

        System.out.println("Please enter the number of the note you wish to view.");
        int count = 0;

        for (int i = 0 ; i < NoteArray.size(); i++) {
            System.out.println((count++) + ": "  + NoteArray.get(i).inputIDnote);
        }
}

    public void printNotes(){
        int count = inputID2.nextInt();

            System.out.println(count + " " + NoteArray.get(count));
    }

}


