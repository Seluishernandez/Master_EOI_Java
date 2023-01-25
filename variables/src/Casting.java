import javax.lang.model.SourceVersion;
import javax.lang.model.util.AbstractElementVisitor14;

public class Casting {
    public static void main(String[] args) {
        //Widenning casting
        byte miByte = 68; //1byte
        System.out.println("miByte = " + miByte);

        short miShort = miByte; //de 2 a4  bytes
        System.out.println("miShort =" + miShort);

        int miInt = miShort;
        System.out.println("miInt = " + miInt);

        long miLong = miInt;
        System.out.println("miLong = " + miLong);

       float miFloat = miLong;
        System.out.println("miFloat = " + miFloat);

        double miDouble = miFloat;
        System.out.println("miDouble= " + miDouble);
        System.out.println("________________________________________");

        //Narrowin casting
        miDouble = 456468.56e38d;
        System.out.println("miDouble = " + miDouble);

        miFloat = (float)miDouble;
        System.out.println("miFloat = " + miFloat);

        miLong = (long) miDouble;
        System.out.println("miLong = " + miLong);

        miInt = (int)miDouble;
        System.out.println("miInt = " + miInt);

        miShort = (short) miDouble;
        System.out.println("miShort = " + miShort);

        miByte = (byte) miDouble;
        System.out.println("miByte = " + miByte);

    }
}
