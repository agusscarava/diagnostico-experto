import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA EXPERTO: Diagnóstico de Auto ===\n");

        try (Scanner sc = new Scanner(System.in)) {
            // Preguntamos al usuario los síntomas
            System.out.println("Responda con 's' (sí) o 'n' (no):");

            boolean noArranca = preguntar(sc, "¿El auto no arranca?");
            boolean seCalienta = preguntar(sc, "¿El auto se calienta?");
            boolean ruidoFrenar = preguntar(sc, "¿Se escucha un ruido metálico al frenar?");
            boolean testigoBateria = preguntar(sc, "¿Está encendido el testigo de batería?");
            boolean humoBlanco = preguntar(sc, "¿Sale humo blanco del escape?");
            boolean olorNafta = preguntar(sc, "¿Se siente olor a nafta dentro o fuera del vehículo?");
            boolean pierdePotencia = preguntar(sc, "¿El auto pierde potencia al acelerar?");
            boolean lucesDebenApagadas = preguntar(sc, "¿Las luces se ven débiles o se apagan?");

            Sintoma sintomas = new Sintoma(
                noArranca, seCalienta, ruidoFrenar, testigoBateria,
                humoBlanco, olorNafta, pierdePotencia, lucesDebenApagadas
            );

            MotorInferencia motor = new MotorInferencia("datos/reglas.json");
            List<Diagnostico> resultados = motor.evaluar(sintomas);

            System.out.println("\nPosibles diagnósticos:");
            for (Diagnostico d : resultados) {
                System.out.println("- " + d);
            }

        } catch (IOException e) {
            System.out.println("Error cargando las reglas: " + e.getMessage());
        }
    }

    // Función auxiliar para preguntar síntomas
    private static boolean preguntar(Scanner sc, String pregunta) {
        System.out.print(pregunta + " ");
        String resp = sc.nextLine().trim().toLowerCase();
        return resp.startsWith("s");
    }
}
