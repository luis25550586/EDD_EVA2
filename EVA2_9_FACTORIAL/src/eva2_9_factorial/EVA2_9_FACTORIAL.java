/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_factorial;

/**
 *
 * @author Luis
 */
public class EVA2_9_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int factorialCiclo(int numero){
        int resu = 1;
        for (int i = numero; i >= 1; i--) {
            resu *= i;
        }
        return resu;
    }
    public static int factorialRecu(int numero){
    if (numero == 0) {
            return 1;
        } else {
            return numero * factorialRecu(numero - 1);
        }
    }
}