/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_recrecursividad;

/**
 *
 * @author Luis
 */
public class EVA2_8_RECRECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    }
    public static void imprimirCiclo(int numero){
        for(int i = numero;i >= 1 ;i--){
            System.out.println(i + "-");
        }
        System.out.println("");
    }
    public static void imprimirRecu(int numero){
        // resuelve una parte del problema
        // se llame a si mismo
        System.out.println(numero +" - ");
        // SE LLAMA A SI MISMO
        imprimirRecu(numero - 1);
        if(numero > 1){// DETENER LA RECURSIBIDAD
            imprimirRecu(numero - 1);
        }
    }
}
