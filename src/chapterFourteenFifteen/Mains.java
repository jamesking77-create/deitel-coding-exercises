package chapterFourteenFifteen;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Mains {
    public static void main(String[] args) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\USER\\IdeaProjects\\javaProject1\\dog"))) {
            var dog = (Dog) objectInputStream.readObject();
            System.out.println(dog);
        }catch (IOException|SecurityException|ClassNotFoundException exception){
            exception.printStackTrace();
        }
    }
}
