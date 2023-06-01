/*Pedir al usuario que ingrese el 
precio de un producto y el porcentaje de descuento. A continuación mostrar por pantalla el 
importe descontado y el importe a pagar. */

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("Introduzca el precio del producto");
            float precio = s.nextFloat();
            System.out.println("Ingrese el porcentaje de descuento, solo el numero");
            float porc = s.nextFloat();

            float descuento = precio/100*porc;
            float aPagar = precio-descuento;

            System.out.println("El importe a pagar con descuento es: " + aPagar + ", el descuento es de: " + descuento);

            s.close();
    }

}
