import java.util.Scanner;
import java.util.Random;

public class Metodos21 {
	  public static int porrasUsuario = 0;
	  public static int porrasOrdenador = 0;
	  public static int sumaUsuario = 0;
    public static int  sumaOrdenador=0;
	  
	  public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();
      
        while (porrasUsuario < 5 && porrasOrdenador < 5) {
            System.out.println("EMPECEMOS A JUGAR. Elige la opción:");
            System.out.println("1) TIRAR DADO");
            System.out.println("2) ME PLANTO");
            int opcion = lector.nextInt();
        
            switch (opcion) {
                case 1:
			
				porrasUsuario = tirarDadoUsuario(random, porrasUsuario, sumaUsuario);
                    porrasOrdenador = jugarOrdenador(random, porrasOrdenador);
                    break;
                case 2:
		
			
				porrasUsuario = plantarse(sumaUsuario, porrasUsuario, random);
                    porrasOrdenador = jugarOrdenador(random, porrasOrdenador);
                    break;
                default:
                    System.out.println("Opción no válida. Elige 1 para tirar el dado o 2 para plantarte.");
            }
        }

        mostrarResultadoFinal(porrasUsuario, porrasOrdenador);
    }

    public static int tirarDadoUsuario(Random random, int porrasUsuario, int sumaUsuario) {
        int dadoUsuario = random.nextInt(6) + 1;
        System.out.println("Tirada: " + dadoUsuario);
        sumaUsuario += dadoUsuario;
        System.out.println("El total de la jugada es: " + sumaUsuario);

        if (sumaUsuario == 11) {
            System.out.println("Has ganado");
            porrasUsuario++;
        } else if (sumaUsuario > 11) {
            System.out.println("Has perdido");
            porrasOrdenador += jugarOrdenador(random, porrasOrdenador);
        }

        return porrasUsuario;
    }

    public static int jugarOrdenador(Random random, int porrasOrdenador) {
        
		while (sumaOrdenador < 11 && sumaOrdenador <= sumaUsuario) {
            int dadoOrdenador = random.nextInt(6) + 1;
            System.out.println("Tirada del ordenador: " + dadoOrdenador);
            sumaOrdenador += dadoOrdenador;
            System.out.println("El total de la jugada del ordenador es: " + sumaOrdenador);
        }

        if (sumaOrdenador == 11) {
            System.out.println("El ordenador ha ganado");
            porrasOrdenador++;
        } else if (sumaOrdenador > 11) {
            System.out.println("El ordenador se ha pasado. Has ganado");
            porrasUsuario++;
        } else if (sumaOrdenador > sumaUsuario) {
            System.out.println("PRINGADO!! el ordenador te ha ganado");
        } else {
            System.out.println("Has ganado esta tirada tu y sumas 1 porra");
            porrasUsuario++;
        }

        return porrasOrdenador;
    }

    public static int plantarse(int sumaUsuario, int porrasUsuario, Random random) {
        System.out.println("Te plantas en " + sumaUsuario);
        porrasOrdenador = jugarOrdenador(random, porrasOrdenador);
        return porrasUsuario;
    }

    public static void mostrarResultadoFinal(int porrasUsuario, int porrasOrdenador) {
        if (porrasUsuario >= 5) {
            System.out.println("¡Felicidades! Has ganado el juego.");
        } else if (porrasOrdenador >= porrasUsuario) {
            System.out.println("El ordenador te ha ganado. Mejor suerte la próxima vez.");
        }
    }
}
