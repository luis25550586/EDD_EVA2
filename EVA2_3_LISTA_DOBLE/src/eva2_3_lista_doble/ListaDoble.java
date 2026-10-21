/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_lista_doble;

//imprimir longitus lista vacia y vaciar lista
public class ListaDoble {
    private NODO inicio;
    private NODO fin;
    private int tama;
    
    
    public void agregar (int valor){
        NODO nuevo = new NODO(valor); // Creamos el nodo con el valor
        
        if (inicio == null){
            // Si la lista está vacía, el nuevo nodo es tanto el inicio como el fin
            inicio = nuevo;
            fin = nuevo;
        } else {
            // Si ya hay elementos, conectamos el nuevo nodo al final usando 'fin'
            fin.setSiguente(nuevo);
            nuevo.setPrevio(nuevo);
            fin = nuevo; // Actualizamos 'fin' para que ahora sea este nuevo nodo
        }
        this.tama++;
    }
    public int longitud(){
        int cont = 0;
        NODO temp = inicio;
        while(temp != null){
            cont++;
            temp = temp.getSiguente();
        }
        return cont;
    }
    
    
    public void insertarEn(int posicion, int valor){
        int tama = longitud();
        if(posicion < 0 || posicion > tama){
            throw new RuntimeException("La posición " + posicion + " no es válida para insertar");
        }
        // Inicio
        if(posicion == 0){ 
            NODO nuevo = new NODO(valor);
            nuevo.setSiguente(inicio);
            inicio = nuevo;
            if(fin == null){
                fin = nuevo;
            }
            return;
        }
        
        if(posicion == tama){ 
            agregar(valor);
            return;
        }
        
        //Medio
        NODO nuevo = new NODO(valor);
        NODO temp = inicio;
        for(int i = 0; i < posicion - 1; i++){
            temp = temp.getSiguente();
        }
        nuevo.setSiguente(temp.getSiguente());
        temp.setSiguente(nuevo);
    }
    public void borrarEn(int posicion){
        int tama = longitud();
        if(posicion < 0 || posicion >= tama){
            throw new RuntimeException("La posición " + posicion + " no es válida para borrar");
        }
        
        if(posicion == 0){ // Borrar el primer nodo
            inicio = inicio.getSiguente();
            if(inicio == null){
                fin = null; // Si la lista se quedó vacía
            }
            return;
        }
        
        NODO temp = inicio;
        for(int i = 0; i < posicion - 1; i++){
            temp = temp.getSiguente();
        }
        
        NODO nodoAEliminar = temp.getSiguente();
        temp.setSiguente(nodoAEliminar.getSiguente());
        
        if(nodoAEliminar == fin){
            fin = temp; 
        }
    }
    public void imprimir() {
        NODO temp = inicio;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println();
    }
    public boolean ListaVacia() {
        if(inicio == null) {//lista vacía, en este caso si
            return true;
        }else{//LISTA CON NODOS
            return false;
        }
    }

    // Vaciar lista
    public void vaciarLista() {
        inicio = null;
    }
    //validar que posición tenga un valor válido
    //O(?)

    // Obtener valor en una posición
    public int valorEn(int posicion) {
        //excepción
        //VALIDAR posición
        int tama = longitud();
        if(posicion >= 0 && posicion < tama) {//POSICIÓN VÁLIDA
            //que posiciones son válidas aqui, de 0 a N -1 (N es la cantidad de nodos)
            NODO temp = inicio;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            return temp.getValor();
        }else{//POSICIÓN NO VÁLIDA
            throw new RuntimeException("La posición " + posicion + "no es válida");
        }
    }
}
   