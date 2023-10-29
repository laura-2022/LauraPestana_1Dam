import java.util.Scanner;
import java.util.Random;
public class Metodos11 {
		public static int aleatorio=0;
			public static final int gana_local=0;
			public static final int gana_visitante=1;
			public static final int empate=2;
			public static String s= "";
		

		
    public static void main(String[] args) {
		 final String RESET = "\u001B[0m";
		 final String GREEN = "\u001B[32m";
		 final String BGAZUL = "\u001B[44m";
		
        Scanner lector = new Scanner(System.in);
                
        System.out.println(BGAZUL + "** QUINIELA PARTIDOS **" + RESET);
        String resultado = imprimirResultado(s);
        System.out.printf(GREEN+"%-30s%n",resultado+RESET);
		
	}
		public static String imprimirResultado(String s){
			Random random=new Random();
			for(int i=1;i<=15;i++){
		
				aleatorio=random.nextInt(3);
					switch(aleatorio){
						case gana_local:
							s+="Partido : "+i +" ="+"1"+"\n";						
						break;
						case gana_visitante:
							s+="Partido : "+i +" ="+"2"+"\n";	
						break;
						case empate:
							s+="Partido : "+i +" ="+"x"+"\n";	
						break;
						}
			
			}
		return s;			
		}
}
		

		
		
		
	
		
	

     
