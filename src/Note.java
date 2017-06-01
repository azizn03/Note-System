package postit;

class Note {



    String  inputIDnote;
    String  noteDescription;
        public Note(String inputIDnote, String noteDescription) {
       this.inputIDnote = inputIDnote;
       this.noteDescription = noteDescription;
   }
   @Override
   public String toString() {

       return "\n\n" + "ID: " + inputIDnote + "\n\n" + " Description: " + noteDescription;
   }

}
