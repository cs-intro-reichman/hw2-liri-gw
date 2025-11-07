// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]), num, count = 0;
		char mode = args[1].charAt(0);
		// check if v and return by the conjecture
		if(mode == 'v') {
			// loop for n rows
			for(int i = 0; i < n; i++) { 
				num = i + 1;
				System.out.print(num + " ");
				count++;
				if (num == 1) {
					num = (num * 3) + 1;
					System.out.print(num + " ");
					count++;
				}
				// loop to calculate numbers in every row
				while (num != 1) {
					if(num % 2 == 0) {
						num /= 2;
						System.out.print(num + " ");
					}
					else {
						num = (num * 3) + 1;
						System.out.print(num + " ");
					}
					count++;
				}
				System.out.println("(" + count + ")");
				count = 0;

			}
		}
		// eventually, also if 'c', prints this line
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");

	}
}
