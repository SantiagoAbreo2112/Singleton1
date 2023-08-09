import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Casino conrad = Casino.getInstancia();
        conrad.setNombre("Conrad");
        conrad.setResponsable(new Persona("1234567-8", "Luis Suárez", Persona.Status.ACTIVO));

        System.out.println("Casino antes de agregarle los juegos:");
        System.out.println(conrad);
        // Los prints vacíos son simplemente para que el output en la consola se vea más lindo
        System.out.println();

        ArrayList<Juego> juegos = new ArrayList<>();

        juegos.add(new JuegoSlot("Ceasars Slots", JuegoSlot.TipoDeSlot.BOTONES));
        juegos.add(new JuegoSlot("Wheel of Fortune", JuegoSlot.TipoDeSlot.PALANCA));
        juegos.add(new JuegoSlot("Cleopatra", JuegoSlot.TipoDeSlot.BOTONES));
        juegos.add(new JuegoSlot("Triple 7s", JuegoSlot.TipoDeSlot.PALANCA));
        juegos.add(new JuegoSlot("Gonzo's Quest", JuegoSlot.TipoDeSlot.BOTONES));
        juegos.add(new JuegoSlot("One-Armed Bandit", JuegoSlot.TipoDeSlot.PALANCA));
        juegos.add(new JuegoSlot("Starburst", JuegoSlot.TipoDeSlot.BOTONES));
        juegos.add(new JuegoSlot("Lucky 88", JuegoSlot.TipoDeSlot.PALANCA));
        juegos.add(new JuegoSlot("Double Triple Diamond Deluxe", JuegoSlot.TipoDeSlot.BOTONES));

        juegos.add(new JuegoMesa("Ruleta", (byte) 6, (byte) 1, (byte) 8));
        juegos.add(new JuegoMesa("BlackJack", (byte) 3, (byte) 1, (byte) 7));
        juegos.add(new JuegoMesa("Póker", (byte) 5, (byte) 2, (byte) 9));

        for(Juego juego : juegos){
            try{
                conrad.agregarJuego(juego);
            } catch(JuegosCompletosException ex){
                System.out.println(ex);
            } finally {
                System.out.println();
            }
        }

        System.out.println("Casino después de agregarle los juegos:");
        System.out.println(conrad);
        System.out.println();

        System.out.println("¿Casino.getInstancia() devuelve la misma instancia? " + (Casino.getInstancia() == conrad));
    }
}
