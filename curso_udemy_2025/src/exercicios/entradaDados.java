package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class entradaDados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// variável tipo inteiro
		int x;

		System.out.println("Informe um número: ");
		x = sc.nextInt();

		System.out.println("Você digitou " + x);

		// variável tipo double
		double a;

		System.out.println("Informe mais um número");
		a = sc.nextDouble();

		System.out.printf("Voce digitou: %.2f%n", a);

		// variável tipo Char escolhendo apenas a primeira letra com charAt(0)
		char y;
		System.out.println("Informe um nome: ");
		y = sc.next().charAt(0);

		System.out.println("A primeira letra desse nome é " + y);

		// Várias variáveis juntas

		String a1;
		int a2;
		double a3;

		// várias variáveis juntas

		System.out.println("Informe uma letra:");
		a1 = sc.next();
		System.out.println("Informe uma número inteiro:");
		a2 = sc.nextInt();
		System.out.println("Informe uma número decimal:");
		a3 = sc.nextDouble();

		System.out.println("Dados digitados: ");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		//ler texto até a quebra de linha com sc.nextLine();
		
		String s1,s2,s3;
		
		System.out.println("Informe um nome composto: ");
		s1 = sc.nextLine();
		
		System.out.println("Informe um nome composto: ");
		s2 = sc.nextLine();
		
		System.out.println("Informe um nome composto: ");
		s3 = sc.nextLine();
		

		sc.close();
	}
}
