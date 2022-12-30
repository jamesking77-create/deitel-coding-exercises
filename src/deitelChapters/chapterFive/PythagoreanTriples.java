package deitelChapters.chapterFive;

public class PythagoreanTriples {
    public static void main(String[] args) {
        int sideOne;
        int sideTwo;
        int hypo;
        for (sideOne = 1; sideOne <= 500; ++sideOne){
          a:  for (sideTwo = sideOne + 1; sideTwo <= 500; ++sideTwo){
                for (hypo = sideTwo  + 1; hypo <= 500; ++hypo){
                    if ((hypo*hypo) == (sideOne * sideOne + sideTwo * sideTwo)){
                        System.out.printf("%d^2 + %d^2 = %d^2  %n",sideOne, sideTwo, hypo );
                        break a;
                    }
                }

            }
        }


    }
}
