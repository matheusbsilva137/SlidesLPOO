package Aulas;

public class Slide45 {

	public static void main(String[] args) {
		int j=0, i = 0;
		principal1: while(true) {
			for (i=0; i<1000; i++) {
				if (j == 10 && i==100) {
					break principal1;
				}
			}
			j++;
		}
	}

}
