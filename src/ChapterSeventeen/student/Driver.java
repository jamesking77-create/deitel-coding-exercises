package ChapterSeventeen.student;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//
//        Student student1 = new Student("james", 25);
//        Student student2 = new Student("ade", 26);
//        Student student3 = new Student("ada", 26);
//        Student student4 = new Student("moyin", 14);
//
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//
//        Comparator<Student> getByAge = Comparator.comparingInt(Student::getAge)
//         .thenComparing(Student::getName);
//        students.sort(getByAge);
//        for (Student i : students) {
//            System.out.println(i.getAge() + ", " + i.getName());
//        }




        Map<String ,Integer> studentMap = new HashMap<>();
        studentMap.put("james", 34);
        studentMap.put("king", 34);
        studentMap.put("damian", 24);
        studentMap.put("prof", 14);


    }
}
