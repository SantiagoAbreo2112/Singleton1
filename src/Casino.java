public class Casino {
    private static Casino instance = new Casino();
    private static String NombreCasino;
    private Persona ResponsableCasino;

    private Casino() {
    }

    public static Casino getInstance(){
        return instance;
    }

    public static String getNombreCasino() {
        return NombreCasino;
    }

    public  void setNombreCasino(String nombreCasino) {
        NombreCasino = nombreCasino;
    }

    public Persona getResponsableCasino() {
        return ResponsableCasino;
    }

    public void setResponsableCasino(Persona responsableCasino) {
        ResponsableCasino = responsableCasino;
    }

    @Override
    public String toString() {
        return "Casino{" +
                "ResponsableCasino=" + ResponsableCasino +
                '}';
    }
}
