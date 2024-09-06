package MergeTwoSortedArray;
import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        int []arr3 = new int[n1+n2];
        for(int i=0;i<n1;i++){
            arr3[i] = arr1[i];
        }


        for(int i=0;i<n2;i++){
            arr3[n1+i] = arr2[i];
        }

        Arrays.sort(arr3);

        for(int a:arr3){
            System.out.print(a+" ");
        }


    }
}
