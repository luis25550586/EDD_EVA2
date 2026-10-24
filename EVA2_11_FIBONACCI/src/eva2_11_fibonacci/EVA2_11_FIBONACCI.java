/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_fibonacci;

/**
 *
 * @author Luis
 */
public class EVA2_11_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(figonacciRecu(7));
    }
    public static int figonacciRecu(int valor){
        if(valor == 0){
            return 1;
        }
        if (valor == 1){
            return 1;
        }
        return  figonacciRecu(valor - 1) + figonacciRecu(valor-2);
        
        
        
        
        
        
        
        
        
    }
}
