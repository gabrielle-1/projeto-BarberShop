/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Servico;

public class Main {
    public static void main(String[] args){
    Servico s1 = new Servico(1, "barba", 30);
        System.out.println(s1.getDescricao() + s1.getValor());
    
}
}
