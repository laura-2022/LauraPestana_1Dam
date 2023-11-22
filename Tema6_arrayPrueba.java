package app.build.classes.java.main.com.laurapestana.tema6;

public class Tema6_arrayPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]array1= {1,2,-3,4,60,-8,559};
		int[] array2=array1;

		array2[3]=1;
		
		
		int minimo=Integer.MAX_VALUE;
		
			for(int dato: array1) {
				if(dato<minimo) {
					minimo=dato;
				}
			}
			System.out.println("el minimo del array datos es = "+minimo);
//tambien se puede poner que datos[0]=minimo , pero tendria que utilizar for clasico
			
			
			
		for(int dato:array1) {
			System.out.print(dato+" ");
		}
		System.out.println("");
		for(int dato:array2) {
			System.out.print(dato+" ");

		}

			
			
			
			
	}
}