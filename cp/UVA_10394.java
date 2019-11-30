import java.util.*;

public class UVA_10394{
	private static int INF = 20000000;
	private static Map<Integer, String> map = new HashMap<>();

	private static void findAllTwinpair(){
		Set<Integer> vis = new HashSet<>();
		List<Integer> primes = new ArrayList<>();
		int l = (int)Math.sqrt(INF);
		for(int i = 2; i <= l; i++){
			if(vis.contains(i))
				continue;
			primes.add(i);
			int k = 2;
			while(k * i <= INF){
				vis.add(k * i);
				k++;
			}
		}
		int th = 1;
		for(Integer i : primes){
			if(!vis.contains(i + 2))
				map.put(th++, format(i, i + 2));
		}
	}

	private static String format(int n1, int n2){
		return "(" + n1 +", "+n2+")";
	}

	public static void main(String[] args) {
		findAllTwinpair();
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt();
		while(n-- > 0){
			System.out.println(map.get(in.nextInt()));
		}
	}
}