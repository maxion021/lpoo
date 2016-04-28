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
        dado1.gerar();
        dado2.gerar();
        System.out.println("Dados: "+dado1.valor_dado+" + "+dado2.valor_dado+" = " + (dado1.valor_dado+dado2.valor_dado));
        if(endgame() == true){
            System.out.println("Vitoria");
        }else{
        System.out.println("Derrota");
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
