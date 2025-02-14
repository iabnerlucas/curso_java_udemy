package exercicios;

import java.util.Scanner;

public class exerciciosCondicao {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
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
		} 
	
}
