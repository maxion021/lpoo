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
    
    int soma = 0, soma2 = 0;
    
    void jogada(){
        primeiraJogada();
        if(soma == 4 || soma == 5 || soma == 6 || soma == 8 || soma == 9 || soma == 10){
            endGame();
        }
    }
        
    void endGame(){
        while(soma2 != soma){
        dado1.gerar();
        dado2.gerar();
        soma2 = (dado1.valor_dado+dado2.valor_dado);
        System.out.println("Dados: "+dado1.valor_dado+" + "+dado2.valor_dado+" = " + soma2);
        if(soma2 == 7){
            System.out.println("Derrota");
            break;
        }
        }
        if(soma2 != 7)
        System.out.println("Vitória");
    }
    
    void primeiraJogada(){
        dado1.gerar();
        dado2.gerar();
        soma = (dado1.valor_dado+dado2.valor_dado);
        if(soma == 7 || soma == 11){
            System.out.println("Dados: "+dado1.valor_dado+" + "+dado2.valor_dado+" = " + soma);
            System.out.println("Vitoria");
        }

        if(soma == 2 || soma == 3 || soma == 12){
            System.out.println("Dados: "+dado1.valor_dado+" + "+dado2.valor_dado+" = " + soma);
            System.out.println("Derrota");
        }
        
        if(soma == 4 || soma == 5 || soma == 6 || soma == 8 || soma == 9 || soma == 10){
            System.out.println("Dados: "+dado1.valor_dado+" + "+dado2.valor_dado+" = " + soma);
            System.out.println("Pontuação: " + soma);
        }
    }
}
