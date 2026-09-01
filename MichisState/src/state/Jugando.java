package state;

import models.Gato;

public class Jugando implements IEstadoGato{
    public Jugando() {
    }

    @Override
    public void acariciar(Gato gato) {
        System.out.println("Ronronea feliz.");
    }

    @Override
    public void darComida(Gato gato) {
        System.out.println("Ignora la comida");
    }
}
