import java.util.Scanner;

public class twoPointer {
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0;i < n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // static void sortZerosAndOne(int arr[], int left, int right){
    //     int n = arr.length;
    //     left = 0;
    //     right = n-1;
    //     while (left < right) {
    //         if(arr[left] == 1 && arr[right] == 0){
    //             swap(arr, left, right);
    //             left++;
    //             right--;
    //         }
    //         if(arr[left] == 0){
    //             left++;
    //         }
    //         if(arr[right] == 1){
    //             right--;
    //         }
    //     } 
    // }



    
    /*given an array of integer 'a' move all the even integer at the beginning of the array followed by 
    all the odd integers. The relarive order of odd or even integers does not matter.Return any array that 
    satisfies the condition.  */
        // static void EvenSort(int arr[], int left, int right){
        //     int n = arr.length;
        //      left = 0;
        //      right = n-1;
        //      while (left < right) {
        //         if(arr[left] % 2 != 0 && arr[right] % 2 == 0){
        //             swap(arr, left, right);
        //             left++;
        //             right--;
        //         }
        //         if(arr[left]%2==0){
        //             left++;
        //         }
        //         if (arr[right]%2!= 0) {
        //             right--;
        //         }
        //      }
        // }


        /*Given an integer array 'a' sorted in non-decreasing order, return an array of the square of 
        each number sorted innon-decdecresing order. */

        static void reverse(int arr[]){
            int i= 0;
            int j = arr.length-1;
            while (i < j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        static int[] sortSquares(int arr[]){
            int n = arr.length;
            int left = 0;
            int right = n-1;
            int ans[] = new int[n];
            int k = 0;
            while (left <= right) {
                if(Math.abs(arr[left]) > Math.abs(arr[right])){
                    ans[k] = arr[left]*arr[left];
                    k++;
                    left++;
                }else{
                    ans[k] = arr[right]*arr[right];
                    k++;
                    right--;
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        int ans[] = sortSquares(arr);
        // sortZerosAndOne(arr,0 , n-1);

        // EvenSort(arr, 0, n-1);
        
        // printArray(arr);
        reverse(ans);
        printArray(ans);
    }
}
