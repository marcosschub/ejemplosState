package models;

import state.Durmiendo;
import state.IEstadoGato;

public class Gato {
    private IEstadoGato estadoActual;

    public Gato() {
        this.estadoActual = new Durmiendo();
    }

    public IEstadoGato getEstadoGato() {
        return estadoActual;
    }

    public void setEstadoGato(IEstadoGato estadoGato) {
        this.estadoActual = estadoGato;
    }

    public void acariciar() {
        estadoActual.acariciar(this);
    }

    public void darComida(){
        estadoActual.darComida(this);
    }
}
