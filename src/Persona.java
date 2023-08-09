public class Persona {
    private String ci;
    private String nombre;
    public enum Status {ACTIVO, LICENCIA, INACTIVO};
    private Status estadoActual;

    public Persona(String ci, String nombre, Status estadoActual) {
        this.ci = ci;
        this.nombre = nombre;
        this.estadoActual = estadoActual;
    }

    public Status getEstadoActual() {
        return this.estadoActual;
    }

    public void setEstadoActual(Status estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String getCi() {
        return this.ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return String.format(
                "Persona:  { cedula: %s, nombre: %s, status: %s }",
                this.ci, this.nombre, this.estadoActual.name()
        );
    }
}
