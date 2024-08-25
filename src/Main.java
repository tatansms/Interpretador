import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jugarDeNuevo;

        do {
            int numeroMagico = random.nextInt(100) + 1;
            int intentos = 0;
            ArrayList<Integer> intentosPrevios = new ArrayList<>();//un array para guardar cada numero ingresado por el usuario
            boolean acertado = false;
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
            System.out.println("Bienvenido al Juego del Número Mágico, crack");
            System.out.println("He generado un número entre 1 y 100, tienes 10 intentos pa' adivinarlo.");

            while (intentos < 10 && !acertado) {
                System.out.print("\nIntento " + (intentos + 1) + ": Introduce tu número: ");
                int numeroJugador = scanner.nextInt();
                intentos++;
                intentosPrevios.add(numeroJugador);

                if (numeroJugador == numeroMagico) {
                    System.out.println("Felicidades, Has adivinado el número en " + intentos + " intentos.");
                    acertado = true;
                } else if (numeroJugador < numeroMagico) {
                    System.out.println("El número  es mayor que " + numeroJugador + ".");
                } else {
                    System.out.println("El número  es menor que " + numeroJugador + ".");
                }

                System.out.println("\nIntentos previos: " + intentosPrevios);
            }

            if (!acertado) {
                System.out.println("´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-´-");
                System.out.println("Lo siento, no has adivinado el número. El número mágico era: " + numeroMagico);
            }

            System.out.print("\n¿Quieres jugar de nuevo? (chi/ño): ");
            scanner.nextLine(); // Limpiar el buffer del scanner
            String respuesta = scanner.nextLine();
            jugarDeNuevo = respuesta.equalsIgnoreCase("chi");

        } while (jugarDeNuevo);

        System.out.println("Gracias por jugar, noxpirin.");
        scanner.close();
    }
}
