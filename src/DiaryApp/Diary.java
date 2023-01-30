package DiaryApp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Diary {

    private  String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static   List<Entry> entries = new ArrayList<>();

    public void createEntry(String title, String body) {
        Entry entry  = new Entry(LocalDateTime.now(), title, body);
        entries.add(entry);

     }
    public int numberOfEntries(){
        return entries.size();
    }



    public String viewEntry(int ID) {
        ID = ID - 1;
        validateID(ID);
        return String.format(""" 
                 +============================+
                 Title: %s
                 +============================+
                 Body: %s
                 +============================+
                 """, entries.get(ID).getTitle(), entries.get(ID).getBody());
    }

    public void deleteEntry(int ID) {
         ID = ID - 1;
         validateID(ID);
         entries.remove((ID));
     }

    public int countEntry() {
        return entries.size();
    }

    public void editEntry(int ID, String titleUpdate, String bodyUpdate) {
         ID = ID -1;
         validateID(ID);
         entries.get(ID).setBody(bodyUpdate);
         entries.get(ID).setTitle(titleUpdate);

        }
        public void validateID(int ID){
            if (ID < 0 || ID > entries.size()|| ID == entries.size()){
                throw new IllegalArgumentException(" Entry ( ID ) does not exist");

            }
        }

        public static class DiaryException extends RuntimeException{
            public DiaryException(String errorMessage){
            super (errorMessage);

            }
        }

    }

