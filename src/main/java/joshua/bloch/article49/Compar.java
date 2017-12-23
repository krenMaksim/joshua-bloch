package joshua.bloch.article49;

import java.util.Comparator;

public class Compar {

	public static void main(String[] args) {
		Comparator<Integer> badRealization = new Comparator<Integer>() {

			@Override
			public int compare(Integer first, Integer second) {
				return first < second ? -1 : (first == second ? 0 : 1);
			}
		};

		System.out.println(badRealization.compare(new Integer(42), new Integer(42)));

		Comparator<Integer> goodRealization = new Comparator<Integer>() {

			@Override
			public int compare(Integer first, Integer second) {
				int f = first;
				int s = second;

				return f < s ? -1 : (f == s ? 0 : 1);
			}
		};

		System.out.println(goodRealization.compare(new Integer(42), new Integer(42)));
	}

}
