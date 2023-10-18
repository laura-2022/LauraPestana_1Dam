 /*Escribe un programa que permita jugar al siguiente juego. Se dispone de un dado normal de 6
caras con valores comprendidos entre 1 y 6. El objetivo del juego es sumar más puntos que el rival
(en este caso el ordenador) sin pasarse de 11 puntos (similitudes con el blackjack). Empezará el
jugador, que lanzará los dados hasta que ocurra alguno de los siguientes acontecimientos:
a) Obtenga exactamente 11 puntos (ha ganado).
b) Decida plantarse con una puntuación inferior a 11 puntos.
c) Se haya pasado de 11 puntos y por tanto habrá perdido.
En el caso a) sumará automáticamente dos porras (1 porra por victoria y otra de bonificación por
alcanzar la puntuación máxima).
En el caso b) el ordenador jugará e intentará igualar o superar sin pasarse de 11 puntos la
puntuación del jugador. Si consigue igualar o superar la puntuación sumará una porra para el
ordenador. Si además lo hace con una puntuación de 11 puntos tendrá bonificación de otra porra
por alcanzar la puntuación máxima.
En el caso c) el ordenador gana automáticamente y suma una porra sin necesidad de jugar.
El primero que llegue a 5 porras gana la partida*/


import java.util.Scanner; //importo random y escanner
import java.util.Random;
public class Bucle16{
	/*Se dispone de un dado normal de 6
caras con valores comprendidos entre 1 y 6. El objetivo del juego es sumar más puntos que el rival
(en este caso el ordenador) sin pasarse de 11 puntos*/

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();
        int dadoOrdenador = 0;
        int dadoUsuario = 0;
        int sumaOrdenador = 0;
        int sumaUsuario = 0;
        int porrasUsuario = 0;
        int porrasOrdenador = 0;
        char respuesta;

        // El juego continúa mientras ningún jugador llegue a 5 porras.
        while (porrasUsuario < 5 && porrasOrdenador < 5) {
            System.out.println("EMPECEMOS A JUGAR. Elige la opción:");
            System.out.println("1) TIRAR DADO");
            System.out.println("2) ME PLANTO");
            int opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    dadoUsuario = random.nextInt(6) + 1; // Tirada de usuario con valores del 1 al 6
                    System.out.println("Tirada: " + dadoUsuario);
                    sumaUsuario += dadoUsuario;
                    System.out.println("El total de la jugada es: " + sumaUsuario);

                    if (sumaUsuario == 11) {
                        System.out.println("Has ganado");
                        porrasUsuario++;
                    } else if (sumaUsuario > 11) {
                        System.out.println("Has perdido");
                        porrasOrdenador++;
                    } else {
                        System.out.println("¿Deseas tirar de nuevo? (S/N)");
                        respuesta = lector.next().charAt(0);
                        if (respuesta == 'N' || respuesta == 'n') {
                            // Turno del ordenador
                            while (sumaOrdenador < 11 && sumaOrdenador <= sumaUsuario) {
                                dadoOrdenador = random.nextInt(6) + 1;
                                sumaOrdenador += dadoOrdenador;
                            }
                            if (sumaOrdenador >= sumaUsuario) {
                                System.out.println("El ordenador ha ganado");
                                porrasOrdenador++;
                            } else {
                                System.out.println("Has ganado esta ronda");
                                porrasUsuario++;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Te plantas en " + sumaUsuario);
                    // Turno del ordenador
                    while (sumaOrdenador < 11 && sumaOrdenador <= sumaUsuario) {
                        dadoOrdenador = random.nextInt(6) + 1;
                        sumaOrdenador += dadoOrdenador;
                    }
                    if (sumaOrdenador >= sumaUsuario) {
                        System.out.println("El ordenador ha ganado");
                        porrasOrdenador++;
                    } else {
                        System.out.println("Has ganado esta ronda");
                        porrasUsuario++;
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Elige 1 para tirar el dado o 2 para plantarte.");
            }
        }

        if (porrasUsuario >= 5) {
            System.out.println("¡Felicidades! Has ganado el juego.");
        } else if (porrasOrdenador >= 5) {
            System.out.println("El ordenador te ha ganado. Mejor suerte la próxima vez.");
        }
    }
}
