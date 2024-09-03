package FileHandeling;

import java.io.FileReader;
import java.io.FileWriter;

public class main {
    public static void main(String[] agrs){
        try{
            FileReader fi = new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\java\\switch\\rangetest");
            FileWriter fo = new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\java\\switch\\rangetest1");
            int val;
            while ((val = fi.read()) != -1) {
                System.out.println(val);
                fo.write(val);
            }
            fi.close();
            fo.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
