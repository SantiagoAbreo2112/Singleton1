import java.util.ArrayList;

public class Casino {
    private static Casino instancia;
    private String nombre;
    private Persona responsable;

    private ArrayList<Juego> juegosDeSlot;
    private ArrayList<Juego> juegosDeMesa;
    private final byte cantidadMaximaJuegosSlots = 8;
    private final byte cantidadMaximaJuegosDeMesa = 2;

    private Casino() {
        this.juegosDeSlot = new ArrayList<>();
        this.juegosDeMesa = new ArrayList<>();
    }

    public static Casino getInstancia(){
        if(instancia == null) instancia = new Casino();
        return instancia;
    }

    public  String getNombre() {
        return this.nombre;
    }

    public  void setNombre(String nombreCasino) {
        this.nombre = nombreCasino;
    }

    public Persona getResponsable() {
        return this.responsable;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }

    public void agregarJuego(Juego juego) throws JuegosCompletosException {
        if(!(juego instanceof JuegoMesa || juego instanceof JuegoSlot)) return;

        boolean juegoSlotInvalido = juego instanceof JuegoSlot && this.juegosDeSlot.size() == cantidadMaximaJuegosSlots;
        boolean juegoMesaInvalido = juego instanceof JuegoMesa && this.juegosDeMesa.size() == cantidadMaximaJuegosDeMesa;
        if(juegoSlotInvalido || juegoMesaInvalido){
            String tipo = juego instanceof JuegoSlot ? "slot" : "mesa";
            throw new JuegosCompletosException(juego.nombre, tipo);
        }

        if(juego instanceof  JuegoSlot){
            this.juegosDeSlot.add(juego);
        } else {
            this.juegosDeMesa.add(juego);
        }

        System.out.println(String.format("Se agregó el juego %s al casino", juego.getNombre()));
    }

    private String formatearJuegos(boolean esDeSlot, int cantidadEspaciosIndentacion){
        String indentacion = " ".repeat(cantidadEspaciosIndentacion);
        String juegosFormateados = "";
        for(Juego juego : esDeSlot ? this.juegosDeSlot : this.juegosDeMesa){
            juegosFormateados += indentacion + juego + "\n";
        }

        return juegosFormateados;
    }

    @Override
    public String toString(){

        String juegosDeMesaFormateados = formatearJuegos(false, 4);
        String juegosDeSlotFormateados = formatearJuegos(true, 4);

       return "Casino {\n  nombre: " + this.nombre + ",\n  responsable: " +
               this.responsable + ",\n  cantidadJuegosDeSlot: " + this.juegosDeSlot.size() +
               ",\n  juegosDeSlot: [\n" + juegosDeSlotFormateados + "  ]" + ",\n  cantidadJuegosDeMesa: " +
               this.juegosDeMesa.size() + ",\n  juegosDeMesa: [\n" + juegosDeMesaFormateados + "  ]" + "\n}";
    }
}
