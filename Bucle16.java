 /*Escribe un programa que permita jugar al siguiente juego. Se dispone de un dado normal de 6
caras con valores comprendidos entre 1 y 6. El objetivo del juego es sumar más puntos que el rival
(en este caso el ordenador) sin pasarse de 11 puntos (similitudes con el blackjack). Empezará el
jugador, que lanzará los dados hasta que ocurra alguno de los siguientes acontecimientos:
a) Obtenga exactamente 11 puntos (ha ganado).
b) Decida plantarse con una puntuación inferior a 11 puntos.
c) Se haya pasado de 11 puntos y por tanto habrá perdido.
En el caso a) sumará automáticamente dos porras (1 porra por victoria y otra de bonificación por
alcanzar la puntuación máxima).
En el caso b) el ordenador jugará e intentará igualar o superar sin pasarse de 11 puntos la
puntuación del jugador. Si consigue igualar o superar la puntuación sumará una porra para el
ordenador. Si además lo hace con una puntuación de 11 puntos tendrá bonificación de otra porra
por alcanzar la puntuación máxima.
En el caso c) el ordenador gana automáticamente y suma una porra sin necesidad de jugar.
El primero que llegue a 5 porras gana la partida*/


import java.util.Scanner; //importo random y escanner
import java.util.Random;
public class Bucle16{
	/*Se dispone de un dado normal de 6
caras con valores comprendidos entre 1 y 6. El objetivo del juego es sumar más puntos que el rival
(en este caso el ordenador) sin pasarse de 11 puntos*/
	
   public static void main(String[] args) {
		
		
		
		Scanner lector=new Scanner(System.in); 
		Random random=new Random();
		
		int dadoUsuario;
		dadoUsuario=(int)(Math.random()*6)+1; // declaro tirada de usuario con valores del 1 al 6
        int dadoOrdenador;
		dadoOrdenador=(int)(Math.random()*6)+1; // declaro tirada de ordennador con valores del 1 al 6
		int sumaTirada;
		int op;
		char respuesta;
		
		System.out.println("EMPECEMOS A JUGAR. Elige la opcion:");
		System.out.println("1) TIRAR DADO");
		System.out.println("2) PARO LA TIRADA");
			
			switch(op){
				case 1: 
				System.out.print ("tirada usuario: "+dado);
				sumaTirada+=dado;
				if(sumaTirada>11){
					System.out.print ("Has perdido");
					System.out.print ("¿quieres volver a tira?");
				}
				break;
				case 2:
			    tu resultado final  es ..+ y el del ordenador es :*
				break;
				
			}
			
			
		}
	
	}
}

     
