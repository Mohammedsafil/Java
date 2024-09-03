// Create a class DataConverter that contains overloaded methods to convert values between different data types. Implement methods to convert:
//     1. An integer to a double
//     2. A double to an integer
//     3. A string to an integer (with error handling for invalid strings)

package Tests.test2;

public class main {
    public static void main(String []args){
        //object creation
        DataConvertor dc = new DataConvertor();
        //double to int 
        System.out.println(dc.convert(55.5));
        //int to double
        System.out.println(dc.convert(33));
        //string to int
        System.out.println(dc.convert("100"));
    }
}

class DataConvertor{
    public double convert(int val){
        return (double) val;
    }

    public int convert(double val){
        return (int) val;
    }

    public int convert(String val){
        try{
            return Integer.parseInt(val);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid String Convertion: "+ val);
            return 0;
        }
    }
}
