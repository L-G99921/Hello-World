package lab;

import java.util.Scanner;

public class Temperaturas {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		double C,K;
		
		System.out.println("Qual a temperatura em graus Celsius?");
		C = ent.nextDouble();
		
		K = (C + 273.15);
		
		System.out.println("A Temperatura em Kelvin é: " + K + "K");
		
		
		
		
		
		
		
	}
	

}
