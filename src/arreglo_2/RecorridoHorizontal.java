/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_2;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class RecorridoHorizontal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        System.out.print("Por favor digite el tamaño de su matriz: ");
        int tam = tc.nextInt();
        int[][] arreglo = new int[tam][tam];
        System.out.println();

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                System.out.print("Digite la posicion [" + (i + 1) + "," + (j + 1) + "] :");
                int pos = tc.nextInt();
                arreglo[i][j] = pos;

            }
        }
        System.out.println();

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                System.out.print(arreglo[i][j] + "    ");

            }
            System.out.println();
        }
        System.out.println("El Recorrido Horizontal Es: ");

        int i = 0;
        for (int rec = 1; rec < (arreglo.length + 1); rec++) {
            if (rec % 2 != 0) {
                for (int j = 0; j < arreglo.length; j++) {
                    
                    System.out.print(arreglo[i][j] + " ");
                }
            } else {
                for (int j = (tam - 1); j > -1; j--) {
                    
                    System.out.print(arreglo[i][j] + " ");

                }
                
            }
            i++;
        }

    }

}
