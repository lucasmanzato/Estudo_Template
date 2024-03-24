package org.example;

public class Cafe extends BebidaTemplate {

    @Override
    void preparaBebida() {
        System.out.println("adicionando o po do cafe");
    }

    @Override
    void adicionaCondimentos() {
        System.out.println("adicionando acucar");
    }


}