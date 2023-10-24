public class SalidaFormato8_profe {
    public static void main(String[] args) {
       

        for (int i = 1; i <= 5; i++) {
            //System.out.printf("%d",i);
			for(int j=1;j<=5;j++){
            System.out.printf("%d.%d ",i,j);
			}
			    // Agregamos un salto de línea al final de cada iteración del bucle externo
            System.out.println("\n");
        }
			

        

    }
}