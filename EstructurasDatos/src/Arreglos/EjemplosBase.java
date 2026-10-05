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
public class EjemplosBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Configuracion Ingreso Teclado Scanner
       Scanner lector=new Scanner(System.in);
       
        // Promedio de las edades de todos los alumnos
        int edad=23;
        int edad2=12;
        int edad3=23;
        
        // Creo como arreglos 
        //Cuantos valores voy a poder colocar ???? 5
        //Arreglo es estatico: debo declarar cuantos elementos
        // tiene desde el inicio 
        
        int edades[]=new int[10]; //con new
        String nombres[]={"Efrain","Lucia","Patricia","Carlos"};// con el paso de valores
        
        
        //Ingreso de datos de arreglos
        edades[0]=3;
        edades[1]=14;
        edades[2]=12;
        edades[3]=23;
        
        //Asignacion de datos se usa FOR
        // automaticamente
        for(int i=0;i<10;i++){
            edades[i]=(int)(Math.random()*100+1);
        }
        //por teclado
        for(int i=0;i<10;i++){
            System.out.println("Ingresa el valor numero "+i);
            edades[i]=lector.nextInt();
        }

        //Lectura de datos    
        //System.out.println(edades[1]);
        //System.out.println(edades[2]);
        //System.out.println(edades[9]);
        //System.out.println(edades[10]);//Error por que no esta dentro de los indices 0 al 9
        
        for(int i=0;i<edades.length;i++){
            System.out.print(edades[i]+" ");
        }
        System.out.println("");
        
        
        
        
        
        
        
        
    }
    
}
