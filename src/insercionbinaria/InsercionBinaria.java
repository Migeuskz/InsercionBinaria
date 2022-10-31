/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insercionbinaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mikey
 */
public class InsercionBinaria {
 public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]arreglo = new int[10];
        for(int i = 0; i<arreglo.length;i++){
            arreglo[i] = (int)(Math.random()*100);
        }
        binaria b = new binaria();
        //Antes de ordenar
        for(int x : arreglo){
            System.out.println(x+",");
        }
        b.binaria(arreglo);
        //Despues de ordenar
        System.out.println("");
        for( int x : arreglo){
            System.out.println(x+",");
        }
    }
    
}
