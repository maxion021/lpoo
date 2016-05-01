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
public class TestaJogo {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = new int[2];
         Jogo partida = new Jogo();
         a = partida.jogada();
        System.out.println(Arrays.toString(a));
    }
    
}
