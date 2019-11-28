import java.util.*;

public class CF546_D2_C{

	private static void getRoundsAndWinner(LinkedList<Integer> p1, LinkedList<Integer> p2){
		int rounds = 0;
		List<List<Integer>> state = new ArrayList<>();
		Set<List<List<Integer>>> vis = new HashSet<>();		
		while(p1.size() > 0 && p2.size() > 0){
			rounds++;
			state.add(new ArrayList<Integer>(p1));
			state.add(new ArrayList<Integer>(p2));
			if(vis.contains(state))
				break;
			vis.add(state);
			state = new ArrayList<>();
			int v1 = p1.poll();
			int v2 = p2.poll();
			if(v1 > v2){
				p1.add(v2);
				p1.add(v1);
			}
			else{
				p2.add(v1);
				p2.add(v2);
			}
		}
		if(p1.size() < 1)
			System.out.println(rounds + " " + 2);
		else if(p2.size() < 1)
			System.out.println(rounds + " " + 1);
		else 
			System.out.println(-1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		LinkedList<Integer> p1 = new LinkedList<>();
		while(k-- > 0)
			p1.add(in.nextInt());
		k = in.nextInt();
		LinkedList<Integer> p2 = new LinkedList<>();
		while(k-- > 0)
			p2.add(in.nextInt());
		getRoundsAndWinner(p1, p2);
	}
}