/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;

/**
 *
 * @author Luis
 */
public class ArbolBinario {
    private NODO root;
    
    public ArbolBinario(){
        root = null;
    }
    public void agregar(int valor){
        //ESTA VACIO EL ARBLO
        if (root == null){
            root = new NODO(valor);
        }else{
            agregarRecu(root,valor);
        }
        
    }
    // METODO RECUSSIVO PARA AGREGAR UN NODO
    public void agregarRecu(NODO actual, int valor){
        if (valor > actual.getValor()){ // A la derecha
            if (actual.getDerecha() != null){ // Ocupado
                agregarRecu(actual.getDerecha(), valor);
            } else { // Disponible
                actual.setDerecha(new NODO(valor));
            }
        } else if (valor < actual.getValor()){ // A la izquierda
            if (actual.getIzquierda() != null){ // Ocupado
                agregarRecu(actual.getIzquierda(), valor); // <--- Corregido (antes decía getDerecha)
            } else { // Disponible
                actual.setIzquierda(new NODO(valor));
            }
        }
        // else ----> el valor está repetido (no hace nada)
    }
    public void preOrder(){
        preOrderRecu(root);
    }
    private void preOrderRecu(NODO actual){
        if (actual != null){
            System.out.println(actual.getValor());
            preOrderRecu(actual.getIzquierda());
            preOrderRecu(actual.getDerecha());
        }
        
    }
        public void inOrder(){
        inOrderRecu(root);
    }
    
    private void inOrderRecu(NODO actual){
        if (actual != null){
            inOrderRecu(actual.getIzquierda());   
            System.out.println(actual.getValor());
            inOrderRecu(actual.getDerecha());     
        }
    }
    
    public void postOrder(){
        postOrderRecu(root);
    }
    
    private void postOrderRecu(NODO actual){
        if (actual != null){
            postOrderRecu(actual.getIzquierda()); 
            postOrderRecu(actual.getDerecha());   
            System.out.println(actual.getValor()); 
        }
    }
}
