 /*Escribe un programa que permita determinar la probabilidad con la que aparece cada uno de los
valores al lanzar un dado. Para hacerlo, se lanzará el dado 1.000.000 veces y se visualizará
cuántas veces ha aparecido cada número y el porcentaje que representa del total.*/



import java.util.Random;
public class Bucle14{
   public static void main(String[] args) {
       

		Random random=new Random();
		
		int aleatorio;
		final int UNO=1;
		final int DOS=2;
		final int TRES=3;
		final int CUATRO=4;
		final int CINCO=5;
		final int SEIS=6;
		
		int contUNO=0;
		int contDOS=0;
		int contTRES=0;
		int contCUATRO=0;
		int contCINCO=0;
		int contSEIS=0;
		
		double porcenUNO;
		double porcenDOS;
		double porcenTRES;
		double porcenCUATRO;
		double porcenCINCO;
		double porcenSEIS;
		
		
	//[0-10]+MIN  es lo que busco de 10 a 20
	
		for(int i=1; i<7;i++){
			//aleatorio=random.nextInt(10); //si pongo un 10 dentro del nextInt coge eso como rango
		//aleatorio=random.nextInt(CRUZ-CARA+1)+CARA;	 //uswo el menor como minimo EN ESTE CASO ES CARA
			
			//en el caso de que quiera un rango entre 10 y 20
			aleatorio=random.nextInt(6);
			
			switch(aleatorio){
				case UNO:
				contUNO++;
				break;
				case DOS:
				contDOS++;
				break;
				case TRES:
				contTRES++;
				break;
				case CUATRO:
				contCUATRO++;
				break;
				case CINCO:
				contCINCO++;
				break;
				case SEIS:
				contSEIS++;
				break;
			}
			
			
		}
		porcenUNO=((double)contUNO/(6))*100;  //se castea a double
		porcenDOS=((double)contDOS/(6))*100;//SE DIVIDE ENTRE EL NUMERO DE VECES DEL BUCLE EN ESTE CASO ES 6
	    porcenTRES=((double)contTRES/(6))*100;  
		porcenCUATRO=((double)contCUATRO/(6))*100;
		porcenCINCO=((double)contCINCO/(6))*100;
		porcenSEIS=((double)contSEIS/(6))*100;

			   System.out.println("UNO:     "+porcenUNO);
			   System.out.println("DOS:     "+porcenDOS);
			   System.out.println("TRES:     "+porcenTRES);
			   System.out.println("CUATRO:     "+porcenCUATRO);
			   System.out.println("CINCO:     "+porcenCINCO);
			   System.out.println("SEIS:     "+porcenSEIS);
    			
	}
}

     
