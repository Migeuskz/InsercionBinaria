/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insercionbinaria;

/**
 *
 * @author Mikey
 */
public class binaria {
    
    public void binaria(int []a){
        for(int i = 0; i<a.length; i++){
            int aux = a[i];
            int izq = 1;
            int der = i - 1;
            while(izq <= der){
                int m = ((izq + der)/2);
                if(aux<=a[m]){
                    der = m -1;
                }else
                    izq = m + 1;
            }
            int j = 1 - i;
            while(j>=izq){
                a[j+1]=a[j];
                j = j-1;
            }
            a[izq]=aux;
        }
    }
    
}
