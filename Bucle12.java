/*Escribe un programa que juegue con el usuario a adivinar un número. El ordenador tiene que
generar un número entero entre 1 y 100 y el usuario tiene que intentar adivinarlo en un número
de intentos limitado. Al empezar el juego nos pedirá el número de intentos máximo, después el
usuario irá introduciendo valores hasta acertar el número o agotar el número de intentos. Cada vez
que el usuario introduzca un valor, el ordenador tiene que indicarle al usuario si el número que
tiene que adivinar es mayor o menor que el que ha introducido. Si el usuario consigue acertar el
número antes de que se agoten los intentos, le mostraremos un mensaje que ha ganado, si agota
los intentos le mostraremos un mensaje que ha perdido.*/

import java.util.Scanner;
import java.util.Random;
public class Bucle12{
   public static void main(String[] args) {
       
        Scanner lector = new Scanner(System.in);
		Random random=new Random();
		int num=0;
		int aleatorio=0;
		final int MIN=1;
		final int MAX=100;
		int intentos=3;
	//[0-10]+MIN  es lo que busco de 10 a 100
	
		for(int i=0; i<3;i++){
			//aleatorio=random.nextInt(10); //si pongo un 10 dentro del nextInt coge eso como rango
			aleatorio=random.nextInt(MAX-MIN+1)+MIN;	
			
			//en el caso de que quiera un rango entre 10 y 20
			System.out.println("dame numero ");
			num=lector.nextInt();
			
			
				

		}
			while(num==aleatorio){
					System.out.println("Has acertado el numero es "+aleatorio);
			}
				 System.out.println("has agotado los 3 intentos, la respuesta correcta es :"+aleatorio);

		
	
    			
	}
}

     
