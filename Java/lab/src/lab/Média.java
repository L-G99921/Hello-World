package lab;

import java.util.Scanner;

public class Média 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Esse programa vai só calcular a sua média de acordo com o que você inserir nele");
		
		Scanner ent = new Scanner(System.in);
		
		int n1,n2,n3,media;
		System.out.println("Insira a sua primeira nota abaixo");
		n1 = ent.nextInt();
		System.out.println("insira a sua segunda nota abaixo");
		n2 = ent.nextInt();
		System.out.println("insira a sua terceira nota abaixo");
		n3 = ent.nextInt();
		
		media = (n1+n2+n3) / 3;
		
		System.out.println("A sua média é: " + media);
		
		if (media >= 7) 
		{
			System.out.println("Aprovado");
		} else 
		{
			System.out.println("Reprovado");
		}
		
		
		
		
		
		
	}

}
