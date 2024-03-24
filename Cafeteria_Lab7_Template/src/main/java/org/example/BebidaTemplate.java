package org.example;

public abstract class BebidaTemplate {

    public void aqueceAgua(){
        System.out.println("aquecendo agua");
    }


    public void colocaXicara(){
        System.out.println("colocando na xicara");
    }

    abstract void preparaBebida();

    abstract void adicionaCondimentos();

    public void preparaPedido(){
        aqueceAgua();
        preparaBebida();
        colocaXicara();
        adicionaCondimentos();
    }

}