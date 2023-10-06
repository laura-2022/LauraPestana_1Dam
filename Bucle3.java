//programa que calcule el producto de 2 numeros y que los convierta en suma . Por ejemplo 2x3=3+3;//2 veces 3




import java.util.Scanner;


public class Bucle3{
    public static void main(String[] args) {
		   Scanner lector = new Scanner(System.in);
//bucle for que imprima numero esuma entre 1 a 1000
	int num1;
	int num2;
	

       System.out.println("-------------Muestra suma del producto de dos numeros--------------------");
	 
	   System.out.println("Dime numero 1");
       num1=Integer.parseInt(lector.nextLine());// son las veces
	   
       System.out.println("Dime numero 2");
       num2=Integer.parseInt(lector.nextLine());// es el numero que se suma
		
	  
	   int suma=0;
	   for(int i=0;i<num1;i++){
	   // suma =num2 +"+" ;
		suma=suma+num2;
	 
	   }

   System.out.println("-el total de la suma la operacion : "+num1+" X "+num2+"= "+ suma);
		
    }
}

