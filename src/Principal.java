import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Casino conrad = Casino.getInstancia();
        conrad.setNombre("Conrad");
        conrad.setResponsable(new Persona("1234567-8", "Luis Suárez", Persona.status.ACTIVO));

        System.out.println("Casino antes de agregarle los juegos:");
        System.out.println(conrad);
        // Los prints vacíos son simplemente para que el output en la consola se vea más lindo
        System.out.println();

        ArrayList<Juego> juegos = new ArrayList<>();

        juegos.add(new JuegoSlot("Ceasars Slots", JuegoSlot.tipoDeSlot.BOTONES));
        juegos.add(new JuegoSlot("Wheel of Fortune", JuegoSlot.tipoDeSlot.PALANCA));
        juegos.add(new JuegoSlot("Cleopatra", JuegoSlot.tipoDeSlot.BOTONES));
        juegos.add(new JuegoSlot("Triple 7s", JuegoSlot.tipoDeSlot.PALANCA));
        juegos.add(new JuegoSlot("Gonzo's Quest", JuegoSlot.tipoDeSlot.BOTONES));
        juegos.add(new JuegoSlot("One-Armed Bandit", JuegoSlot.tipoDeSlot.PALANCA));
        juegos.add(new JuegoSlot("Starburst", JuegoSlot.tipoDeSlot.BOTONES));
        juegos.add(new JuegoSlot("Lucky 88", JuegoSlot.tipoDeSlot.PALANCA));
        juegos.add(new JuegoSlot("Double Triple Diamond Deluxe", JuegoSlot.tipoDeSlot.BOTONES));

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
