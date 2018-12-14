import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
       int sp = 0;
		int s = 0;
		//ctr + space is  eclipse short cut for System.out.println();
		System.out.println("The total number of socks in the pile is: " + ar.length);
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
				s = 0;
			}
			if( (i+1  == ar.length -1 ) && (ar[i] == ar[i+1])) {
				s += 1 ;
				sp += s/2;
				break;
			}
			
		}
		System.out.println("The number of socks pairs is: " +sp);
		return sp;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
