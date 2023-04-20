package deitelChapters.chapterFourteenFifteen;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
          try( var fileOutputStream = new FileOutputStream("dog");
               ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            Dog aja = new Dog("blaq", "walk");
            objectOutputStream.writeObject(aja);
          }catch (IOException | SecurityException exception){
                exception.printStackTrace();
          }
    }


}
