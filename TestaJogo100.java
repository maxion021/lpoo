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
        return 0;
    }
}
