/*Escribir un programa en el cual se le 
pregunte al usuario su nombre. A continuación, 
mostrar un mensaje que diga “Hola, ” 
completando el mensaje con el nombre que 
ingresó el usuario.*/

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class ejercicio2 {

        public static void main(String[] args){
            System.out.println("Por favor, ingrese su nombre");
            Scanner s = new Scanner(System.in);
            String nombre = s.nextLine();
            System.out.println("Hola, " + nombre);
        }
}
