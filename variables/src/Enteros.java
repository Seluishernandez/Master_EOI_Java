import java.sql.SQLOutput;

public class Enteros {
    public static void main(String[] args) {
        //Tipo byte
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("En bytes son:" + Byte.BYTES );
        System.out.println("En bits son:" + Byte.SIZE);
        System.out.println("Maximo: " +  Byte.MAX_VALUE);
        System.out.println("Minimo: " +  Byte.MIN_VALUE);
        System.out.println("----------------------------" );

        //Tipo Short
        short numeroshort = 255;
        System.out.println("numeroShort = " + numeroshort);
        System.out.println("En bytes son:" + Short.BYTES );
        System.out.println("En bits son:" + Short.SIZE);
        System.out.println("Maximo: " + Short.MAX_VALUE);
        System.out.println("Minimo: " + Short.MIN_VALUE);
        System.out.println("----------------------------" );

        // TIPO INT
        int numeroInt = 250000;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("En bytes son:" + Integer.BYTES );
        System.out.println("En bits son:" + Integer.SIZE);
        System.out.println("Maximo: " + Integer.MAX_VALUE);
        System.out.println("Minimo: " + Integer.MIN_VALUE);
        System.out.println("----------------------------" );

    }


}
