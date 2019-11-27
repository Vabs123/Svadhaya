import java.util.*;

public class CF304_D2_C{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if((n & 1) == 0)
			System.out.println(-1);
		else{
			StringBuilder sb = new StringBuilder();
			for (int i = n - 1; i >= 0; i--)
				sb.append(i + " ");
			System.out.println(sb.toString());
			sb = new StringBuilder();
			for (int i = 1; i < n; i += 2)
				sb.append(i + " ");
			for (int i = 0; i < n; i += 2)
				sb.append(i + " ");
			System.out.println(sb.toString());
			sb = new StringBuilder();
			for (int i = 0; i < n; i ++)
				sb.append(i + " ");
			System.out.println(sb.toString());
		}
	}
}