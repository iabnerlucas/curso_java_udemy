package exercicios;

import java.util.Scanner;

public class exercicioRepeticao {

		public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//exercício 1
		System.out.println("Informe a senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha incorreta");
			System.out.println("Informe a senha: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso liberado");
			
		}
}
