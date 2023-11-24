package prg3.src.main.java.com.laurapestana.prg3.lib;

import java.util.Scanner;

public class Lib {
    public static Scanner sc = new Scanner(System.in);

    public static boolean validarDecimal(int decimal) {
        //decimal es entero y pasa
        return true;

    }

    //comprobar que se componga de 0 y1
    public static boolean validarBinario(int binario) {
        String binariocad = String.valueOf(binario);
        for (int i = 0; i < binariocad.length(); i++) {
            char caracter = binariocad.charAt(i);
            if (caracter != '0' && caracter != '1') {
                return false;
            }
        }
        return true;
    }


    public static boolean validarHexadecinal(String hexadecimal) {
        //comprobar si solo tiene numeros del 0-9 y letras de A a F
        String caracteresHexadecimales = "0123456789ABCDEF";
        for (int i = 0; i < hexadecimal.length(); i++) {
            char caracter = hexadecimal.charAt(i);
            ///si no se encuentra entre caracteres validos regresa false
            if (caracteresHexadecimales.indexOf(caracter) == -1) {
                return false;
            }

        }
        return true;
    }

    public static int validarMenu(int numOpciones) {
        int opcion;
        boolean valido;
        do {

            System.out.println("Introduzca la opción deseada");
            opcion = Integer.parseInt(sc.nextLine());
            valido = (opcion >= 0) && (opcion <= numOpciones);

            if (!valido) {
                System.out.println("ERROR, introduzca una opción válida");
            }

        } while (!valido);

        return opcion;

    }
    public static int compareTo(String s1, String s2){
		
		int suma1 = 0;
		int suma2 = 0;

		int max=Math.max(s1.length(),s2.length());
		
		for(int i=0;i<max;i++){
			
			if(i<s1.length()){
				
				suma1+=s1.charAt(i);
			}
			if(i<s2.length()){
				
				suma2+=s2.charAt(i);
			}
		}
		return suma1-suma2;
	}

	
		public static int metodoLength(String s){
			boolean seguir=true;
			int contador=0;
		while(seguir){
			s.charAt(contador);
			contador++;
		}	
        return contador;		
		}

    public static int MicompareTo(String s1, String s2) {

        int suma1 = 0;
        int suma2 = 0;
     
        int max = Math.max(s1.length(), s2.length());


        for (int i = 0; i < max; i++) {

            if (i < s1.length()) {

                suma1 += s1.charAt(i);
            }
            if (i < s2.length()) {

                suma2 += s2.charAt(i);
            }
        }
        return suma1 - suma2;
    }

    
    

    public static int milength(String s) {
        boolean seguir = true;
        int contador = 0;
        while (seguir) {
            try {
                s.charAt(contador);
                contador++;
            } catch (StringIndexOutOfBoundsException e) {

                seguir = false;
            }
        }

        return contador;
    }


    public static String concat(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1.length() + s2.length());
        // return s1+s2;
        sb.append(s1).append(s2);
        return sb.toString();
    }

    public static String substring(String s, int indexInicio, int indexFinal) {
     
        char letra;

        //String s2=s1.substring (7,12); s2="tarde"
        StringBuilder sb = new StringBuilder(indexFinal - indexInicio + 1);
        for (int i = 0; i < indexFinal; i++) {
            sb.append(s.charAt(i));

        }
        return sb.toString();
    }


    //hay que plantear bien que si existe el substring "que "en la cadena, debo decir la position

    //dame subsrting que tenga esta ñlongitud, es igual al 123, no, pues continua avanzandoi
    public static int MiindexOf(String s, String sub) {
       
        for (int i = 0; i < s.length(); i++) {
            String aux = substring(s, i, i + sub.length());//el string y le paso el recorrido desde i=0 y en parelelo va sumandose para que vaya avanzando
           
            if (aux.equals(sub)) {
                return i;
            }
            return -1;
        }
        //ej lastOf (un bucle descendente que se empieza desde atras) , endWith,startWith.
		return 0;


    }


    public static String miReplace(String s, char oldchar, char newchar) {
        StringBuilder resultado = new StringBuilder(s.length());
       
        for (int i = 0; i < s.length(); i++) {

            //char c =charAt(i);
            //if (c==oldchar){}
            if (charAt(i) == oldchar) {

                resultado.append(newchar);
            } else {
                resultado.append(s.charAt(i));
            }
            return resultado.toString();
        }
		return s;

    }


    private static char charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static String devuelveMayuscula(String s) {
        if (s != null && s.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(s.length());
		return s;
    }


//EXPRESIONES REGULARES

    //validar dni con expresiones regulares
    public static boolean validaDni(String dni){
     // este no m efunciona // return dni.matches("^ [0-9]{7,8}[T|R|W|A|G|M|Y|F|P|D|X|N|J|Z|S|Q|V|H|L|C|K|E] $");
    return dni.matches("^[0-9]{7,8}[A-Za-z]$");
    }
    
    //VALIDAR NOMBRE
    public static boolean validarNombre(String nombre) {
    	return nombre.matches("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
    
    }
    //VALIDAR NUMERO ENTERO (puede ser positivo o negativo)
    public static boolean validarEntero(String texto) {
    	
		return texto.matches("^-?[0-9]+$");
    	
    }
    //entero que debe ser positivo
    public static boolean validarPositivo(String texto) {
    	
  		return texto.matches("^[0-9]+$");
      	
      }
      //entero que debe ser negativo
    
    public static boolean validarNegativo(String texto) {
    	
  		return texto.matches("^-[0-9]+$");
      	
      }
      //validar num binario
    
    public static boolean validarBinario(String binario) {
		return binario.matches("^[0-1]+$");
    	
    }
    //validar numero octal
    public static boolean validarOctal(String octal) {
		return octal.matches("^[0-7]+$");
    	
    }
    //validar numero hexadecimal
    public static boolean validarHexadecimal(String hexa) {
		return hexa.matches("^[0-9A-Fa-f]+$");
    
    
    }
    
    //validar numer real, real positivo, real negativo y real con x decimales
    
    public static boolean validarReal(String real) {
		return real.matches("^-?[0-9]+([\\.,][0-9]+)?$"); //se pone negativo opcional y decimal opcional
    	
    }
    
    public static boolean validarRealPositivo(String real) {
		return real.matches("^[0-9]+([\\.,][0-9]+)?$"); //va a ser positivo,solo decimal opcional
    	
    }
    public static boolean validarRealNegativo(String real) {
		return real.matches("^-[0-9]+([\\.,][0-9]+)?$"); //va a ser negativo,solo decimal opcional
    	
    }
    public static boolean validarRealNumDecimales(String real, int numdecimales) {
    		if(numdecimales>0) {
    			return real.matches("^-?[0-9]+([\\.,][0-9]{1,"+numdecimales+"})?$"); //modificamos los decimales
    	}else {
    		return false;
    	}
    }		
    public static boolean validarMatricula(String texto){
    	return texto.matches("^[0-9]{4}[A-Za-z]{3}$");
    }
 
}

    






