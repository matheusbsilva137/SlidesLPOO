package Aulas;

public class Slide24e25 {

	public static void main(String[] args) {
		int a = 0;		
		int b = a++;	// incrementado depois de atribuir
		int c = ++a;	// incrementado antes de atribuir
		b = a--;		// decrementado depois de atribuir
		c = --a;		// decrementado antes de atribuir
		
		int x = +3;		// x recebe o positivo 3
		x = -x;			// x recebe -3, neste caso
		
		int i = ~1;		// i = -2 (os bits foram invertidos)
		
		boolean falsidade = !(true);	// inverte o valor booleano
		
		double d = 1.99;
		int i = (int) d;	// converte de double p/ int (perda de precisão)
		
		int um = 3/2;					// divisão de inteiros gera um inteiro
		float umEmeio = (float)3/2;		// ocorre promoção aritmética para float
		double xyz = umEmeio*um;		// ocorre promoção aritmética para float
		
		int resto = 7%2;				// resto = 1
		
		long l = 1000+4000;
		double d = 1.0-0.01;
		
		long var = 12345;
		String str = "O valor de var é "+var;
		
		String str = "O valor de var é "+Long.toString(var);

	}

}
