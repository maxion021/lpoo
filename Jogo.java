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
public class Jogo {

    Dado dado1 = new Dado();
    Dado dado2 = new Dado();
    
     void jogada(){
        primeiraJogada();
        if(soma == 4 || soma == 5 || soma == 6 || soma == 8 || soma == 9 || soma == 10){
            endGame();
        }
    }
        
    boolean endgame(){
        if((dado1.valor_dado+dado2.valor_dado) == 7 || (dado1.valor_dado+dado2.valor_dado) == 11){
        return true;
    }else{
            return false;
            }
    }
    
    

}
