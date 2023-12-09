package com.laurapestana.prg3.tema06;
 import java.util.Scanner;
import java.util.Random;

public class Ejercicio19 {
	static Random r = new Random();

	public Ejercicio19() {
		/*
		 * Genera un array de 100 enteros entre 0 y 100 (aleatorios) y crea 3 métodos
		 * que impriman los que son múltiplos de 5, los que son 0 y los que son
		 * múltiplos de 10
		 */
	
		int[] nums = new int[100];
		for(int i=0;i<nums.length;i++) {
		
			nums[i]=randomInt(0, 100);
			System.out.println(nums[i]+" ");
		}
		System.out.println("los multiplos de 5 son: "+mostrarMultiplosCinco(nums));
		System.out.println("los multiplos de 10 son: "+mostrarMultiplosDiez(nums));;
		}

	private StringBuilder mostrarMultiplosCinco(int[] nums) {
		StringBuilder multiploCinco=new StringBuilder();
		int contadorCinco = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%5==0 && nums[i]!=0){
			
				contadorCinco++;
				multiploCinco.append(nums[i]).append(" ");
			}
		}
		return multiploCinco;
	}

	private StringBuilder mostrarMultiplosDiez(int[] nums) {
		StringBuilder multiploDiez=new StringBuilder();
		int contadorDiez = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%10==0 && nums[i]!=0) {
			
				contadorDiez++;
				multiploDiez.append(nums[i]).append(" ");
			}
		}
		return multiploDiez;
	}
	public static int randomInt(int min, int max) {

		int resultado = r.nextInt(max - min + 1) + min; // puedo poner return antes del r.ne..
		return resultado;
	}
}


