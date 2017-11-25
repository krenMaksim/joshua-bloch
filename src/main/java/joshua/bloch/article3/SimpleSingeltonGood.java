package joshua.bloch.article3;

public class SimpleSingeltonGood {

	private static final SimpleSingeltonGood SIMPLE_SINGELTON = new SimpleSingeltonGood();

	// we can change reliazation this method without changing client's API
	public static SimpleSingeltonGood newInstance() {
		return SIMPLE_SINGELTON;
	}

	private SimpleSingeltonGood() {
		if (SIMPLE_SINGELTON != null) {
			throw new AssertionError();
		}
	}

}
