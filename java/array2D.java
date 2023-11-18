import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [][]matrix = new int[a][b];
        for(int i =0;i < a; i++){
            for(int j = 0; j < b; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < a;i++){
            for(int j = 0; j < b; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}