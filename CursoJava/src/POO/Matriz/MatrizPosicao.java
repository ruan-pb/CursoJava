
package POO.Matriz;

import java.util.Scanner;

public class MatrizPosicao {
    
    public static void main(String args[]){
        
        Scanner leitor=  new Scanner (System.in);
        
        
        int quantLinha = leitor.nextInt();
        int quantColuna = leitor.nextInt();
        
        int [][] mat = new int[quantLinha][quantColuna];
        
        for(int i=0; i< mat.length;i++){
            for(int k =0;k<mat[i].length;k++){
                mat[i][k] = leitor.nextInt();
                
                
            }
        }
        int qualNumero = leitor.nextInt();
        
        for(int k=0;k < mat.length;k++){
            for (int i=0; i<mat[k].length;i++){
                
                if(mat[k][i] == qualNumero ){
                    System.out.println("posição: "+i+", "+k);
                    if(i > 0){
                        System.out.println("esquerda: "+mat[k][i-1]);
                        
                    } 
                    if(k > 0){
                        System.out.println("Cima: "+mat[k-1][i]);
                        
                    }
                    if(i < mat[k].length-1){
                        System.out.println("direita: "+ mat[k][i+1]);
                    }
                    if(k < mat.length-1){
                        System.out.println("Em baixo: "+mat[k+1][i]);
                    }
                    
                }
            }
        }
        
        leitor.close();
        
        
        
       
        
        
        
    }
        
    
}
        /*10 8 15 12
        21 11 23 8
        15 5 13 9   
        */
