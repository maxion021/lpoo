/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jogodedados;

import java.util.Arrays;

/**
 *
 * @author Douglas Carlos da  Silva Oliveira
 */
public class TestaJogo100 {

    int[][] c = new int[2][100];
    int[] d = new int[2];
    
    int variosJogos(){
        Jogo partida = new Jogo();
        for(int cont=0 ; cont < 100 ; cont++){
    System.out.println(cont);
            d = partida.jogada();
            c[0][cont] = d[0];
            c[1][cont] = d[1];
       }
        System.out.println(Arrays.toString(c[0]));
        System.out.println(Arrays.toString(c[1]));
        double cont2 = 0;
        int[] v = new int[20];
        for(int cont = 0 ; cont < 100 ; cont++){
            cont2 = cont2 + c[0][cont];
        }
        for(int conta = 0 ; conta < 20; conta++){
            for(int contb = 0; contb < 100; contb ++){
                if(c[0][contb] == conta+1 && c[1][contb] == 1){
                v[conta]++;
                }
                
                if(c[0][contb] > 20 && c[1][contb] == 1 && conta == 19){
                v[19]++;
                }
            }
        }

        for(int conta = 0 ; conta < 20; conta++){
            System.out.print(conta+1 + ":" + v[conta] + " ");
        }/*
        void printArray(int[] anArray) {
           for (int i = 0; i < anArray.length; i++) {
              if (i > 0) {
                 System.out.println(", ");
              }
              System.out.println(anArray[i]);
           }
        }
        */
           //int[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
           //printArray(v);
        
      
        System.out.println("\nC: " + cont2/100);
        return 0;
    }
}
