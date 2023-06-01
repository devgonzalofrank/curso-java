/*Pedir al usuario que ingrese una temperatura en grados Celsius y mostrar 
por pantalla su equivalente en kelvin y grados Fahrenheit. Las fórmulas para conversiones son:
Kelvin = 273,15 + Celsius Fahrenheit = 1,8 × Celsius + 32*/

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el valor de la temperatura en grados celsius para mostrarlos en kelvin y fahrengeit");
        float temp = s.nextFloat();

        float tempKelvin = (float) (temp + 273.15);
        float tempFarenheit = (float) (temp * 1.8 + 32);

        System.out.println("La temperatura es: \n En Kelvin: " + tempKelvin + "\n En Farenheit: " + tempFarenheit);
        s.close();
    }
}
