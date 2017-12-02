package joshua.bloch.article22;

public class LocalClass {

	public void simpleMethod() {
		class Local {

		}

		Local local = new Local();

		System.out.println(local);

	}

}
