import java.util.Scanner;
public class Metodos6 {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		 int num;
		 int num2;
		 char letra;
		 
		 String cadena2=print('a',3,2);
		 System.out.print(cadena2);
		
		 sc.close();
       
    }
	public static String print(char letra, int num){
		String cadena="";
		for(int i=1;i<=num;i++){
			//cadena=letra+"";
			cadena=cadena+letra;
			//sale del bulce e imprimo
		}
		return cadena;	
	}
	public static String print(char letra, int num, int num2){//primero filas y despues columnas
		String cadena="";
		for(int i=1;i<=num2;i++){
			cadena=cadena+print(letra,num); //letra y columnas
			//cadena=letra+"";
			//for(int j=1;j<=num;j++){
			//cadena=cadena+letra;
			//sale del bulce e imprimo
		cadena=cadena+"\n";
			}
			return cadena;	
		}
		
	}
