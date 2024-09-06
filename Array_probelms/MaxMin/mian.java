package MaxMin;
import java.util.*;
public class mian {
    public static void main(String[] args){
        TreeSet<Integer> st = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            st.add(sc.nextInt());
        }

        System.out.println("Min: "+st.first());
        System.out.println("Max: "+st.last());


    }
}
