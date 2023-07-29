public class RationalTester {
	
	public static void main(String[] args) {
		RationalNumber r1 = new RationalNumber(6, 8);
		RationalNumber r2 = new RationalNumber(1, 3);
		
		System.out.println("First rational number: " + r1);
		System.out.println("Second rational number: " + r2);
		
		if (r1.isLike(r2)) {
			System.out.println("r1 and r2 are equal.");
		} else {
			System.out.println("r1 and r2 are NOT equal.");
		} 
		
		RationalNumber r3 = r1.reciprocal();
		System.out.println("The reciprocal of r1 is: " + r3);
		
		RationalNumber r4 = r1.add(r2);
		RationalNumber r5 = r1.subtract(r2);
		RationalNumber r6 = r1.multiply(r2);
		RationalNumber r7 = r1.divide(r2);
		
		System.out.println("r1 + r2: " + r4);
		System.out.println("r1 - r2: " + r5);
		System.out.println("r1 * r2: " + r6);
		System.out.println("r1 / r2: " + r7);
		
	}//end main
	
}//end class
