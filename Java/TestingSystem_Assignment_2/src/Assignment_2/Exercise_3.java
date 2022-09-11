package Assignment_2;

public class Exercise_3 {

	public static void main(String[] args) {
//		question1a();
//		question1b();
//		question1c();
		question1d();
	}

	public static void question1a() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void question1b() {
		for (int i = 8; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void question1c() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < 8; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void question1d() {
		for (int i = 8; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= 8; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
