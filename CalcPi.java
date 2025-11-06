// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		// defines the PI by java
		System.out.println("pi according to Java: " + Math.PI);
		// defines the PI by Gregory and Leibnitz
		int num = Integer.parseInt(args[0]);
		double apPi = 1.0;
		int dividing = 3;
		boolean isMinus = true;
		// calculate by the number that inserted
		for(int i = 0; i < num-1; i++) {
			if(isMinus == true) {
				apPi -= (1.0 / dividing);
			}
			else {
				apPi += (1.0 / dividing);
			}
			isMinus = !isMinus;
			dividing += 2;
		}
		System.out.println("pi, approximated:     " + 4*apPi);
	}
}
