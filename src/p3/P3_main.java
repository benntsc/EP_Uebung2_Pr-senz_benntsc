package p3;

public class P3_main {

	public static void main(String[] args) {
		int x = -6;

		if (x <= 0) {
			x = x * (-1);
		}
		System.out.println(x);

		int y = 4;

		System.out.println("Das Quadrat der vorgegebenen Zahl ist " + y * y + " .");

		int z = 11;

		if (z % 2 == 0) {
			System.out.println("Z = " + z + " ist gerade");
		} else {
			System.out.println("Z = " + z + " ist ungerade");
		}
	}

}
