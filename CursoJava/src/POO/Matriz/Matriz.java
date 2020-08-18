
package POO.Matriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        //Matriz bidimensional
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int k = 0; k < mat[i].length; k++) {
                mat[i][k] = leitor.nextInt();
            }
        }
        for (int k = 0; k < mat.length; k++) {
            System.out.println("Diagonal" + mat[k][k] + " ");

        }
        int cont = 0;
        for (int k = 0; k < mat.length; k++) {
            for (int i = 0; i < mat[i].length; i++) {
                
                if (mat[k][i] < 0) {
                    cont += 1;

                }

            }

        }
        System.out.println("quantidade de numeros negativos: "+cont);

        leitor.close();

    }

}
