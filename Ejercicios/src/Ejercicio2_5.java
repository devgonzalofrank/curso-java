/*Escribir un algoritmo que lea un valor n por teclado y muestre los primeros n términos de la sucesión de Fibonacci.
Tip: la sucesión de Fibonacci comienza con 0, luego 1 y a partir de allí cada nuevo número es la suma de los dos anteriores. */
import java.util.Scanner;

public class Ejercicio2_5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int valor = s.nextInt();

        int cont = 0;
        int fibo = 1;
        int aux2 = 1;
        System.out.println("\n0\n1");
        for(int aux=1;cont<valor-2;cont++){
            aux=aux2;
            System.out.println("\n" + fibo);
            aux2 = fibo;
            fibo = fibo + aux;

        }
        s.close();
    }
}
