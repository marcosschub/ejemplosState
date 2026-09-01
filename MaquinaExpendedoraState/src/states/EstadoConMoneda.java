package states;

import models.MaquinaExpendedora;

public class EstadoConMoneda implements IEstadoMaquina {
    @Override
    public void insertarMoneda(MaquinaExpendedora contexto) {
        System.out.println("Ya insertaste una moneda, no podés insertar otra.");
    }

    @Override
    public void seleccionarProducto(MaquinaExpendedora contexto) {
        System.out.println("Producto seleccionado. Dispensando...");
        contexto.setEstado(contexto.getEstadoDispensando());
        contexto.dispensarProducto();
    }

    @Override
    public void dispensarProducto(MaquinaExpendedora contexto) {
        System.out.println("Primero tenés que seleccionar un producto.");
    }
}
