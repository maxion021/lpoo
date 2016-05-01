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
    int resultado[] = new int[2];

    int[] jogada(){
        int[] retorno = new int[2];
        retorno = primeiraJogada();
        if(soma == 4 || soma == 5 || soma == 6 || soma == 8 || soma == 9 || soma == 10){
            retorno = endGame();
        }
        return retorno;
    }
        
    int[] endGame(){
        int[] b = new int[2];
        b [0] = 1;
        while(soma2 != soma){
            b [0] ++;
        dado1.gerar();
        dado2.gerar();
        soma2 = (dado1.valor_dado+dado2.valor_dado);
        System.out.println("Dados: "+dado1.valor_dado+" + "+dado2.valor_dado+" = " + soma2);
        if(soma2 == 7){
            System.out.println("Derrota");
            b [1] = 2;
            break;
        }
        }
        if(soma2 != 7){
            System.out.println("Vitória");
            b [1] = 1;
        }
        return b;
    }
    
    int[] primeiraJogada(){
        int[] b = new int[2];
        dado1.gerar();
        dado2.gerar();
        soma = (dado1.valor_dado+dado2.valor_dado);
        if(soma == 7 || soma == 11){
            System.out.println("Dados: "+dado1.valor_dado+" + "+dado2.valor_dado+" = " + soma);
            System.out.println("Vitoria");
            b [0] = 1;
            b [1] = 1;
        }

        if(soma == 2 || soma == 3 || soma == 12){
            System.out.println("Dados: "+dado1.valor_dado+" + "+dado2.valor_dado+" = " + soma);
            System.out.println("Derrota");
            b [0] = 1;
            b [1] = 2;
        }
        
        if(soma == 4 || soma == 5 || soma == 6 || soma == 8 || soma == 9 || soma == 10){
            System.out.println("Dados: "+dado1.valor_dado+" + "+dado2.valor_dado+" = " + soma);
            System.out.println("Pontuação: " + soma);
            b [0] = 0;
            b [1] = 0;
        }

        return b;
    }
}
