package states;

import models.MaquinaExpendedora;

public interface IEstadoMaquina {
    void insertarMoneda(MaquinaExpendedora contexto);
    void seleccionarProducto(MaquinaExpendedora contexto);
    void dispensarProducto(MaquinaExpendedora contexto);
}

