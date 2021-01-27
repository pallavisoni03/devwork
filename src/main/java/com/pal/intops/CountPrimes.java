package com.pal.intops;

public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=10;
		System.out.println(new CountPrimes().countPrimes(n));	
	}
	
	public int countPrimes(int n) {
		int outputInt = 0;
		
		for(int i=1; i<n; i++) {
			for(int j=2; i<(n/2); i++) {
				if(i%j==0) {
					System.out.println(i);
					outputInt++;
				}
			}
		}
		
        return outputInt;
        
    }

}
