import java.util.Scanner;
public class metodos19_profe {

	 static Scanner scanner=new Scanner(System.in);

	    public static void main(String[] args) {

	
	  System.out.println("dime nif");
	 String nif=scanner.nextLine();
	 
	 if(validarNif(nif)) {
		 System.out.println("el nif es correcto");
	 }else {
		 System.out.println("el nif no es correcto");
	 }
	 scanner.close();       
	 }

		private static boolean validarNif(String nif) {
			// TODO Auto-generated method stub
			char letra=nif.charAt(nif.length()-1);
			int numero =Integer.parseInt(nif.substring(0,nif.length()-1));
			return false;
		}
		
		public static char obtenerLetraDni(int dni) {
			String s="TRWAGMYFPDXBNJZSQVHLCKE";
			
			int pos=dni%23;
			
			return s.charAt(pos);
			
		}
	}
