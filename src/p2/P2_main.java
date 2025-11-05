package p2;

public class P2_main {

	public static void main(String[] args) {
		int a = 50;
		int b = 50;
		int c = 100;
		int d = 0;

		boolean E1 = (a == b);
		boolean E2 = (a == b || a == c);
		boolean E3 = (a + b >= c);
		boolean E4 = (a + b + c >= 100);

		if (E1 == true) {
			if (E2 == true) {
				if (E3 == true) {
					if (E4 == true) {
						d = 4;
					} else {
						d = 3;
					}
				} else {
					if (E4 == true) {
						d = 3;
					} else {
						d = 2;
					}
				}
			} else {
				if (E3 == true) {
					if (E4 == true) {
						d = 3;
					} else {
						d = 2;
					}
				} else {
					if (E4 == true) {
						d = 2;
					} else {
						d = 1;
					}
				}
			}
		} else {
			if (E2 == true) {
				if (E3 == true) {
					if (E4 == true) {
						d = 3;
					} else {
						d = 2;
					}
				} else {
					if (E4 == true) {
						d = 2;
					} else {
						d = 1;
					}
				}
			} else {
				if (E3 == true) {
					if (E4 == true) {
						d = 2;
					} else {
						d = 1;
					}
				} else {
					if (E4 == true) {
						d = 1;
					} else {
						d = 0;
					}
				}
			}
		}
		System.out.println(" Es sind " + d + " Aussagen richtig.");

	}

}
