package cursedState;

public class otaG {
    private Estado estadoActual;

    public otaG() {
        this.estadoActual = Estado.DURMIENDO;
    }

    public void acariar(){
        if(estadoActual == Estado.DURMIENDO){
            System.out.println("Ronronea y sigue durmiendo...");
        } else if (estadoActual == Estado.HAMBRIENTO) {
            System.out.println("¡Muerde!");
        } else if (estadoActual == Estado.JUGANDO) {
            System.out.println("Ronronea feliz.");
        }
    }

    public void darComida(){
        if(estadoActual == Estado.DURMIENDO){
            System.out.println("¡Se despierta alertado por el olor a atún!");
        } else if (estadoActual == Estado.HAMBRIENTO) {
            System.out.println("Come el atún placidamente");
        } else if (estadoActual == Estado.JUGANDO) {
            System.out.println("Ignora la comida");
        }
    }
}
