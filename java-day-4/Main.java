import java.util.Scanner;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) throws IOException
     {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Byte b;
        Short s;
        Integer i;
        Long l;
        Float f;
        Double d;
        Character c;
        String str;
        Boolean bl;
        BigDecimal bd;
        BigInteger bi;

        System.out.println("Enter Byte value : \n");
        b = Byte.parseByte(br.readLine());
        // b = sc.nextByte();
        System.out.println("Enter the short value :\n");
        s = Short.parseShort(br.readLine());
        // s = sc.nextShort();
        System.out.println("Enter Interger value : \n");
        i = Integer.parseInt(br.readLine());
        // i = sc.nextInt();
        System.out.println("Enter Long value : \n");
        l = Long.parseLong(br.readLine());
        // l = sc.nextLong();
        System.out.println("Enter Float value : \n");
        f = Float.parseFloat(br.readLine());
        // f = sc.nextFloat();
        System.out.println("Enter Double value : \n");
        d = Double.parseDouble(br.readLine());
        // d = sc.nextDouble();
        System.out.println("Enter Character value : \n");
        c = br.readLine().charAt(0);
        // c = sc.next().charAt(0);
        System.out.println("Enter String value : \n");
        str = br.readLine();
        // str = sc.nextLine();
        System.out.println("Enter Boolean value : \n");
        bl = Boolean.parseBoolean(br.readLine());
        // bl = sc.nextBoolean();
        System.out.println("Enter BigDecimal value : \n");
        bd = new BigDecimal(br.readLine());
        // bd = sc.nextBigDecimal();
        System.out.println("Enter BigInteger value : \n");
        bi = new BigInteger(br.readLine());
        // bi = sc.nextBigInteger();

        System.out.println("Data types & Values");
        System.out.println("Byte = "+b);
        System.out.println("\n");
        System.out.println("Short = "+s);
        System.out.println("\n");
        System.out.println("Integer = "+i);
        System.out.println("\n");
        System.out.println("Long = "+l);
        System.out.println("\n");
        System.out.println("Float = "+f);
        System.out.println("\n");
        System.out.println("Double = "+d);
        System.out.println("\n");
        System.out.println("Char = "+c);
        System.out.println("\n");
        System.out.println("String = "+str);
        System.out.println("\n");
        System.out.println("BigDecimal = "+bd);
        System.out.println("\n");
        System.out.println("BIgInteger = "+bi);

       // sc.close();

       br.close();



    }
}
