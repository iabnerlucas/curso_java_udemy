package exercicios;
import java.util.Scanner;

public class estruturaComparativa {
	public static void main (String[]args) {
		//operador comparativo
		// == igual
		// > maior
		// < menor
		// >= maior ou igual
		// <= menor ou igual
		// != diferente
		
		// expressões condicional: estrutura de controle de um certo bloco de comandos
		Scanner sc = new Scanner(System.in);
		
		int x = 5;
		
		System.out.println("Bom dia");
		
		if(x<0) {
			System.out.println("Boa tarde");
		}
		System.out.println("Boa noite");
		
		// estrutura condicional composta: V executa o If, F executa o Else
		
		int hora;
		
		System.out.println("Quantas horas são?");
		hora = sc.nextInt();
		
		if (hora <12 ) {
			System.out.println("Bom dia");
		} 
		else if(hora <18) {
			System.out.println("Boa tarde");
			}
			else {
			System.out.println("Boa noite");
			}
		
		sc.close();
	}

}
