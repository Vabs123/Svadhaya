import java.util.*;

public class CF371_D2_B{

	private static int gcd(int b, int a){
		while(a > 0){
			int r = b % a;
			b = a;
			a = r;
		}
		return b;
	}

	private static List<Integer> getDivisibleCount(int d, int v){
		int steps = 0;
		while(v % d == 0){
			steps++;
			v /= d;
		}
		return Arrays.asList(steps, v);
	}

	private static int getSteps(int v, int g){
		v /= g;
		int steps = 0, p = 0;
		List<Integer> state = getDivisibleCount(2, v);
		steps += state.get(0);
		state = getDivisibleCount(3, state.get(1));
		steps += state.get(0);
		state = getDivisibleCount(5, state.get(1));
		return state.get(1) > 1? -1 : steps + state.get(0);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int v1 = in.nextInt();
		int v2 = in.nextInt();
		int g = gcd(Math.max(v1, v2), Math.min(v1, v2));
		int steps1 = getSteps(v1, g);
		int steps2 = getSteps(v2, g);
		if(steps1 == -1 || steps2 == -1)
			System.out.println(-1);
		else
			System.out.println(steps1 + steps2);
	}
}
