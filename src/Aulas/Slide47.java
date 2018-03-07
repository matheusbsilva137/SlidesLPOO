package Aulas;

public class Slide47 {

	public static void main(String[] args) {
		int i=0, j=0;
		principal2: for(j=1; j<10; j++) {
			for(i=1; i<10; i++) {
				if((i%j) == 0) {
					System.out.println("i="+i+" j="+j);
					continue principal2;
				}
			}
			j++;
		}
	}

}
