package exercicios;

public class casting {
	public static void main(String []args ) {
		
		double b, B, h, area;
		b = 6.0;
		B=8.0;
		h=5.0;
		area = (b+B)/2.0 *h;
		
		System.out.println(area);
		
		
		int a,e;
		double resultado;
		
		a=5;
		e=2;
		resultado = (double) a/e; //casting para conversão explícita
		
		System.out.println(resultado);
		
		double x;
		int y;
		
		x= 5.0;
		y = (int) a; //computador pensou que perderia informação
		
		System.out.println(y);
		}

}
