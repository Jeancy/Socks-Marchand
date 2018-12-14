package org.diamond;

import java.util.Arrays;

public class SocksMerchant {
	
	public static int socksPairCount(int n, int[] ar) {
		int sp = 0; // initial number of socks pairs
		int s = 0; // variable to sum the occurence of every color on the pile
		//ctr + space is  eclipse short cut for System.out.println();
		System.out.println("The total number of socks in the pile is: " + ar.length);
		// sorting the array before everything
		Arrays.sort(ar);
		System.out.println("The sorted array is :");
		for (int i : ar) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < ar.length - 1 ; i++) {
			s += 1;
			if (ar[i] != ar[i+1]) {
				sp += s/2;
				s = 0; // getting back the counter to zero
			}
			if( (i+1  == ar.length -1 ) && (ar[i] == ar[i+1])) {
				s += 1 ;
				sp += s/2;
				break; // terminating the loop after the last elment evaluation
			}
			
		}
		System.out.println("The number of socks pairs is: " +sp);
		return sp;
	}

	public static void main(String[] args) {
		int [] intAr = {10, 20, 20, 10, 10, 20, 30, 50, 10}; 
		int num = intAr.length;
		SocksMerchant.socksPairCount(num, intAr);
		

	}

}
