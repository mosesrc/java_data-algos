import java.util.Arrays;

public class Test {

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] array) {
        System.out.println(Arrays.toString(array) + "\n");
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {  // 4
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        String arrayPrinted = Arrays.toString(array);
        System.out.println(arrayPrinted);
        }
    }
    
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        bubbleSort(intArray);

//        BUBBLE SORT
    }
}
