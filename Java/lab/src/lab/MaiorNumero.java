package lab;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		 
		Scanner ent = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("insira o primeiro número");
		num1 = ent.nextInt();
		System.out.println("insira o segundo número");
		num2 = ent.nextInt();
		
		
		
		if (num1>num2) {
			System.out.println("O primeiro número é maior");
		} else {
			System.out.println("O segundo número é maior");
		}
		
		
	
		
		
		
		
		
	}
}
