package exercicios;
import java.util.Scanner;

public class exercicioSwitchCase {

		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe o valor da mesada: ");
			double mesada = sc.nextDouble();
			
			System.out.println("Informe o valor da compra: ");
			double compra = sc.nextDouble();
			
			while (mesada > compra) {
				mesada -= compra;
				System.out.println("Mesada: "+mesada);
				mesada = sc.nextDouble();
			}
			System.out.println("Saldo insuficiete");
		}
}
