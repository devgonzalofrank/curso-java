/*Escribir un programa que lea 
dos números y realice el cálculo de la suma, 
la resta, la multiplicación y la división entre 
ambos valores. Los resultados deben mostrarse 
por pantalla. */

import java.util.Scanner;

public class ejercicio3 {
    
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese dos numeros, separados por un enter");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        System.out.println("Suma de ambos numeros: " + (num1+num2));
        System.out.println("Resta de ambos numeros: " + (num1-num2));
        System.out.println("Multiplicacion de ambos numeros: " + (num1*num2));
        System.out.println("Division de ambos numeros: " + (num1/num2));
        s.close();
    }

}
