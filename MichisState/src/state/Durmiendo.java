package state;

import models.Gato;

public class Durmiendo implements IEstadoGato{
    public Durmiendo() {
    }

    @Override
    public void acariciar(Gato gato) {
        System.out.println("Ronronea y sigue durmienndo...");
    }

    @Override
    public void darComida(Gato gato) {
        System.out.println("¡Se despierta alertado por el olor a atún!");
        gato.setEstadoGato(new Hambriento());
    }

}
