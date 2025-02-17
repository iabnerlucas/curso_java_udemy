package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class exerciciosCondicao {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//exercício 1
		
		System.out.println("Informe o número: ");
		int inteiro = sc.nextInt();
		
		if (inteiro <0) {
			System.out.println("Número negativo.");
		} else {
			System.out.println("Número positivo.");
		}
		
		//exercício 2
		
		int parImpar;
		
		System.out.println("Informe um número inteiro:");
		parImpar = sc.nextInt();
		
		if (parImpar % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número Ímpar");
		}
		
		// exercício 3
		
		int a,b;
		
		System.out.println("Informe o primeiro número:");
		a = sc.nextInt();
		
		System.out.println("Informe o segundo número:");
		b = sc.nextInt();
		
		if(a%b == 0 || b%a == 0) {
			System.out.println("Divisível");
		} else {
		System.out.println("Não divisível");
		}
		
		//exercício 4
		
		System.out.println("Que horas o jogo começou?");
		int horaInicial = sc.nextInt();
		
		System.out.println("Que horas o jogo acabou?");
		int horaFinal =  sc.nextInt();
		
		int duracao;
		
		if (horaInicial > horaFinal) {
			duracao = 24- horaInicial + horaFinal;
		} else {
			duracao = horaFinal - horaInicial;
		}
		if (duracao < 1 && duracao>24) {
			System.out.println("Tempo não permitido");
		}
		System.out.println("Você jogou por " + duracao + " horas");
		
		//exercício 5
		
		System.out.println("Informe o seu pedido de acordo com a tabela a seguir: 1 = Cachorro quente / 2 = X-Salada / 3 = X-Bacon / 4 - Torrada simples / 5 - Refeigerante");
		int pedido = sc.nextInt();
		
		System.out.println("Informe a quantidade: ");
		int quantidade = sc.nextInt();
		
		double valor;
		
		if (pedido == 1) {
			valor = 4;
		} else if (pedido ==2) {
			valor = 4.5;
		} else if (pedido == 3) {
			valor =  5;
		} else if(pedido == 4) {
			valor = 2;
		} else {
			valor = 1.5;
		}
		
		double valorFinal =  valor *  quantidade;
		
		System.out.println("Total do pedido: "+ valorFinal);
		
		//exercício 6
		System.out.println("Informe um número qualquer: ");
		double intervalo = sc.nextDouble();
		
		if (intervalo > 0 && intervalo <25) {
			System.out.println("Intervalo (0,25)");
		} else if (intervalo > 25 && intervalo <50) {
			System.out.println("Intervalo (25,50)");
		} else if (intervalo > 50 && intervalo <75) {
			System.out.println("Intervalo (50,75)");
		} else if (intervalo > 75 && intervalo <=100) {
			System.out.println("Intervalo (75,100)");
		} else {
			System.out.println("Fora de intervalo");
		}
	
		//exercício 7
		System.out.println("Informe seu salário: ");
		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("Seu imposto é de: R$ %.2f%n", imposto);
		}
		
		sc.close();
	}
}