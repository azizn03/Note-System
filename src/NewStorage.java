package postit;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import com.google.gson.stream.JsonReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class NewStorage {
    Gson gson = new Gson();
    ;

    ArrayList<Note> NoteArray = new ArrayList<Note>(20);

    public void printinfo() {
        System.out.println("--- Fill note here  ---");
    }



    public void Gsontest() {
        String userJson = gson.toJson(NoteArray.toString());
        gson.toJson(userJson, System.out);
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

        for (int i = 0; i < NoteArray.size(); i++) {
            System.out.println((count++) + ": " + NoteArray.get(i).inputIDnote);
        }
    }

    public void printNotes() {

        int count = Postit.menu.nextInt();
        Postit.menu.nextLine();

        System.out.println(count + " " + NoteArray.get(count));
    }

    public void writeFile() throws IOException {
        try (Writer writer = new FileWriter("src\\Output.json")) {
            Gson gson = new Gson();
            gson.toJson(NoteArray, writer);
        }

    }

    public void readFile() throws IOException {
        try {
            JsonReader reader = new JsonReader(new FileReader("src\\Output.json"));

            reader.beginObject();

            reader.endObject();
            reader.close();

            gson.toJson(reader, System.out);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


