	public class Segundos{
	public static void main (String[]args){
		Scanner lector=new Scanner(System.in);
		int segundosDados,minutos,horas,dias;
		System.out.println("Introduce Numero de segundos ");
		//segundosDados=lector.nextInt();
		segundosDados=Integer.parseInt(lector.nextLine());//el profe prefier con nextline parseado
		lector.close();
		
		
		segundos=segundosDados;
		/*
		minutos=segundosDados/60;
		segundos=segundosDados%60;
		En este punto los segundos ya estan calculados correctamente
		
		horas=minutos/60;
		minutos=minutos%60;
		En este punto los minutos ya estan calculados
		
	    dias=horas/24;
		horas=horas%24;
				En este punto las horas ya estan calculadas
				y el resto que queda son dias
		*/
		
		minutos=segundosDados/60;
		horas=segundosDados/3600;
		dias=segundosDados/86400;
		
		
		
	System.out.println("********************");
		System.out.println("1-SEGUNDOS  "+segundosDados);
		System.out.println("2-MINUTOS "+minutos);
		System.out.println("3-HORAS"+horas);
		System.out.println("4-DIAS  "+dias);
	System.out.println("********************");
		

	}
	
}