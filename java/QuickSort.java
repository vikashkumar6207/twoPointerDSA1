import java.util.*;
import java.io.*;


public class QuickSort {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int getPivotIndex(int arr[], int left, int right){
        int i = left;
        for(int j = left;j <= right;j++){
            if(arr[j] < arr[right]){
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i = 0;i < n;i++){
        //     arr[i] = sc.nextInt();
        // }

        int arr[] = {10, 15, 1, 7, 6, 12, 5, 2};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        int index = getPivotIndex(arr, 0, n-1);
        System.out.println(index);
        System.out.println(Arrays.toString(arr));
    }
}
