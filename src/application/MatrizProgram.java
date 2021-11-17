package application;

import java.util.Scanner;

public class MatrizProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho da matriz: ");
        int n = sc.nextInt();

        //instanciar matriz bi-dimensional L x C na memoria
        int[][] mat = new int[n][n];

        //ler matriz
        //linhas da matriz
        for (int i = 0; i < mat.length; i++) {
            //colunas da matriz
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        //imprimir diagonal principal
        System.out.println("Main Diagonal:");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        //imprimir números negativos
        System.out.println("Negative numbers:");
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                //testar se o número é negativo
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);

        sc.close();
    }
}
