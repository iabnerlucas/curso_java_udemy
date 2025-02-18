package exercicios;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//exemplo com If-Else
		System.out.println("Informe um número que represente o dia: ");
		int x = sc.nextInt();
		String dia;
		if (x == 1) {
			dia = "domingo";
		} else if (x == 2) {
			dia = "segunda";
		} else if (x == 3) {
			dia = "terca";
		} else if (x == 4) {
			dia = "quarta"; 
		} else if (x == 5) {
			dia = "quinta";
		} else if (x == 6) {
			dia = "sexta";
		} else if (x == 7) {
			dia = "sabado";
		} else {
			dia = "valor invalido";
		}
		System.out.println("Dia da semana: " + dia);
		
		//O mesmo exemplo com switch-case
		
		
		String dias;
		
		System.out.println("Informe um número que represente o dia:");
		int y = sc.nextInt();
		
		switch(y) {
		
		case 1:
			dias = "domingo";
			break;
		case 2: 
			dias = "segunda";
			break;
		case 3:
			dias = "terça";
			break;
		case 4: 
			dias = "quarta";
			break;
		case 5: 
			dias = "quinta";
			break;
		case 6: 
			dias = "sexta";
			break;
		case 7: 
			dias = "sábado";
			break;
		default: 
			dias = "valor inválido";
			break;
		}
		System.out.println("Dia da semana: " + dias);
		
		
		sc.close();
		

	}

}
