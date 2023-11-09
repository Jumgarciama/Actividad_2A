import java.io.PrintStream;
import java.util.Scanner;

public class Ejer21{
    static PrintStream screen= System.out;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[]args){
        int num;

        screen.println("Ingrese un numero entero");
        num=keyboard.nextInt();
        if(num<0){
            screen.println("El numero es negativo");
        }else if(num>0){
            screen.println("El numero es positivo");
        }else{
            screen.println("El numero es 0");
        }


    }
}