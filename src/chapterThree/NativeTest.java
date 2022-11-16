package chapterThree;
//import java.util.Scanner;

public class NativeTest {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        Native newName = new Native ();
//        System.out.println("Please enter your name: ");
//        String name = input.nextLine();
        newName.setName("james king");
        System.out.println();
        System.out.println(newName.getName());

//        System.out.println("Please enter your phone number: ");
//        String phoneNumber = input.nextLine();
        newName.setPhoneNumber("08142186524");
        System.out.println();
        System.out.println(newName.getPhoneNumber());

//        System.out.println("Please enter your id number: ");
//        String idNumber = input.nextLine();
        newName.setIdNumber("233476490");
        System.out.println();
        System.out.println(newName.getIdNumber());

        newName.setAge(25);
        System.out.println();
        System.out.println(newName.getAge());

        newName.setHeight(6.5);
        System.out.println();
        System.out.println(newName.getHeight());


    }
}
