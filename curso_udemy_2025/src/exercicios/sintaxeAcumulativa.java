package exercicios;
import java.util.Scanner;

public class sintaxeAcumulativa {
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe a minutagem utilizada: ");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if (minutos>100) {
			conta += + 2 * (minutos-100);
		}
		System.out.printf("O valor a pagar R$ %.2f%n",conta);
		
		// atribuição acumulativa
		// a += b -> a = a+b
		// a -=b -> a = a-b;
		// a /= b -> a = a/b;
		// a %= b -> a = a%b (resto da divisão)
	}
}
