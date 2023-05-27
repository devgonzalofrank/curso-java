/*Pedir al usuario que ingrese el valor del radio de una circunferencia. 
Calcular y mostrar por pantalla el área y el perímetro. 
Recordá que el área y el perímetro se calculan con las siguientes fórmulas:

area = PI × radio2 perimetro = 2 × PI × radio
Tip: para este ejercicio se puede usar la constante matemática PI (π) disponible en la clase Math.
 */

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio de una circunferencia en centimetros");
        float radio = s.nextFloat();

        float area = (float) ((Math.PI * (Math.pow(radio, 2))));
        float per = (float) (2 * (Math.PI) * radio);
        System.out.println("El area de la circunferencia es: " + area + " centrimetros, y el perimetro es: " + per + "centimetros");
        s.close();
    }

}
