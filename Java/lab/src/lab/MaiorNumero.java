package lab;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		 
		Scanner ent = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("insira o primeiro n�mero");
		num1 = ent.nextInt();
		System.out.println("insira o segundo n�mero");
		num2 = ent.nextInt();
		
		
		
		if (num1>num2) {
			System.out.println("O primeiro n�mero � maior");
		} else {
			System.out.println("O segundo n�mero � maior");
		}
		
		
	
		
		
		
		
		
	}
}
