package Aulas;

public class Slide16 {

	public static void main(String[] args) {
		String str = "Isto � uma string do Java";
		String xyz = new String("Isto � uma string do Java");
		if(str == xyz) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		
		if(str.equals(xyz)){
			//MANEIRA CORRETA DE SE COMPARAR O CONTE�DO DAS STRINGS
		}
		
		System.out.println("Tamanho da string: "+str.length());
		System.out.println("SubString: "+str.substring(0,10));
		System.out.println("Caracter na posi��o 5: "+str.charAt(5));
	}

}
