package assignments;

public class Arr {
    public static void main(String[] args) {
        int row;
        int j;
        int sum = 0;
        int [][] array = {{1,2,3}, {6,7,5}, {8,9,2}, {4,6,5}};
        for (row = 0; row < array.length ; row++) {
                sum += array[sum][row];
            for ( j = 0; j < array.length; j++) {

                System.out.println(array[row][array[row].length-1]);
            }
        }
        System.out.println(sum);
    }

}
