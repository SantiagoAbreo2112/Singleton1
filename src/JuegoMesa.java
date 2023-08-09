public class JuegoMesa extends Juego{
    private byte metrosCuadrados;
    private byte cantidadJugadoresMin;
    private byte cantidadJugadoresMax;

    public JuegoMesa(String nombre, byte metrosCuadrados, byte cantidadJugadoresMin, byte cantidadJugadoresMax) {
        super(nombre);
        this.metrosCuadrados = metrosCuadrados;
        this.cantidadJugadoresMin = cantidadJugadoresMin;
        this.cantidadJugadoresMax = cantidadJugadoresMax;
    }

    public byte getMetrosCuadrados() {
        return this.metrosCuadrados;
    }

    public void setMetrosCuadrados(byte metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public byte getCantidadJugadoresMin() {
        return this.cantidadJugadoresMin;
    }

    public void setCantidadJugadoresMin(byte cantidadJugadoresMin) {
        this.cantidadJugadoresMin = cantidadJugadoresMin;
    }

    public byte getCantidadJugadoresMax() {
        return this.cantidadJugadoresMax;
    }

    public void setCantidadJugadoresMax(byte cantidadJugadoresMax) {
        this.cantidadJugadoresMax = cantidadJugadoresMax;
    }

    @Override
    public String toString(){
        return String.format(
                "JuegoMesa: { nombre: %s, metrosCuadrados: %d, cantidadJugadoresMin: %d, cantidadJugadoresMax: %d }",
                this.nombre, this.metrosCuadrados, this.cantidadJugadoresMin, this.cantidadJugadoresMax
        );
    }
}
