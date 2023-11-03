public class Metodos16 {
    public static void main(String[] args) {
        char letra = 'C';
        int numero = 3;

        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        String secuencia = generarSecuencia(a, b, c, d, numero, letra);
                        System.out.println(secuencia);
                    }
                }
            }
        }
    }

    public static String generarSecuencia(int a, int b, int c, int d, int numero, char letra) {
        if (a == numero) {
            return letra + "-" + b + "-" + c + "-" + d;
        } else if (b == numero) {
            return a + "-" + letra + "-" + c + "-" + d;
        } else if (c == numero) {
            return a + "-" + b + "-" + letra + "-" + d;
        } else if (d == numero) {
            return a + "-" + b + "-" + c + "-" + letra;
        } else {
            return a + "-" + b + "-" + c + "-" + d;
        }
    }
}
