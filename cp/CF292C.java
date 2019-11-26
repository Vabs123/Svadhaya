import java.util.*;

public class CF292C{
	static Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>(){
		{
			put('2', Arrays.asList(2));
			put('3', Arrays.asList(3));
			put('4', Arrays.asList(3,2,2));
			put('5', Arrays.asList(5));
			put('6', Arrays.asList(5,3));
			put('7', Arrays.asList(7));
			put('8', Arrays.asList(7,2,2,2));
			put('9', Arrays.asList(7,3,3,2));
		}
	};

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String a = in.next();
		List<Integer> ans = new ArrayList<>();
		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) > '1')
				ans.addAll(map.get(a.charAt(i)));

		}
		Collections.sort(ans, Collections.reverseOrder());
		String as = "";
		for(Integer i : ans){
			as += i;
		}
		System.out.println(as);
	}
}