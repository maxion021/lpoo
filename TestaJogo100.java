/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jogodedados;

/**
 *
 * @author Douglas Carlos da  Silva Oliveira
 */
public class TestaJogo100 {
    
    int variosJogos(){
        Jogo partida = new Jogo();

        for(int cont=1 ; cont <= 1000 ; cont++){
    System.out.println(cont);
            partida.jogada();
       }
        return 0;
    }
}
