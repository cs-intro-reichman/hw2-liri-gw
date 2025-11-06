// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int n = Integer.parseInt(args[0]), n2 = n;
		char mode = args[1].charAt(0);
		if(mode == 'v') {
			// 
			for(int i = 0; i < n; i++) { 
				System.out.print(n2 + " ");
				if (n2 == 1) {
					n2 = (n2 * 3) + 1;
					System.out.print(n2 + " ");
				}
				while (n2 != 1) {
					if(n2 % 2 == 0) {
						n2 /= 2;
						System.out.print(n2 + " ");
					}
					else {
						n2 = (n2 * 3) + 1;
						System.out.print(n2 + " ");
					}
				}
				System.out.println(" ");
				n2 = n2 - i + 1;
			}
		}
		System.out.println("\n Every one of the first " + n + " hailstone sequences reached 1.");

	}
}
