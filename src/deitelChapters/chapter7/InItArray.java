package deitelChapters.chapter7;

public class InItArray {
    public static void main(String[] args) {
        int [][] array1 = {{1,2,3}, {4, 5, 6}};
        int [][] array2 = {{1, 2}, {3}, {4, 5, 6}};
        System.out.println("array in index 1: ");
        outputArray(array1);
        System.out.println("array in index 2: ");
        outputArray(array2);
    }

    public static void outputArray(int[][] arrays){
        for (int[] array : arrays) {
            for (int i : array) {
                System.out.printf(" %d ", i);

            }
            System.out.println();
        }
    }
}
