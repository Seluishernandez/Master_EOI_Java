import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class IntroduccionDeDatosPorConsola {
    public static void main(String[] args) {
        //leer dato por consola

        String dato;
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce un entero: ");
        dato = entrada.nextLine();
       //System.out.println("entrada = " + entrada);


        //comvertir y representar en diferentes sistemas
        int numDecimal = Integer.parseInt(dato);
        System.out.println("Decimal = " + numDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal));
    }
    }


