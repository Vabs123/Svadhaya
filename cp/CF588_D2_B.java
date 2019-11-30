import java.util.*;

public class CF588_D2_B{

	private static long getLoveNumber(long n){
		long ans = 1l;
		for(int i = 2; i <= (int)Math.sqrt(n); i++){
			if(n%i == 0)
				ans *= i;
			while(n%i == 0){
				n /= i;
			}
		}
		return ans * n;
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		long n = in.nextLong();
		System.out.println(getLoveNumber(n));
	}
}