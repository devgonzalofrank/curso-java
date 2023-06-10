/*A partir de una cantidad de pesos que el usuario ingresa a través del teclado se debe obtener su equivalente en dólares, 
en euros, en guaraníes y en reales. Para este ejercicio se consideran las siguientes tasas:
1 dólar = 231,68 pesos
1 euro = 250,69 pesos
1 peso = 31,00 guaraníes 1 real = 46,81 pesos
Tip: en este ejercicio se puede usar la función printf y mostrar el resultado con dos decimales. */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un valor en pesos para hacer la conversion a otras monedas");
        float pesos = s.nextFloat();

        float dolar =(float) (pesos / 231.68);
        float euro = (float) (pesos / 250.69);
        float guarani = ((float) pesos * 31);
        float real = (float) (pesos / 46.81);

        s.close();

        System.out.println("Valor en pesos: " + pesos + "\n Valor en dolares: " + dolar + "\n Valor en euros: " + euro + "\n Valor en guarani: " + guarani + "\n Valor en reales: " + real);
        // System.out.printf("%.01f", real);
    }
}
