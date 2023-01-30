package DiaryApp;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.io.*;


public class DiaryDemo {
    private static final Diary diary  = new Diary("james","king");
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/ MM /yy - hh:mm a");
    private static final LocalDateTime now = LocalDateTime.now();
    private static final List<DiaryUser> diaryUsers = new ArrayList<>();


    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {

        startDiary();
    }


    public static void goToMainMenu() throws InterruptedException, IOException {

        String mainMenu ="          "+ dateTimeFormatter.format(now)+ "\n"+"""
                +=============================+
                    WELCOME TO KINGS DIARY
                +=============================+
                1 =>  CREATE ENTRY
                2 =>  VIEW ENTRY
                3 =>  COUNT ENTRY
                4 =>  EDIT ENTRY
                5 =>  DELETE ENTRY
                6 =>  EXIT
                +=============================+
                """;

        String userInput = input(mainMenu);
        switch (userInput.charAt(0)){
            case '1' -> createEntry();
            case '2' -> viewEntry();
            case '3' -> countEntry();
            case '4' -> editEntry();
            case '5' -> deleteEntry();
            case '6' -> exitDiary();
            default -> goToMainMenu();
        }
    }

    public  static void createNewDiaryUser(String name, String password, Diary diary){
        DiaryUser diaryUser = new DiaryUser(name, password, diary);
        diaryUsers.add(diaryUser);
    }


    public static void startDiary() throws InterruptedException, IOException, ClassNotFoundException {
//        diary = null;
        display("...WELCOME TO KING DIARY...");
        goToMainMenu();

//        FileInputStream fileIn  = new FileInputStream("C:\\Users\\USER\\IdeaProjects\\javaProject1\\userInfo.ser");
//        ObjectInputStream in = new ObjectInputStream(fileIn);
//        diary = (Diary) in.readObject();
//        in.close();
//        fileIn.close();
//        String userName = input("Please enter your name");
//        String userPassword = input("Create a password");
//        createNewDiaryUser(userName,userPassword,diary1);
    }


    private static void exitDiary() throws IOException {
        FileOutputStream fileOut = new FileOutputStream("userInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(diary);
        out.close();
        fileOut.close();
        display("Diary saved...");
        display("Thank you for using diary.");
    }

    private static void createEntry() throws InterruptedException, IOException {
        String entryTitle = input("Enter your diary title");
        String entryBody = input("Enter your diary body");
        diary.createEntry(entryTitle,entryBody);
        display("Entry ( ID: "+ diary.countEntry()+" )"+" created successfully"+"\n"+dateTimeFormatter.format(now));
        goToMainMenu();

    }
    private static void viewEntry() throws InterruptedException, IOException {
        int entryID = Integer.parseInt(input("Enter your diary ID"));
        try {
            String entryBody = diary.viewEntry(entryID);
            display(entryBody);
        }catch (IllegalArgumentException error){
            display(error.getMessage());
        }
        goToMainMenu();
    }

    private static void countEntry() throws InterruptedException, IOException {
        int entryAmount = diary.countEntry();
        display("you have "+ entryAmount +" entry available");
        goToMainMenu();
    }

    private static void editEntry() throws InterruptedException, IOException {
        String titleUpdate ="";
        String bodyUpdate = "";
        int entryID = Integer.parseInt(input("Enter your diary ID"));
        try {
            display(diary.viewEntry(entryID));
          String editOptions =   input("""
                    -----------------
                    1 -> Edit Title
                    2 -> Edit body
                    -----------------
                    """);
          switch (editOptions.charAt(0)){
              case '1' -> {
                  display(diary.viewEntry(entryID));
                   titleUpdate =  input("Edit Entry Title");
                  diary.editEntry(entryID,titleUpdate,bodyUpdate);
                  display(diary.viewEntry(entryID));
                  display("Title updated \n"+ dateTimeFormatter.format(now));
              }
              case '2' -> {
                  display(diary.viewEntry(entryID));
                  bodyUpdate = input("Edit Entry Body");
                  diary.editEntry(entryID,titleUpdate,bodyUpdate);
                  display(diary.viewEntry(entryID));
                  display("Body updated \n"+ dateTimeFormatter.format(now));
              }
          }
//            display("Entry updated \n"+ dateTimeFormatter.format(now));
        }catch (IllegalArgumentException error){
            display(error.getMessage());
        }

        goToMainMenu();
    }


    private static void deleteEntry() throws InterruptedException, IOException {

        try {
            int entryID = Integer.parseInt(input("Enter your diary ID"));
            display(diary.viewEntry(entryID));
            diary.deleteEntry(entryID);
            display("Entry Deleted \n"+ dateTimeFormatter.format(now));
        }catch (IllegalArgumentException error){
            display(error.getMessage());
        }
        goToMainMenu();
    }



    private static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
//		display(prompt);
//		return keyboardInputCollector.nextLine();
    }

    private static void display(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
//		System.out.println(prompt);
    }
}
