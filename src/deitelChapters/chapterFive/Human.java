package deitelChapters.chapterFive;



public class Human {
    public static void main(String[] args) {
        Person person1 = new Person("james",23,Gender.MALE );
        Person person2 = new Person("grace",40, Gender.FEMALE);
        Person person3 = new Person("grace",40, Gender.NON_BINARY);
    }

    private  static  int countMales(Person... people){
        int counter = 0;
        for (int i = 0; i < people.length; i++){
            if (people [i].getGender()==Gender.MALE)counter++;
        }
        return counter;
    }
}
