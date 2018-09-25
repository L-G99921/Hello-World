import java.util.Scanner;

public class economia{
	public static void main(String[] args) {
		double preco_p = 0.12;
		double preco_b = 1.50;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos pãezinhos foram vendidos?");
		int pão = entrada.nextInt();
		double lucro = (double) pão * preco_p;
		System.out.println("Quantas broas foram vendidas?");
		int broa = entrada.nextInt();
		
		double lucro2 = broa*preco_b;
		double lucro_t = lucro * lucro2;
		double poupar = (lucro_t * 0.1);
		System.out.println("O lucro é: " + lucro_t + " ele deve poupar:" + poupar);
	}
}