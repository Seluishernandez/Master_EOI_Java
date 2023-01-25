import java.util.Scanner;

public class IntroduccionDeDatosErrores {
    public static void main(String[] args) {


        //leer dato por consola
        String dato;
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce un entero: ");
        dato = entrada.nextLine();
       //System.out.println("entrada = " + entrada);

        //converitri dato a entero
        int numDecimal = 0;

        //control de error en la conversion de dato a entero
        try{
            numDecimal = Integer.parseInt(dato);
    }catch (NumberFormatException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("ERROR - has de introducir un numero entero");
            main(args);
            System.exit(0);
        }


        //comvertir y representar
      numDecimal = Integer.parseInt(dato);
        System.out.println("Decimal = " + numDecimal);
        System.out.println("Binario = 0b" + Integer.toBinaryString(numDecimal));
        System.out.println("Octal = 0" + Integer.toOctalString(numDecimal));
        System.out.println("Hexadecimal = 0x" + Integer.toHexString(numDecimal));


    }
    }
