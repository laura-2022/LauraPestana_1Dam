/*Escribe un programa que juegue con el usuario a adivinar un número. El ordenador tiene que
generar un número entero entre 1 y 100 y el usuario tiene que intentar adivinarlo en un número
de intentos limitado. Al empezar el juego nos pedirá el número de intentos máximo, después el
usuario irá introduciendo valores hasta acertar el número o agotar el número de intentos. Cada vez
que el usuario introduzca un valor, el ordenador tiene que indicarle al usuario si el número que
tiene que adivinar es mayor o menor que el que ha introducido. Si el usuario consigue acertar el
número antes de que se agoten los intentos, le mostraremos un mensaje que ha ganado, si agota
los intentos le mostraremos un mensaje que ha perdido.*/


import java.util.Random;
public class Bucle13{
   public static void main(String[] args) {
       

		Random random=new Random();
		
		int aleatorio;
		final int CARA=0;
		final int CRUZ=1;
		
		int contCaras=0;
		int contCruces=0;
		
		double porcenCaras;
		double porcenCruces;

		
	//[0-10]+MIN  es lo que busco de 10 a 20
	
		for(int i=0; i<1_000_000;i++){
			//aleatorio=random.nextInt(10); //si pongo un 10 dentro del nextInt coge eso como rango
		//aleatorio=random.nextInt(CRUZ-CARA+1)+CARA;	 //uswo el menor como minimo
			
			//en el caso de que quiera un rango entre 10 y 20
			aleatorio=random.nextInt(2);
			
			switch(aleatorio){
				case CARA:
				contCaras++;
				break;
				case CRUZ:
				contCruces++;
				break;
			}
			
			
		}
		porcenCaras=((double)contCaras/(contCaras+contCruces))*100;  //se castea a double
		porcenCruces=((double)contCruces/(contCaras+contCruces))*100;

			   System.out.println("CARAS:     "+porcenCaras);
			   
			   System.out.println("CRUCES:     "+porcenCruces);

    			
	}
}

     
