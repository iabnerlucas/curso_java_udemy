package exercicios;

public class expressaoTernária {

	public static void main(String[] args) {
		//exemplo If Else

		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
		desconto = preco * 0.1;
		}
		else {
		desconto = preco * 0.05;
		}
		
		// o mesmo exemplo só que com expressão ternária
		// 
		double precos = 34.5;
		double descontos = (precos<20.0) ? preco *0.1 : preco * 0.05;
		
		//(condição) ? valor para verdadeiro : valor para falso
	}

}
