package chapterFourteenFifteen;

import java.io.Serializable;

public class Dog implements Serializable {
    private static final long serialVersionUID = -6929421958750934596L;
    private String name;
    private String walk;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", walk='" + walk + '\'' +
                '}';
    }

    public Dog(String name, String walk) {
        this.name = name;
        this.walk = walk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }
}
