/*Escribir un programa que lea la estatura de tres personas, calcule el promedio de la altura de ellos y lo informe.*/

import java.util.Scanner;


public class Ejercicio4 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la altura de tres personas, separadas por un enter");
        float alt1 = s.nextFloat();
        float alt2 = s.nextFloat();
        float alt3 = s.nextFloat();

        float prom = ((alt1 + alt2 + alt3)/3);

        System.out.println("El promedio de las 3 alturas es: " + prom);

        s.close();
    }

}
