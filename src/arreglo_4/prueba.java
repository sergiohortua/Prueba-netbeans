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
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[][] = new int[4][4];
        int valor;
        Scanner lector = new Scanner(System.in);

        System.out.println("MATRIZ CUADRADA 3 X 3");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor de[" + i + " , " + j + "]: ");
                valor = lector.nextInt();
                numeros[i][j] = valor;
            }
        }

        System.out.println("");
        System.out.println("Presentacion de la matriz");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numeros[i][j] + "\t");
                if (j == 3) {
                    System.out.print("\n");
                }
            }
        }

        System.out.println("zzzzzzzzzzzzzzz");
        System.out.println("Diagonal Principal");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.print(numeros[i][j] + " ");
                }
            }
        }
       /* System.out.println("\n");
        System.out.println("Diagonal Secundaria");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && j == 2) {
                    System.out.print(numeros[i][j] + " ");
                }
                if (i == 1 && j == 1) {
                    System.out.print(numeros[i][j] + " ");
                }
                if (i == 2 && j == 0) {
                    System.out.print(numeros[i][j] + " ");
                }
            }
        }*/
        System.out.println("\n");

    }
}
