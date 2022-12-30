package deitelChapters.chapterFive;

public class Stars {
    public static void main(String[] args) {

        int blankSpace = 29;
        for (int i  = 1; i <= 7; i+=2){
            for ( int j = 10; j < blankSpace; j++){
                System.out.print(" ");
            }
            for (int k  = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println(); blankSpace--;
        }
        int blankSpaces  = 19;
        for (int i = 21; i >= 13; i-=5){
            for (int j = 10; j < blankSpaces; j++ ){
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println(); blankSpaces+=2;
        }
        int blank = 22;
        int blank2 = 1;
              for (int i  = 1; i <= 7; i +=2) {
            for (int j = 10; j < blank; j++) {
                System.out.print(" ");}
            for (int k = 7; k >=i; k--) {
                System.out.print("*");
            }
            for (int l = 1; l <= blank2; l++){
                System.out.print(" ");
            }
            for (int k = 7; k >=i; k--) {
                      System.out.print("*");
                  }
            System.out.println();
            blank--; blank2+=6;
        }
    }
}
