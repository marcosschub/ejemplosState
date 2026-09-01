package state;

import models.Gato;

public class Hambriento implements IEstadoGato{
    public Hambriento() {
    }

    @Override
    public void acariciar(Gato gato) {
        System.out.println("¡Muerde!");
    }

    @Override
    public void darComida(Gato gato) {
        System.out.println("Come el atún placidamente");
        gato.setEstadoGato(new Jugando());
    }
}
