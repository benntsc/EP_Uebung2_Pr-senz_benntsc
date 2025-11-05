package p1;

public class P1_main {

	public static void main(String[] args) {
		int wuerfel = 5;
		
		if (wuerfel == 1 || wuerfel == 4) {
			System.out.println("Du hast gewonnen!!!");
		} else {
			if (wuerfel == 5) {
				System.out.println("Es ist ein unentschieden.");
			}
			if (wuerfel == 2) {
				System.out.println("Du hast verloren.");
			}
			else {
				System.out.println("Ein unklares ergebnis");
			}
		}
		
	}

}
