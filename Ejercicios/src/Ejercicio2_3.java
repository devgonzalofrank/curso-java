/*Escribir un programa que ordene un arreglo de números enteros de manera ascendente. */

import java.util.Arrays;

public class Ejercicio2_3 {
    public static void main(String[] args){
        int enteros[] = {32, 20, 45};

        Arrays.sort(enteros);

        for(int aux=0; aux<enteros.length; aux++){
            System.out.println(enteros[aux]);
        }
    }
}
