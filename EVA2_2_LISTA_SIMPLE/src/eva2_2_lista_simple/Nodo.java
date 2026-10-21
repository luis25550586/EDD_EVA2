/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista_simple;

/**
 *
 * @author Luis
 */
public class Nodo {
    private int dato;
    private Nodo siguiente;

    public Nodo() {
        dato = 0;
        siguiente = null;
    }

    public Nodo(int dato) {
        this.dato = dato;
        siguiente = null;
    }

    public int getValor() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setValor(int dato) {
        this.dato = dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
    
    

