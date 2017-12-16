package joshua.bloch.article46;

public class ForEach {
	public static void main(String[] args) {
		// best design for forEach
		for (Gorizontal gorizontal : Gorizontal.values()) {
			for (Vertical vertical : Vertical.values()) {
				System.out.println(gorizontal + "\t" + vertical);
			}
		}

	}
}

enum Gorizontal {
	ONE_GORIZONTAL, TWO_GORIZONTAL, THREE_GORIZONTAL
}

enum Vertical {
	ONE_VERTICAL, TWO_VERTICAL, THREE_VERTICAL
}
