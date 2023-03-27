package DiaryApp;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Entry implements Serializable  {
    private String title;
    private String  body;
    private LocalDateTime dateTime;
    private int ID;

    @Override
    public String toString() {
        return "Entry{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", dateTime=" + dateTime +
                ", ID=" + ID +
                '}';
    }

    public Entry(LocalDateTime now, String title, String body) {
        this.title = title;
        this.body = body;


    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setID(int iD) {
        this.ID = iD;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }


    public LocalDateTime getDateAndTime() {
        return dateTime;
    }

    public int getID() {
        return ID;
    }
}
