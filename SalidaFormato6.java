
public class SalidaFormato6 {
    public static void main(String[] args) {
        String s = "";

        for (int i = 1; i <= 9; i++) {
            s += i; // Agregar el dígito al final de la cadena
            String mirrored = s + new StringBuilder(s).reverse().toString(); // Crear la versión reflejada
            System.out.printf("%9s%-9s\n", mirrored, s); // Alinear la primera a la derecha y la segunda a la izquierda
        }
    }
}

