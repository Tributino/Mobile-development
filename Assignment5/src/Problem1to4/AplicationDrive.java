
package Problem1to4;


import java.util.ArrayList;
import java.util.Arrays;

public class AplicationDrive {
	
	public static boolean isPrime(int n) {
		if(n==0 || n==1) return false;
	    for(int i=2;i<n/2;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static int[] checkGoldbach(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int[] result = new int[2];
		
		if(n<=4 || (n-1)%2==0) return null;
		
		// creating the prime list
		for(int i=2; i<n-2; i++) {
			if(isPrime(i)) {
				primes.add(i);
			}
		}
		// verify if n-p is prime than we will have p + n-p=n, where p and n-p are primes.
		for(Integer i : primes) {
				if(isPrime(n-i));
				result[0] = i;
				result[1] = n-i;
			}
		
		
		return result;
		
	}
	
	public static int factorial(int x) {
		if(x==0) {
			return 1;
		}
		else {
			return x*factorial(x-1);
		}
	}
	
	public static int fibonacci(int n) {
		if(n==0 || n==1)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
			
	}

	

	public static void main(String[] args) {
        
		int[] result = checkGoldbach(30);
		System.out.println(Arrays.toString(result));
		System.out.println(factorial(5));
		System.out.println(fibonacci(6));

	}
	
	
	
	
}