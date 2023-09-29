
import java.util.Scanner;
public class Nuevo1{
	public static void main (String[]args){
			int num1;
			int num2;
			int res;
			
			Scanner lector =new Scanner(System.in);
			System.out.println("Dime un numero 1");
			num1=lector.nextInt();

			System.out.println("Dime un numero 2");
			num2=lector.nextInt();
			res=num1+num2;
			System.out.println("La suma de los dos numeros es :  "+res);
			lector.close();+


	}
}