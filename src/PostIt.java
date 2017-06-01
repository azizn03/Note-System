package postit;

import java.util.Scanner;

class Postit {

    public static final Scanner menu = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        int MenuOption = 0;

        NewStorage G = new NewStorage();    // Allows to use fuctions from NewStorage.java file

        while(MenuOption != 3){

            System.out.println(

                    "\n--------Note System-------\n" +
                            "----------------------------\n" +
                            "1.   Create a Note \n" +
                            "2.   View Notes \n" +
                            "3.   Close Program\n" +
                            "4.   Export notes to File\n" +
                            "5.   Import notes from file\n" +
                            "6.   Test code\n" +
                            "----------------------------\n");

            MenuOption = menu.nextInt();
            menu.nextLine();

            switch (MenuOption) {

                case 1:


                    G.printinfo();
                    G.Notestore();

                    break;

                case 2:

                    G.viewNotes();
                    G.printNotes();
                    break;

                case 3:

                    System.out.println("Closing program now.. ");
                    System.exit(0);


                    break;

                case 4:


                    G.writeFile();


                    System.out.println("Notes have been exported.");
                    break;

                case 5:

                    G.readFile();
                    System.out.println("Notes have been imported");
                    break;

                case 6:

                    G.Gsontest();
                    break;

               default:

                    System.out.println("Invalid choice.");

                    break;
            }
        }
    }
}

