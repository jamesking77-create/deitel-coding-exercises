package assesments;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 65,1000, 500, 345};
        getSecondLargest(arr, arr.length);
    }

    public static void getSecondLargest(int[] arr, int arrSize) {
        for (int i = arrSize - 2; i >= 0; i--) {
            if (arr[i] != arr[arrSize - 1]) {
                System.out.printf("The second largest element is %d", arr[i]);
                return;
            }
        }
    }
}
