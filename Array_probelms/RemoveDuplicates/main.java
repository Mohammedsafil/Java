package RemoveDuplicates;
import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int j = 0;j<n-1;j++){
            if(arr[j] == arr[j+1]){
                for(int k = j;k<n-1;k++){
                    arr[k] = arr[k+1];
                }
                n--;
            }
            
        }

        for(int a = 0;a<n;a++){
            System.out.print(arr[a]+" ");
        }
    }
}
