package com.cip.prog;

import java.util.Scanner;

public class GradosFah {

	public static void main(String[] args) {
		
		// Vamos a crear un programa que calcule
		//el paso de los grados ºC a ºF
		
		//Usamos el comando Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos por pantalla el nº de grados ºC
		System.out.println("Introdusca los ºC: ");
		int C = sc.nextInt();
		//defino con float los nºs de la division para que el programa los reconosca
		
		float n1= 9;
		float n2 = 5;
		
		//Definimos la formula F=C*(9/5)+32
		
		float F= C*(n1/n2)+32;
		
		System.out.println("Los grados ºF son: "+F);
		
		

	}

}
