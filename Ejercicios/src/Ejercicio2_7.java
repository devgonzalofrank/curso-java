/*Del listado de abajo, determinar qué animal eligió el usuario mediante la realización de tres preguntas del tipo SI/NO 
acerca de las tres características elegidas (herbívoro, mamífero, doméstico). Mostrar el resultado por pantalla. */

import java.util.Scanner;

public class Ejercicio2_7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Desea Herbiboro? Si: 1, No:0");
        int cond1 = s.nextInt();
        System.out.println("Desea Mamifero? Si: 1, No:0");
        int cond2 = s.nextInt();
        System.out.println("Desea Domestico? Si: 1, No:0");
        int cond3 = s.nextInt();
    
        if(cond1 == 0 && cond2 == 0 && cond3 == 0){
            System.out.println("Su animal es el Condor");
        }else{
            if(cond1 == 1 && cond2 == 0 && cond3 == 0){
                System.out.println("Su animal es el caracol");
            }else{
                if(cond1 == 1 && cond2 == 1 && cond3 == 0){
                    System.out.println("Su animal es el alce");
                }else{
                    if(cond1 == 1 && cond2 == 1 && cond3 == 1){
                        System.out.println("Su animal es el caballo");
                    }else{
                        if(cond1 == 0 && cond2 == 1 && cond3 == 0){
                            System.out.println("Su animal es el leon");
                        }else{
                            if(cond1 == 0 && cond2 == 1 && cond3 == 1){
                                System.out.println("Su animal es el gato");
                            }else{
                                if(cond1 == 0 && cond2 == 0 && cond3 == 1){
                                    System.out.println("Su animal es la piton");
                                }else{
                                    if(cond1 == 1 && cond2 == 0 && cond3 == 1){
                                        System.out.println("Su animal es el tortuga");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        s.close();
    }
}
