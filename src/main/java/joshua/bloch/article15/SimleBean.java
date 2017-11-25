package joshua.bloch.article15;

// my vatiant how create constant object of class
public class SimleBean {

	public static SimleBean newInstanceConstantObject(String name, String password) {
		return null;
	}

	private String name;
	private String password;

	// private final String constName;
	// private final String constPassword;

	// private SimleBean(String constName, String constPassword) {
	// this.constName = constName;
	// this.constPassword = constPassword;
	// }
	//
	// public SimleBean(String name, String password) {
	// this.name = name;
	// this.password = password;
	//
	// this.constName = null;
	// this.constPassword = null;
	// }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
