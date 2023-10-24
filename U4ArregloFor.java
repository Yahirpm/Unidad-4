/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u4arreglofor;
import java.util.Scanner;

/**
 *
 * @author ederp
 */
public class U4ArregloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] numeros = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        Scanner calcu = new Scanner(System.in);
        
        int opcion;
        
        do {
            
            System.out.println("Bienvenido");
            System.out.println("Menu");
            System.out.println("Seleccione una opcion");
            System.out.println("1.Sumar");
            System.out.println("2.Multiplicar");
            System.out.println("3.Salir");
            
            opcion = calcu.nextInt();
            
            switch (opcion) {
                case 1:
                    double suma = 0;
                    for(double elemento : numeros){
                    suma += elemento;
                    }
                    System.out.println("La suma de los numeros es " + suma);
                    break;
                
                case 2:
                    double multiplicacion = 1;
                    for(double elemento : numeros){
                    multiplicacion *= elemento;
                    }
                    System.out.println("La multiplicacion de los numeros es "+ multiplicacion);
                    break;
                
                case 3:
                     System.out.println("Gracias por usarlo, vuelve pronto");
                     break;
                     
                default:
                    System.out.println("Por favor seleciona una opcion valida");
            }
                    
            
            
        } while (opcion !=3);
    }
    
}
