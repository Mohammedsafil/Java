import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        int flag = 0,leap = 0,d = 0,oddday = 0,ans;
        int y = (year-1)%400;
        boolean isleap = false;
        
        if(year%4==0 && year%100!=0 && year%400==0)isleap = true;
        
        if(y>=300){
            y = y%300;
            flag = 1;
        }
        else if(y>=200){
            y = y%200;
            flag = 3;
        }
        else if(y>=100){
            y = y%100;
            flag = 5;
        }
        
        leap = y/4;
        
        flag = flag + leap*2 + y-leap;
        
        switch(month-1){
            case 1:
                d = 3;
                break;
            case 2:
                if(isleap) d = 4;
                else d = 3;
                break;
            case 3:
                if(isleap) d = 7;
                else d = 6;
                break;
            case 4:
                if(isleap) d = 9;
                else d =8;
                break;
            case 5:
                if(isleap) d = 12;
                else d = 11;
                break;
            case 6:
                if(isleap) d = 14;
                else d = 13;
                break;
            case 7:
                if(isleap) d = 17;
                else d = 16;
                break;
            case 8:
                if(isleap) d = 20;
                else d = 19;
                break;
            case 9:
                if(isleap) d = 22;
                else d = 21;
                break;
            case 10:
                if(isleap) d = 25;
                else d = 24;
                break;
            case 11:
                if(isleap) d = 27;
                else d = 26;
                break;
        }
        
        oddday = d%7;
        ans = (flag + d + oddday)%7;
        System.out.println(flag);
        System.out.println(d);
        System.out.println(oddday);
        
        // switch(ans){
        //     case 0:
        //         return "Sunday";
        //     case 1:
        //         return "Monday";
        //     case 2:
        //         return "Tuesday";
        //     case 3:
        //         return "Wednesday";
        //     case 4:
        //         return "Thursday";
        //     case 5:
        //         return "Friday";
        //     case 6:
        //         return "Saturday";
        // }
        String [] str = new String[7];
        str[0] = "Sunday";
        str[1] = "Monday";
        str[2] = "Tuesday";
        str[3] = "Wednesday";
        str[4] = "Thursday";
        str[5] = "Friday";
        str[6] = "Saturday";
        
        return str[ans];
        
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
