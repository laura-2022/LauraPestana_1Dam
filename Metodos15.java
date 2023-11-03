import java.util.Scanner;

public class Metodos15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la primera palabra: ");
        String palabra1 = scanner.next();
        System.out.println("Ingresa la segunda palabra: ");
        String palabra2 = scanner.next();
        System.out.println("Ingresa la tercera palabra: ");
        String palabra3 = scanner.next();

        System.out.println("Elige una opción: ");
        System.out.println("1. Más larga");
        System.out.println("2. Más corta");
        System.out.println("3. Sus vocales");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                String masLarga = palabraMasLarga(palabra1, palabra2, palabra3);
                System.out.println("La palabra más larga es: " + masLarga);
                break;
            case 2:
                String masCorta = palabraMasCorta(palabra1, palabra2, palabra3);
                System.out.println("La palabra más corta es: " + masCorta);
                break;
            case 3:
                String vocales = obtenerVocales(palabra1, palabra2, palabra3);
                System.out.println("Las vocales de las palabras son: " + vocales+"\n");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static String palabraMasLarga(String palabra1, String palabra2, String palabra3) {
        if (palabra1.length() >= palabra2.length() && palabra1.length() >= palabra3.length()) {
            return palabra1;
        } else if (palabra2.length() >= palabra1.length() && palabra2.length() >= palabra3.length()) {
            return palabra2;
        } else {
            return palabra3;
        }
    }

    public static String palabraMasCorta(String palabra1, String palabra2, String palabra3) {
        if (palabra1.length() <= palabra2.length() && palabra1.length() <= palabra3.length()) {
            return palabra1;
        } else if (palabra2.length() <= palabra1.length() && palabra2.length() <= palabra3.length()) {
            return palabra2;
        } else {
            return palabra3;
        }
    }

    public static String obtenerVocales(String palabra1, String palabra2, String palabra3) {
        String vocales = "";
        String vocalesPermitidas = "AEIOUaeiou";

        for (int i = 0; i < palabra1.length(); i++) {
            char letra = palabra1.charAt(i);
            if (vocalesPermitidas.indexOf(letra) != -1) {
                vocales += letra;
            }
        }

        for (int i = 0; i < palabra2.length(); i++) {
            char letra = palabra2.charAt(i);
            if (vocalesPermitidas.indexOf(letra) != -1) {
                vocales += letra;
            }
        }

        for (int i = 0; i < palabra3.length(); i++) {
            char letra = palabra3.charAt(i);
            if (vocalesPermitidas.indexOf(letra) != -1) {
                vocales += letra;
            }
        }

        return vocales;
    }
}
