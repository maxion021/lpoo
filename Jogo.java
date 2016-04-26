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
        System.out.println(dado1.gerar());
        System.out.println(dado2.gerar());
    }

}
