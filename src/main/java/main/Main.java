package main;

import facade.EstadoFacade;

public class Main {
    public static void main(String[] args) {
        EstadoFacade estadoFacade = new EstadoFacade();
        estadoFacade.exibirMenu();
    }
}
