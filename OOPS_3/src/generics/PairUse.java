package generics;

public class PairUse {

	public static void main(String[] args) {
		
		Pair<Integer, Integer> p= new Pair<>(1,2);
		
		p.setFirst(10);
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
		
		Pair<Integer, Integer> a= new Pair<Integer, Integer>(1, 2);
		int b= 10;
		
		Pair<Pair<Integer, Integer>, Integer> triplet= new Pair<Pair<Integer,Integer>, Integer>(a, 3);
		
		System.out.println(triplet.first.first);
		System.out.println(triplet.first.second);
		System.out.println(triplet.second);
	}

}
