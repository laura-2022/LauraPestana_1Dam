public class SalidaFormato7 {
    public static void main(String[] args) {
        String s = "";
        

        for (int i = 1; i <= 9; i++) {
            s += i;
            System.out.printf("%9s", s);
			
            for (int j = i; j >= 1; j--) {
				
                System.out.printf("%-9s", s);
				
            }
			    System.out.println(); // Agregamos un salto de línea al final de cada iteración del bucle externo

        }

    }
}