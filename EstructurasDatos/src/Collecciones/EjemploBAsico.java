/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collecciones;

import java.util.ArrayList;

/**
 *
 * @author kepb
 */
public class EjemploBAsico {
    public static void main(String[] args) {
        ArrayList<String> nombres=new ArrayList<String>();
        
        nombres.add("nombre1");
        nombres.add("nombre2");
        
        for(int i=0;i<nombres.size();i++){
            nombres.set(i,"Valor");
        }
        
        for(int i=0;i<nombres.size();i++){
            System.out.println(nombres.get(i));
        }
        
        
        ArrayList<Estudiante> listaEstudiantes=new ArrayList<Estudiante>();
        
        Estudiante e1=new Estudiante();
        Estudiante e2=new Estudiante();
        
        listaEstudiantes.add(e1);
        listaEstudiantes.add(e2);
        
        
        
        
     }
}
