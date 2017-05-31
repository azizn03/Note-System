package postit;

import java.util.Scanner;
import java.util.ArrayList;

class NewStorage  {





    ArrayList<Note> NoteArray = new ArrayList<Note>(20);

    public void printinfo() {
        System.out.println("--- Fill note here  ---");
    }

    public void Notestore() {

        System.out.println("Enter the note ID you wish to attach the note with\n\n");
        String inputIDnote = Postit.menu.nextLine();
        System.out.println("Enter your note\n\n");
        String noteDescription = Postit.menu.nextLine();
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

        int count = Postit.menu.nextInt();
        Postit.menu.nextLine();

        System.out.println(count + " " + NoteArray.get(count));
    }
}
