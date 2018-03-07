package Aulas;

public class Slide36 {

	public static void main(String[] args) {
		int idade = 20;
		if (idade <=12) {
			System.out.println("Criança");
		}else if (idade > 12 && idade <= 19) {
			System.out.println("Adolescente");
		}else if (idade > 19 && idade <= 60) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}
	}
}
