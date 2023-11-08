
	import java.util.Scanner;
public class Metodos20 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduce tu fecha de nacimiento en formato dd-mm-aaaa:");
	        String fechaNacimiento = scanner.nextLine();

	        int luckyNumber = calcularLuckyNumber(fechaNacimiento);
	        
	        System.out.println("Tu número de la suerte es: " + luckyNumber);
	    }

	    public static int calcularLuckyNumber(String fechaNacimiento) {
			return 0;
	       
	    }
	}
