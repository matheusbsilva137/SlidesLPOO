package Aulas;

public class Slide46 {

	public static void main(String[] args) {
		char letras[] = {'B', 'X', 'R', 'A', 'S', 'I', 'L'};
		int i;
		for (i=0; i<letras.length; i++) {
			if (letras[i] == 'X') {
				continue;	
			}
			System.out.println(letras[i]);
		}
	}
}
