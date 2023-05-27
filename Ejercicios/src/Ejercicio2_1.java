
/*Escribir un programa que reciba un número entero por teclado. A continuación, mostrar la tabla de multiplicar de ese número. */

import java.util.Scanner;

public class Ejercicio2_1 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un numero entero para obtener su tabla de multiplicar");
        
        int num = s.nextInt();

        for (int valor = 1; valor <= 10; valor++){
            System.out.println(valor + " x " + num + "=" + valor*num);
        }

        s.close();
    }

}
