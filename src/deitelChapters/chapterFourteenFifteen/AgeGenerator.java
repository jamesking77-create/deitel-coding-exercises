package deitelChapters.chapterFourteenFifteen;

import java.time.LocalDate;
import java.util.Arrays;

public class AgeGenerator {
    public static void main(String[] args) {
        generateAge("18/04/2001");
    }

    private static void generateAge(String dateOfBirth) {
        int count = 0;
        int age = 0;
        String currentDate = LocalDate.now().toString();
        String [] splitCurrentDate = currentDate.split("-");
        String [] splitDate = dateOfBirth.split("/");
        int dob = Integer.parseInt(splitDate[2]);
        int cud = Integer.parseInt(splitCurrentDate[0]);
        int dom = Integer.parseInt(splitDate[1]);
        int cum = Integer.parseInt(splitCurrentDate[1]);
        int dd = Integer.parseInt(splitDate[0]);
        int cdd = Integer.parseInt(splitCurrentDate[2]);

        for (int i = dob; i < cud ; i++) {
            count ++;
        }
        if (cum < dom){
             age = count-1;
        }else if (cdd < dd){
            age = count-1;
        }else {
            age = count;
        }

        System.out.printf("your are %d years old", age);
    }
}
