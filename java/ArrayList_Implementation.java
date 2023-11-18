import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Implementation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> li = new ArrayList<>();
        for(int i = 0;i<n;i++){
            li.add(sc.nextInt());

        }
        for(int i = 0;i<n;i++){
            System.out.print(li.get(i)+" ");
        }
    }
}
