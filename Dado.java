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
public class Dado {
    int valor_dado = 0;
    
    int gerar(){
    valor_dado = (int)(Math.random()*5+1);
    return valor_dado;
}
}
