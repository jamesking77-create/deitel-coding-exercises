package DiaryApp;


public class DiaryUser  {
    private String name;  
    private String password;
    private Diary diary;

    public DiaryUser(String name, String password, Diary diary) {
        this.name = name;
        this.password = password;
        this.diary = diary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Diary getDiary() {
        return diary;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }
}
