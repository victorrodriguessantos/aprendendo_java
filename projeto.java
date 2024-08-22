package com.mycompany.meuprimeiroprojeto;

public class Meuprimeiroprojeto {

    public static void main(String[] args) {
        Pincel p = new Pincel();
        
        p.cor = "verde";
        p.espessura = "2.0";
        p.tipo = "lousa";
        p.formato = "redondo";
        
        p.desenhar();
        p.escrever();
        p.marcar();
        p.pintar();
        
        System.out.println("A caneta é da cor ".concat(p.cor));
    }
}
