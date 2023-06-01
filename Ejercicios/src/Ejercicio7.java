/*Escribir un programa que reciba el valor de dos edades y las guarde en dos variables. 
Luego el programa debe intercambiar los valores de ambas variables y mostrarlas por pantalla. 
Por ejemplo, si el usuario ingresó los valores edad1 = 24 y edad2 = 35, el programa deberá mostrar edad1 = 35 y edad2 = 24.
Tip: para intercambiar los valores de dos variables se debe utilizar una variable auxiliar.
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el valor de dos variables, separadas por un enter");
        int edad1 = s.nextInt();
        int edad2 = s.nextInt();

        int aux = edad1;
        edad1 = edad2;
        edad2 = aux;
        System.out.println("Edad 1: " + edad1 + "\nEdad 2: " + edad2);

        s.close();
    }
}
