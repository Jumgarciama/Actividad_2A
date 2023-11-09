import java.io.PrintStream;
import java.util.Scanner;

public class Ejer23{
    static PrintStream screen= System.out;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[]args){
        int llantas;
        int total;

        screen.println("Ingrese el numero de llantas que compro");
        llantas=keyboard.nextInt();
        if(llantas <4){
            total=llantas*120000;
        }else{
            total=llantas*108000;
        }
        screen.println("El usuario debe pagar un total de "+total+" por la compra de "+llantas+" llantas");

    }
}
