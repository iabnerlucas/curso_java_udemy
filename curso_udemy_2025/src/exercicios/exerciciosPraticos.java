package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exerciciosPraticos {
	
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		//primeiro exercício
		
		System.out.println("Primeiro exercício");
		
		System.out.println("Informe um número: ");
		int a=sc.nextInt();
		
		System.out.println("Informe o segundo número:");
		int b=sc.nextInt();
		
		int soma = a+b;
		
		System.out.println("SOMA: "+soma);
		
		//segundo exercício
		
		System.out.println("Segundo exercício");
		
		System.out.println("Informe o raio do círculo: ");
		int raio =sc.nextInt();
		
		double area = Math.pow(raio, 2)*3.14159;
		
		System.out.printf("A área do círculo é: %.4f%n", area);
	
		//terceiro exercício
		
		System.out.println("Terceiro exercício");
		
		int w, x,y,z;
		
		System.out.println("Informe o primeiro valor inteiro(A): ");
		w = sc.nextInt();
		
		System.out.println("Informe o segundo valor inteiro(B): ");
		x = sc.nextInt();
		
		System.out.println("Informe o terceiro valor inteiro(C): ");
		y = sc.nextInt();
		
		System.out.println("Informe o quarto último inteiro(D): ");
		z = sc.nextInt();
		
		int diferenca = (w*x)-(y*z);
		
		System.out.println("A diferença do produto de A e B pelo produto de C e D é: "+ Math.abs(diferenca));

		//quarto exercício
		
		System.out.println("Quarto exercício");
		
		int numeroFuncionario;
		int numeroHoras;
		int valorHora;
		
		System.out.println("Funcionário, informe seu id: ");
		numeroFuncionario = sc.nextInt();
		
		System.out.println("Quantas horas trabalhadas nessa semana? ");
		numeroHoras = sc.nextInt();
		
		System.out.println("Quanto você ganha por hora? ");
		valorHora = sc.nextInt();
		
		int salario = (numeroHoras*valorHora);
		
		System.out.println("Funcionário do Id " + numeroFuncionario + ", seu salário total dessa semana é: "+salario);
	
		//quinto exercício 
		
		System.out.println("Quinto exercício");
		
		int id,idProduto2, numPecas, numPecas2;
		double valorUnit, valorUnit2;
		
		System.out.println("Informe o ID da peça 1:");
		id = sc.nextInt();
		
		System.out.println("Informe o número de peças com o id "+id+":");
		numPecas = sc.nextInt();
		
		System.out.println("Informe o valor da peça 1: ");
		valorUnit = sc.nextDouble();
		
		System.out.println("Informe o ID da peça 2:");
		idProduto2 = sc.nextInt();
		
		System.out.println("Informe o número de peças com o id "+id+":");
		numPecas2 = sc.nextInt();
		
		System.out.println("Informe o valor da peça 2:");
		valorUnit2 = sc.nextDouble();
		
		double pagamento= (valorUnit*numPecas)+(valorUnit2*numPecas2);
		
		System.out.println("O valor a ser pago é: "+pagamento);
		
		//sexto exercício 
		
		System.out.println("Sexto exercício");
		double lado1,lado2,lado3;
		
		System.out.println("Informe o primeiro número:");
		lado1 = sc.nextDouble();
		
		System.out.println("Informe o segundo número:");
		lado2 = sc.nextDouble();
		
		System.out.println("Informe o terceiro número:");
		lado3 = sc.nextDouble();
		
		double triangulo = lado1 * lado3 / 2.0;
		double circulo = (Math.pow(lado3, 2))*3.14159;
		double trapezio= (lado1+lado2)*lado3/2;
		double quadrado = Math.pow(b,2);
		double retangulo = lado1 * lado2;
		
		System.out.printf("Triângulo: %.3f%n" , triangulo);
		System.out.printf("Cìrculo: %.3f%n" , circulo);
		System.out.printf("Trapézio: %.3f%n" , trapezio);
		System.out.printf("Quadrado: %.3f%n" , quadrado);
		System.out.printf("Retângulo: %.3f%n", retangulo);
		
		
	}

}
