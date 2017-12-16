package joshua.bloch.article38;

class MethodExample {

	// for public method
	public void methodThrewExeption(int value) {
		if (value < 0) {
			throw new IllegalArgumentException("value < 0, value = " + value);
		}
	}

	// for private methods
	private void methodWithAsserts(int value) {
		assert value > 0;

		System.out.println(value);
	}

	public void getPrivateMethod(int value) {
		methodWithAsserts(value);
	}
}
