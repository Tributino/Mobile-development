package Problem5;

import java.util.ArrayList;

public class Polynomial {
	
	private ArrayList<Term> polynomial;

	public Polynomial(ArrayList<Term> polynomial) {
		this.polynomial = polynomial;
	}
	
	// This method receive double x and return f(x), where f is a polynomial.
	public double myPoly(double X) {
		double sum = 0;		
		for(Term t : polynomial) {
			sum = sum + t.createPoly(X);
		}
		return sum;
	}
	// Function the will be used as basic for the next fucntion.
	public Term basicFunction(Term A) {
		Term C = new Term(0,10);
		if(A.getPower()==0) return C;
		int coefficientDeri = A.getCoefficient()*A.getPower();
		int powerDeri = A.getPower()-1;
		Term B = new Term(coefficientDeri, powerDeri);
		return B;
		  
	}
	
	public ArrayList<Term> createDerivative(){
		ArrayList<Term> polyDeri = new ArrayList<Term>();
		for(Term t: polynomial) {
			Term currTerm = basicFunction(t);
			polyDeri.add(currTerm);
		}
		return polyDeri;
	}
	
	public void printPolynomial(double X) {
		int coefficient = this.polynomial.get(0).getCoefficient();
		int power = this.polynomial.get(0).getPower();
		System.out.print(coefficient + "." + "(" + X + ")" + "^" + power);
		for(Term t : polynomial) {
			int c = t.getCoefficient();
			int p = t.getPower();
			if(c<0 && p!=0)
				System.out.print(c + "." + "(" + X + ")" + "^" + p );
			else if(c<0 && p==0)
				System.out.print(c);
			else if(c==0)
				System.out.print(" ");
			else if(c>0 && p==0)
				System.out.print("+" + c);
			else
				System.out.print("+" + c + "." + "(" + X + ")" + "^" + p );
		
			
		}
		System.out.print("=");
	}
	

}
