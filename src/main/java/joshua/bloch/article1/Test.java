package joshua.bloch.article1;

public class Test {

	public static Test createTestObject() {

		return new Test();
	}

	public static Test getTestObject() {
		return new ChildTest();
	}

}
