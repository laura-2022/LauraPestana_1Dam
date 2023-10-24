public class Metodos {
    public static void main(String[] args) {
       
       double resultado = suma(3, 5); 
       System.out.printf("La suma es %.2f\n", resultado);
       resultado = suma(3, 5, 7);
	   System.out.printf("La suma es %.2f\n", resultado);

       sumaProc(3, 5);
	   int x=5;
	   incrementa(x);
	   System.out.printf("el valor de x es %d\n",x);

    }
    
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double suma(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
    
    public static void sumaProc(double num1, double num2) {
       System.out.printf("La suma es %.2f\n", num1 + num2);
    }
	
	
	public static void incrementa(int x){
		x=x+1;
	}
}
