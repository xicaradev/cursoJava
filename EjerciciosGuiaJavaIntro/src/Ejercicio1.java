
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardoxicara
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresa un número: ");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese otro número: ");
        int num2 = leer.nextInt();
        
        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + (num1 + num2));
        
    }
    
}
