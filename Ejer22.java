import java.io.PrintStream;
import java.util.Scanner;

public class Ejer22{
    static PrintStream screen= System.out;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[]args){
        int num;

        screen.println("Ingrese un numero entero");
        num=keyboard.nextInt();
        if(num<0){
            if(num%2*-1>0){
                
                screen.println("El numero es negativo e impar");

            }else{

                screen.println("El numero es negativo y par");
        }
        }else if(num>0){
            if(num%2<=0){

                screen.println("EL numero es positivo y par");

            }else{
                
                screen.println("El numero es positivo e impar");
            }
        }else{
            screen.println("El numero es 0 y par");
        }

    }
}