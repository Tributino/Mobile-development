package Problem5;

import java.util.ArrayList;

public class ApplicationDriver {

	public static void main(String[] args) {
		
		Term A = new Term(3, 10);
		Term B = new Term(5, 6);
		Term C = new Term(-4, 3);
		Term D = new Term(5, 0);
		
		ArrayList<Term> poly = new ArrayList<Term>();
		poly.add(0,A);
		poly.add(1,B);
		poly.add(2,C);
		poly.add(3,D);
		
		// poly is a ArrayList<Term> and p is an element of the class Polynomial;
		Polynomial p = new Polynomial(poly);
		// polyDerivative is a ArrayList<Term> that contains the coefficients and powers of the derivative of p.
		ArrayList<Term> polyDerivative = p.createDerivative();
		// the Derivative of p is a Polynomial;
		Polynomial pDerivative = new Polynomial(polyDerivative);
		
		double X = -1;
		// value of f(X);
	    double result1 = p.myPoly(X);
	    // value of f'(X);
	    double result2 = pDerivative.myPoly(X);
	    // Print the polynomial p with argument X,
	    p.printPolynomial(X);
	    // print the value of f(X);
		System.out.println(result1);
		// Print the polynomial pDerivative with argument X,
		pDerivative.printPolynomial(X);
		// print the value of f'(X);
		System.out.println(result2);
	


	}

}
