package Problem5;

public class Term {
	private int coefficient;
	private int power;
	
	public Term(int coefficient, int power) {
		this.coefficient = coefficient;
		this.power = power;
	}
	
	// The method below receive double x and return c*x^power.
	public double createPoly(double X) {
		
		double a = this.coefficient*(double) Math.pow(X, this.power); 
		
		return a;
	}


	public int getCoefficient() {
		return coefficient;
	}


	public int getPower() {
		return power;
	}
	public void printTerm() {
			System.out.println(this.coefficient + "X^" + this.power);
		
			
	}

}
