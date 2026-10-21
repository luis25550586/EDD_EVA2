/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author Luis
 */
public class EVA2_3_LISTA_DOBLE {

    
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        /*int[] arreglo = new int[1000000];
        long ini, fin, tiempo;
        ini = System.nanoTime();// toamos laa Hora antes e empezar 
        
        for (int i = 0; i < arreglo.length;i++){
            arreglo[i] = (int)(Math.random() * 100);
        }
        fin = System.nanoTime();// tomamos la hora despues de realizar el proceso
        tiempo = fin - ini;
        System.out.println("Tiempo arreglo = " + tiempo);
        
        ini = System.nanoTime();// toamos laa Hora antes e empezar 
        for (int i = 0; i < 1000000;i++){
            lista.agregar((int)(Math.random() * 100));
        }
        fin = System.nanoTime();// tomamos la hora despues de realizar el proceso
        tiempo = fin - ini;
        System.out.println("Tiempo arreglo = " + tiempo);*/
        lista.imprimir();
        System.out.println("Tamano de la lista: " + lista.longitud());
        System.out.println("Valor de la posicion 4: " + lista.valorEn(4));
        System.out.println("Valor 100 de la posicion: " + lista.encontrarEn(100));
        System.out.println("Valor 300 de la posicion: " + lista.encontrar(300));
        System.out.println("Valor 500 de la posicion: " + lista.encontrar(500));
        lista.insertarEn(483, 3);
        lista.imprimir();
        System.out.println("Tamano despues de insertar: " + lista.longitud());
        lista.borrarEn(1);
        lista.imprimir();
        System.out.println("Tamano despues de borrar: " + lista.longitud());
        lista.imprimirInv();
    }
}
    
    

