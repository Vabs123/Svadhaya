import java.util.*;

public class CF651_D2_C{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt();
		Map<Long, Long> mapX = new HashMap<>();
		Map<Long, Long> mapY = new HashMap<>();
		Map<List<Long>, Long> mapPair = new HashMap<>();
		long pairs = 0l;
		while(n-- > 0){
			long v1 = in.nextLong();
			long v2 = in.nextLong();
			long vx = mapX.getOrDefault(v1,0l);
			long vy = mapY.getOrDefault(v2,0l);
			List<Long> key = Arrays.asList(v1,v2);
			long vp = mapPair.getOrDefault(key, 0l);
			pairs += vx + vy - vp;
			mapX.put(v1, vx + 1);
			mapY.put(v2, vy + 1);
			mapPair.put(key, vp + 1);
		}
		System.out.println(pairs);
	}
}