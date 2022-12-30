package deitelChapters.chapterFive;

public class Diamonds {
    public static void main(String[] james) {

        int blank = 5;
        for (int i = 1; i <= 10; i+= 2){
            for (int j = 1; j <= blank; j++){
                System.out.print(j);
            }
            for ( int j = 1; j <= 10; j++){
                System.out.print(" ");
            }
            System.out.println();
            blank--;
    }
        System.out.println();
        blank = 1;
        for(int i = 10; i >= 1; i-=2){
            for (int j = 1; j <=blank; ++j){
                System.out.print(j);
            }
            for (int j = 1; j <= i; ++j){
                System.out.print(" ");
            }
            System.out.println();
            blank++;
        }

}}
