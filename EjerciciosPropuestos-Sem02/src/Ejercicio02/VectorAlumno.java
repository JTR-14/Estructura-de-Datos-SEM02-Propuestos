/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

import javax.swing.table.DefaultTableModel;


public class VectorAlumno {
    private Alumno vector[];
    private int totalElementos;

    public VectorAlumno() {
        vector = new Alumno[50];
        totalElementos=0;
    }
    
    public void agregar(Alumno valor){
        if(totalElementos< vector.length){
            vector[totalElementos] =valor;
            totalElementos++;
        }    
    }
    public void mostrar(DefaultTableModel modelo){
        Object datos[][]= new Object[totalElementos][2];
        String titulos[] = {"Nombre","Nota"};
        for(int i=0; i<totalElementos;i++){
            datos[i][0] = vector[i].getNombre();
            datos[i][1] = vector[i].getNota();
        }
        modelo.setDataVector(datos, titulos);
    }
    
}
