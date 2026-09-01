package states;

import models.MaquinaExpendedora;

public class EstadoDispensando implements IEstadoMaquina {
    @Override
    public void insertarMoneda(MaquinaExpendedora contexto) {
        System.out.println("Esperá, se está dispensando el producto.");
    }

    @Override
    public void seleccionarProducto(MaquinaExpendedora contexto) {
        System.out.println("Ya se seleccionó un producto, esperá a que termine.");
    }

    @Override
    public void dispensarProducto(MaquinaExpendedora contexto) {
        System.out.println("Producto entregado. Volviendo al estado inicial.");
        contexto.setEstado(contexto.getEstadoSinMoneda());
    }
}