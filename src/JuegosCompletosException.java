public class JuegosCompletosException extends Exception{
    JuegosCompletosException(String nombreJuego, String tipoJuego){
        super(
                String.format(
                        "No se pudo agregar %s al listado de juegos de %s; ya se llegó a la capacidad máxima.",
                        nombreJuego, tipoJuego
                )
        );
    }
}
