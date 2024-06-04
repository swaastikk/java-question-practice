//SELECTION SORTING 1
import java.util.*;

public class roj12sorting {
    public static void main(String[] args) {
        int[] arr = { 2, 8, 5, -7, 5, 19, 26, 37, 84, 99 };
        SelectionSort(arr);
    }

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minval = arr[i];
            int minidx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minval) {
                    minval = arr[i];
                    minidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
        }
        System.out.print(arr+" ");
    }
}