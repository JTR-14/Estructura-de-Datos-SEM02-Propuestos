/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

import javax.swing.DefaultListModel;

public class VectoresReales {
    private double vector[];
    private int totalElementos;

    public VectoresReales() {
        vector = new double[50];
        totalElementos = 0;
    }

    public VectoresReales(int limite) {
        vector = new double[limite];
        totalElementos = 0;
    }

    public boolean agregar(double valor) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = valor;
            totalElementos++;
            return true;
        } else {
            return false;
        }
    }

    public double devolverElemento(int indice) {
        return vector[indice];
    }

    public int getTotalElementos() {
        return totalElementos;
    }

    public void mostrar(DefaultListModel modelo) {
        modelo.removeAllElements();
        for (int i = 0; i < totalElementos; i++) {
            modelo.addElement(vector[i]);
        }
    }
    private void bubbleSortAscendente(double v[], int n){
        int i,j;
        double temporal;
        for(i=0 ; i<n-1; i++){
            for(j=n-1 ; j>i ; j--){
                if(v[j]<v[j-1]){
                    temporal = v[j];
                    v[j] = v[j-1];
                    v[j-1] = temporal;
                }
            }
        }
    }
    public void bubbleSortAscendente(){
        bubbleSortAscendente(vector, totalElementos);
    }
    private void bubbleSortDescendente(double v[], int n){
        int i,j;
        double temporal;
        for(i=0 ; i<n-1; i++){
            for(j=n-1 ; j>i ; j--){
                if(v[j]>v[j-1]){
                    temporal = v[j];
                    v[j] = v[j-1];
                    v[j-1] = temporal;
                }
            }
        }
    }
   public void bubbleSortDescendente(){
       bubbleSortDescendente(vector,totalElementos);
   }
}
