/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author Luis
 */
public class NODO {
    private int valor;
    private NODO derecha;
    private NODO izquierda;

    public NODO() {
        this.valor = 0;
        derecha = null;  
        izquierda = null; 
    }
    
    public NODO(int valor) {
        this.valor = valor;
        derecha = null;
        izquierda = null;
    }

    public NODO getIzquierda() {
        return izquierda;
    }
    
    public int getValor() {
        return valor;
    }

    public NODO getDerecha() {
        return derecha;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setDerecha(NODO derecha) {
        this.derecha = derecha;
    }

    public void setIzquierda(NODO izquierda) {
        this.izquierda = izquierda;
    }
}