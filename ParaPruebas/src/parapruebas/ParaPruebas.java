/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parapruebas;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ParaPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Menu");
        System.out.println("1) Diamante");
        System.out.println("Ingrese el numero de opcion: ");
        opcion = leer.nextInt();
        switch(opcion){
            case 1:{
                int filas;
                System.out.println("Ingrese numero de filas");
                filas=leer.nextInt();
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < 10; j++) {
                        
                    }
                }
                
            }
        }
    }
    
}
