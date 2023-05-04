package ChapterSeventeen.student;

import deitelChapters.chapterSixteen.Customer;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private final String  name;
    private final int  age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student student) {
        if (this.getAge() >student.getAge()) return 1;
        else if (student.getAge() > this.getAge()) return  -1;
        return 0;
    }
}
