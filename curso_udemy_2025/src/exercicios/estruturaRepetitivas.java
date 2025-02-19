package exercicios;
import java.util.Scanner;

public class estruturaRepetitivas {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//estrutura enquanto = sem número exato que vai repetir
		
		System.out.println("Informe um número: ");
		int x = sc.nextInt();
		
		int soma = 0;
		
		while (x!=0) {
			soma +=x;
			x=sc.nextInt();
	
		}
		System.out.println(soma);
		sc.close();
	}
}
