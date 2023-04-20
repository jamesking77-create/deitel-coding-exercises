package RandomPractice;

import java.util.Arrays;

public class LcmFinder{
    public static void main(String[] args) {
        lcmFInder(50);
    }

    public  static  int[] lcmFInder(int number) {
        int count = 1;
        int [] j = new int[0];
        int  prime = number/ 2;
        int [] arr = new int[prime/2];
        arr[0] = 2;
        int i = 1;
        while (prime>1){
            i++;
            if (prime % i == 0) {
                prime = prime / i;
                arr[(count)] = i;
                count++;
//                System.out.println(Arrays.toString(arr));
                j =  Arrays.stream(arr).filter(x -> x > 0).toArray();
            }
        }
//        System.out.println(Arrays.toString(j));
        return j;
    }
}

