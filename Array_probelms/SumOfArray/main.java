package SumOfArray;
import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;

        for(int a:arr){
            sum += a;
        }

        System.out.println("Sum of Array is : "+sum);
    }
}
