package chapterThree;

public class Native {
    private String name;
    private String phoneNumber;
    private String idNumber;
    private int age;
    private double height;

    public void setName(String giveName) {
        name = giveName;
    }
    public String getName(){
        return name;
    }
    public void setPhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setIdNumber(String giveIdNumber) {
        idNumber = giveIdNumber;
    }

    public String getIdNumber() {
    return idNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight(){return height;}

}
