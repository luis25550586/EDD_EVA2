/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_mcd;

/**
 *
 * @author Luis
 */
public class EVA2_10_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(mcdRecu(48,18));
    }
    public static int mcdRecu(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcdRecu(b, a % b);
        }
    }
}

