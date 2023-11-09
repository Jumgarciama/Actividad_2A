import java.io.PrintStream;
import java.util.Scanner;

public class Ejer20{
    static PrintStream screen= System.out;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[]args){
        int num;

        screen.println("Por favor ingrese un numero entero");
        num=keyboard.nextInt();

        if(num%2<=0){
            screen.println("El numero es par");
        }
        else{
            screen.println("El numero es impar");

        }



    }
}
