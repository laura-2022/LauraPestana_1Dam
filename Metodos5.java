import java.util.Scanner;
public class Metodos5 {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		 int num;
		 char letra;
		 
		 String cadena2=print('a',3);
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
		

}