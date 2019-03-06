/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_3;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        System.out.print("Por favor digite el tamaño de su matriz: ");
        int tam = tc.nextInt();
        int[][] arreglo = new int[tam][tam];
        System.out.println();

        for (int fil = 0; fil < arreglo.length; fil++) {
            for (int col = 0; col < arreglo.length; col++) {
                System.out.print("Digite la posicion [" + (fil + 1) + "," + (col + 1) + "] :");
                int pos = tc.nextInt();
                arreglo[fil][col] = pos;

            }
        }
        System.out.println();

        for (int fil = 0; fil < arreglo.length; fil++) {
            for (int col = 0; col < arreglo.length; col++) {
                System.out.print(arreglo[fil][col] + "    ");

            }
            System.out.println();
        }
        System.out.println("El recorrido N es: ");
        int col = 0;
        for (int fil = arreglo.length; fil < 0; fil++) {
            
                System.out.println(arreglo[fil][col] + " ");
            
        }
        col++;
    }
}
/*
System.out.println("zzzzzzzzzzzzzzz");
        System.out.println("Diagonal Principal");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.print(numeros[i][j] + " ");
                }
            }
        }
 */
