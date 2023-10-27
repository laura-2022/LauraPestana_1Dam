import java.util.Scanner;

public class Metodos4 {

   

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		double num1,num2;
		
		System.out.println("num1");
        num1= sc.nextDouble();
		
        System.out.println("num2");
        num2 = sc.nextDouble();
		
		Sistem.out.printf("El mayor es %.2f\n",max(num1,num2);

		sc.close();
       
    }
	public static double max(double num1, double num2){
		if(num1>=num2){
			return num1;
		
	}else{
		return num2;// se puede saltar el else
	}

}