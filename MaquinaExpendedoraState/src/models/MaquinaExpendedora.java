package models;

import states.EstadoConMoneda;
import states.EstadoDispensando;
import states.IEstadoMaquina;
import states.EstadoSinMoneda;

public class MaquinaExpendedora {
    private IEstadoMaquina estadoSinMoneda = new EstadoSinMoneda();
    private IEstadoMaquina estadoConMoneda = new EstadoConMoneda();
    private IEstadoMaquina estadoDispensando = new EstadoDispensando();

    private IEstadoMaquina estadoActual;

    public MaquinaExpendedora() {
        this.estadoActual = estadoSinMoneda; // Estado inicial
    }

    public void setEstado(IEstadoMaquina nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public void insertarMoneda() {
        estadoActual.insertarMoneda(this);
    }

    public void seleccionarProducto() {
        estadoActual.seleccionarProducto(this);
    }

    public void dispensarProducto() {
        estadoActual.dispensarProducto(this);
    }

    public IEstadoMaquina getEstadoSinMoneda() { return estadoSinMoneda; }
    public IEstadoMaquina getEstadoConMoneda() { return estadoConMoneda; }
    public IEstadoMaquina getEstadoDispensando() { return estadoDispensando; }
}
