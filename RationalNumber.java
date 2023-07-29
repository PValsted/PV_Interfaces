
public class RationalNumber implements Comparable<RationalNumber> {
	
	private int numerator;
	private int denominator;
  
	public RationalNumber(int numer, int denom) {
		
		if (denom == 0)
			denom = 1; 
		if (denom < 0) {
			numer *= -1;
			denom *= -1;
		} 
		this.numerator = numer;
		this.denominator = denom;
		reduce();
		
	}//end preferred constructor
  
	//begin getters
	public int getNumerator() {
		
		return this.numerator;
		
	}
  
	public int getDenominator() {
		
		return this.denominator;
		
	}
	//end getters
	
	public RationalNumber reciprocal() {
		
		return new RationalNumber(this.denominator, this.numerator);
		
	}//end reciprocal
  
	public RationalNumber add(RationalNumber op2) {
		
		int commonDenominator = this.denominator * op2.getDenominator();
		int numerator1 = this.numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * this.denominator;
		int sum = numerator1 + numerator2;
		return new RationalNumber(sum, commonDenominator);
		
	}//end add
  
	public RationalNumber subtract(RationalNumber op2) {
		
		int commonDenominator = this.denominator * op2.getDenominator();
		int numerator1 = this.numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * this.denominator;
		int difference = numerator1 - numerator2;
		return new RationalNumber(difference, commonDenominator);
		
	}//end subtract
  
	public RationalNumber multiply(RationalNumber op2) {
		
		int numer = this.numerator * op2.getNumerator();
		int denom = this.denominator * op2.getDenominator();
		return new RationalNumber(numer, denom);
		
	}//end multiply
  
	public RationalNumber divide(RationalNumber op2) {
		
		return multiply(op2.reciprocal());
		
	}//end divide
  
	public boolean isLike(RationalNumber op2) {
		
		return (this.numerator == op2.getNumerator() && 
				this.denominator == op2.getDenominator());
		
	}//end isLike
  
	public String toString() {
		
		String result;
		if (this.numerator == 0) {
			result = "0";
		} else if (this.denominator == 1) {
			result = (new StringBuilder(String.valueOf(this.numerator))).toString();
		} else {
			result = String.valueOf(this.numerator) + "/" + this.denominator;
		} 
		return result;
		
	}//end toString
  
	private void reduce() {
		
		if (this.numerator != 0) {
			int common = gcd(Math.abs(this.numerator), this.denominator);
			this.numerator /= common;
			this.denominator /= common;
		} 
		
	}//end reduce
  
	private int gcd(int num1, int num2) {
		
		while (num1 != num2) {
			if (num1 > num2) {
				num1 -= num2;
				continue;
			} 
			num2 -= num1;
		} 
		return num1;
		
	}//end gcd

	@Override
	public int compareTo(RationalNumber o) {
		double tolerance=0.0001;
		float ratNum1, ratNum2;
		ratNum1=(this.getNumerator()/this.getDenominator());
		ratNum2=(o.getNumerator()/o.getDenominator());
		
		if (Math.abs(ratNum1-ratNum2)>tolerance) {
			if (ratNum1>ratNum2) {
				return 1; //original object is larger
			}
			else return -1; //inputed object is larger
		} else return 0; //objects are equal (within tolerance level)
	}//end compareTo
	
}//end class