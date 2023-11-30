package com.laurapestana.prg3.tema06;
 import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio17 {
	public static Scanner scanner = new Scanner(System.in);

	public static double estaturaMedia = 1.60;

	public Ejercicio17() {


		System.out.println("Ejercicio 17:");

		int N = pedirN();
		double arrayEstaturas[] = pedirEstatura(N);
		//double media = calcularMedia(arrayEstaturas);
		double media = 1.60;
		System.out.println("****Comparado con la media:****");
		mostrarEstaturasMayores(arrayEstaturas, media);
	}

	private void mostrarEstaturasMayores(double[] arrayEstaturas, double media) {
		for (double estatura : arrayEstaturas) {
			if (estatura > media) {
				System.out.println("La estatura " + estatura + " es mayor que la media.");
			} else {
				System.out.println("La estatura " + estatura + " es menor o igual que la media.");
			}
		}
	}

	/*private double calcularMedia(double[] arrayEstaturas) {
		double sumaEstaturas = 0;

		for (double estatura : arrayEstaturas) {
			sumaEstaturas += estatura;
		}

		return sumaEstaturas / arrayEstaturas.length;
	}*/

	private int pedirN() {
		System.out.println("Dame la cantidad de estaturas que ingresaras: ");
		return scanner.nextInt();
	}

	private double[] pedirEstatura(int N) {
		double[] arrayEstaturas = new double[N];
		for (int i = 0; i < arrayEstaturas.length; i++) {
			System.out.print("Ingrese la estatura en la posición " + (i + 1) + ": ");
			arrayEstaturas[i] = scanner.nextDouble();
		}
		return arrayEstaturas;
	}

	
}

