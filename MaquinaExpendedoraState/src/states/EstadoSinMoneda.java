package states;

import models.MaquinaExpendedora;

public class EstadoSinMoneda implements IEstadoMaquina {
    @Override
    public void insertarMoneda(MaquinaExpendedora contexto) {
        System.out.println("Moneda insertada. Ahora podés seleccionar un producto.");
        contexto.setEstado(contexto.getEstadoConMoneda());
    }

    @Override
    public void seleccionarProducto(MaquinaExpendedora contexto) {
        System.out.println("Primero tenés que insertar una moneda.");
    }

    @Override
    public void dispensarProducto(MaquinaExpendedora contexto) {
        System.out.println("No se puede dispensar, falta pagar.");
    }
}