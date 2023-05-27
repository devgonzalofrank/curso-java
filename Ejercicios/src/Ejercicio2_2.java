/*Escribir un programa que lea una palabra por teclado y determine si es un palíndromo.
Tip: los palíndromos son palabras que se leen igual de izquierda a derecha y viceversa. Por ejemplo, reconocer. */

import java.util.Scanner;

public class Ejercicio2_2 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca una palabra para determinar si es un palindromo");

        String cadena = s.nextLine();

        int fin = cadena.length()-1;
        int ini = 0;

        boolean var = true;

        while(ini < fin){
            if(cadena.charAt(ini)!=cadena.charAt(fin)){
                var=false;
            }
        ini++;
        fin--;
        }

        if(var){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }

        s.close();
    }

}
