public class SalidaFormato8 {
    public static void main(String[] args) {
       

        for (int i = 0; i <= 1; i++) {
            //System.out.printf("%d",i);
			for(int j=30;j<=37;j++){
				for(int k=40;k<=47;k++){
					System.out.printf("\u001B["+i+";"+j+";"+k+";"+"43m%1d:%2d:%2d",i,j,k);
					
					//aqui falta el reseteo
				}
				   System.out.println("\n");
			}
			    // Agregamos un salto de línea al final de cada iteración del bucle externo
         
        }
			

        

    }
}