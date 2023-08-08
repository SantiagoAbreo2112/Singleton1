public class Persona {
    private static Persona instance=new Persona();
    private String Ci;
    private String nombre;
    private status EstadoActual;
    public enum status {ACTIVO, LICENCIA, INACTIVO};

    private Persona() {
    }

    public static Persona getInstance(){
        return instance;
    }

    public status getEstadoActual() {
        return EstadoActual;
    }

    public void setEstadoActual(status estadoActual) {
        EstadoActual = estadoActual;
    }

    public String getCi() {
        return Ci;
    }

    public void setCi(String ci) {
        Ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "Ci='" + Ci + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
