/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_4;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class RecorridoN {

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
                System.out.print("Digite un numero en la posicion [" + (fil) + "," + (col) + "] :");
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
        for (int rec = 1; rec < (arreglo.length); rec++) {
            if (rec % 2 == 0) {
                for (int fil = 0; fil < arreglo.length; fil++) {

                    System.out.print(arreglo[fil][col] + " ");
                }
                //System.out.println("");
                int fil = 0;

                for (fil = 0; fil < (arreglo.length); fil++) {
                    for (col = 0; col < arreglo.length; col++) {
                        if (fil == col) {
                            System.out.print(arreglo[fil][col] + " ");
                                                       
                        }
                    }
                }
               
                
            }
            //col = arreglo.length;
            
        }

    }

}
