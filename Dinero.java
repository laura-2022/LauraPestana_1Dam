/*

1.º DAM - Programación Ejercicios
Ejercicios Tema 3. Estructuras condicionales

*/
import java.util.Scanner;

public class Dinero {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
		int centimos;//ingresa el valor y loi convierto en centimos
		double euros;
		//declaro  monedas
		/*double moneda1;
        double moneda2;
        double moneda5;
		double moneda10;
		double moneda20;
		double moneda50;
		double moneda2e;
		double moneda1e;*/
		
		
		
		//declaro e inicializo cantidad monedad
	  int cant_moneda1=0;
        int cant_moneda2=0;
        int cant_moneda5=0;
		 int cant_moneda10=0;
		int cant_moneda20=0;
		 int cant_moneda50=0;
		 int cant_moneda2e=0;
		 int cant_moneda1e=0;


       System.out.println("Dime el valor en euros ");
        centimos = Integer.parseInt(lector.nextLine())*100;// la erntrada se multiplica por 100 para convertir a centimos
		//centimos=Integer.parseInt(euros*100);
		
		
		if(centimos>=200){ //si centimos es mayor o igual a 200, lo convertiria a cantidad monedas 2e
			cant_moneda2e=centimos/200;
		    centimos=centimos-cant_moneda2e*200; //
		}
		if(centimos>=100){
						cant_moneda1e=centimos/100;
						centimos=centimos-cant_moneda1e*100;

		}
	
		if(centimos>=50){
						cant_moneda50=centimos/50;
						centimos=centimos-cant_moneda50*50;

		}
		if(centimos>=20){
				cant_moneda20=centimos/20;
				centimos=centimos-cant_moneda20*20;
		}
		if(centimos>=10){
				cant_moneda10=centimos/10;
				centimos=centimos-cant_moneda10*10;
		}
		if(centimos>=5){
				cant_moneda5=centimos/5;
				centimos=centimos-cant_moneda5*20;
		}
		if(centimos>=2){
				cant_moneda2=centimos/2;
				centimos=centimos-cant_moneda2*2;
		}
		if(centimos>=1){
				cant_moneda1=centimos/1;
				centimos=centimos-cant_moneda1*1;
		}
		
		//mostrar las monedas    
			        System.out.println("el valor en total "  +centimos +"centimos se corresponde en monedas a :" );
			        System.out.println(" monedas 2€ :" +cant_moneda2e);
			        System.out.println(" monedas 1€ :" +cant_moneda1e );
			        System.out.println(" monedas 0.50€ :" +cant_moneda50);
				    System.out.println(" monedas 0.20€ :" +cant_moneda20 );
				    System.out.println(" monedas 0.10€ :"+cant_moneda10 );
					System.out.println(" monedas 5c :" +cant_moneda5);
			        System.out.println(" monedas 2c :" +cant_moneda2);
				    System.out.println(" monedas 1c :"+cant_moneda1 );
		
        lector.close(); // cierro scanner
		
		
		
	


    }
}

