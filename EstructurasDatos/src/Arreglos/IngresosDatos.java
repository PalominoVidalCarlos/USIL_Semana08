/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arreglos;
//se necesita importar para usar el Scanner
import java.util.Scanner;

/**
 *
 * @author kepb
 */
public class IngresosDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Configuracion Ingreso Teclado Scanner
        Scanner lector=new Scanner(System.in);
        int n;
        double m;
        String nombre,apellido;
       
        System.out.println("Ingresa un nombre");
        nombre=lector.nextLine();
        System.out.println("Entero");
        n=lector.nextInt();
        System.out.println("double");
        m=lector.nextDouble();
        
        System.out.println("Ingresa apellido");
        lector.nextLine();
        apellido=lector.nextLine();
        
        
        
        
       
    }
    
}
