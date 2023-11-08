import java.util.Scanner;
//escribe programa que solicite al usuario NIF y compruebe si es correcto cvomprobando si la letra introducida es por el usuario es la que corresponde con el numero
public class Metodos19 {
    static Scanner scanner = new Scanner(System.in);
    static String letra;
    static String dni;

    private static String PedirDni() {
        System.out.println("Ingresa DNI (número):");
        dni = scanner.next();
        return dni;
    }

    private static char devolverLetra(String dni, String letra) {
        int resto = Integer.parseInt(dni) % 23;
        char letradni = letra.charAt(resto);
        return letradni;
    }

    private static void main(String[] args) {
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        PedirDni();
        System.out.println("Su NIF es: "+dni + devolverLetra(dni, letra));
    }
	  
	  
	private static String ValidarDni(String dni) {
       int dninum=dni.substring(0, 7);
       char dniletra=dni.charAt(8);
       boolean esCorrecto=false;
       
	       if (dninum.length==7 && devolverLetra(dni,letra)=letradni) {
	    	 boolean esCorecto=true;
	    	 String mensaje= "el "+dni" es valido ";
	       }
      return mensaje;
    }
}
