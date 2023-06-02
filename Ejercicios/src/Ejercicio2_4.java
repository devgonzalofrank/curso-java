/*Escribir un algoritmo que calcule el factorial de un número ingresado por teclado.
Tip: el factorial de un número n es el resultado de multiplicar todos los números enteros desde 1 hasta n.
Por ejemplo, el factorial de 5 es 1 × 2 × 3 × 4 × 5 = 120. */

import java.util.Scanner;

public class Ejercicio2_4{
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un numero para calcular el factorial");
        int num = s.nextInt();
        s.close();

        int aux;
        int factorial = num;
        for(aux=num-1; aux>=1; aux--){
            factorial = factorial * aux;
        }

        System.out.println("El resultado factorial es: " + factorial);
    }
}
