

public class Bucle5 {
    public static void main(String[] args) {
  

        System.out.println("------------Muestra números de 1-1000 y especifica si es par o impar y si es múltiplo de 5--------------------");

        for (int i = 1; i <= 1000; i++) {
			String resultado=i+" :";
            if (i % 2 == 0 && i % 5 == 0) {
				resultado =resultado + "es par y multiplo de 5";
                System.out.println(resultado);
            }else if (i % 2 != 0 && i % 5 == 0){
				resultado=resultado + "es impar y múltiplo de 5";
                System.out.println(resultado );
            }else if(i % 2 == 0 && i % 5 != 0){
				resultado=resultado+"es par y no es multiplo de 5";
                System.out.println(resultado);
            }else if(i % 2 != 0 && i % 5 != 0){
				resultado=resultado+"es impar y no es multiplo de 5";
                System.out.println(resultado);
			}
        }
    }
}
