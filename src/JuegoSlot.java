public class JuegoSlot extends Juego{
    public enum tipoDeSlot {PALANCA, BOTONES};
    private tipoDeSlot tipo;

    public JuegoSlot(String nombre, tipoDeSlot tipo){
        super(nombre);
        this.tipo = tipo;
    }

    public tipoDeSlot getTipo() {
        return this.tipo;
    }

    public void setTipo(tipoDeSlot tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return String.format(
                "JuegoSlot: { nombre: %s, tipo: %s }",
                this.nombre, this.tipo.name()
        );
    }
}
