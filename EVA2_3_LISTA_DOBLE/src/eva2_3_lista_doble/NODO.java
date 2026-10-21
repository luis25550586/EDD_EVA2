/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

/**
 *
 * @author Luis
 */
public class NODO {
    // Dos atributos
    private int valor;
    private NODO siguente;
    private NODO previo;
    // constructores

    public NODO() {
        siguente = null;//ESTO ES MUY IMPORTANTE, MARCA EL FIN DE LA LISTA
        previo = null;
    }
    
    public NODO(int dato) {// PONER EL VALOR A GUARDAR, AL MOMENTO DE CREAR EL NIDO
        this.valor = dato;
        siguente = null;
    }

    public NODO getPrevio() {
        return previo;
    }
    
   
    public int getDato() {
        return valor;
    }

    public NODO getSiguente() {
        return siguente;
    }

    public void setDato(int dato) {
        this.valor = dato;
    }

    public void setSiguente(NODO siguente) {
        this.siguente = siguente;
    }

    public void setPrevio(NODO previo) {
        this.previo = previo;
    }
    
    
    
    
}
