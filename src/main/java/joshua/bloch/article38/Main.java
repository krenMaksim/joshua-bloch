package joshua.bloch.article38;

public class Main {

	public static void main(String[] args) {
		// put into VM arguments -ea
		// java -ea AssertionExample 15 (for example)

		MethodExample example = new MethodExample();
		example.getPrivateMethod(5);

	}

}
