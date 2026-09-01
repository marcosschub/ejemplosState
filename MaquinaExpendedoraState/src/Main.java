import models.MaquinaExpendedora;

public class Main {
    public static void main(String[] args) {
        MaquinaExpendedora maquina = new MaquinaExpendedora();

        maquina.seleccionarProducto();
        maquina.insertarMoneda();
        maquina.seleccionarProducto();
    }
}
