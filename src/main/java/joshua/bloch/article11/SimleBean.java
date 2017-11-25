package joshua.bloch.article11;

public class SimleBean {

	// simple way to clone object with static method
	public static SimleBean newInstance(SimleBean clonedObject) {
		return new SimleBean(clonedObject.name, clonedObject.password);
	}

	private String name;
	private String password;

	public SimleBean(String name, String password) {
		this.name = name;
		this.password = password;
	}

	// simple way to clone object with constructor
	public SimleBean(SimleBean clonedObject) {
		this.name = clonedObject.name;
		this.password = clonedObject.password;
	}

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
