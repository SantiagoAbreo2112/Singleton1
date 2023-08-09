public class JuegoSlot extends Juego{
    public enum TipoDeSlot {PALANCA, BOTONES};
    private TipoDeSlot tipo;

    public JuegoSlot(String nombre, TipoDeSlot tipo){
        super(nombre);
        this.tipo = tipo;
    }

    public TipoDeSlot getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoDeSlot tipo) {
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
