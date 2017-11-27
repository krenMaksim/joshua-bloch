package joshua.bloch.article15;

import java.util.HashMap;
import java.util.Map;

// my version how create constant object of class
public class SimleBean {

	private static Map<String, SimleBean> constantObjects = new HashMap<>();

	private static String hashCode(String name, String password) {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return String.valueOf(result);
	}

	public static SimleBean newInstanceConstantObject(String name, String password) {
		String hash = hashCode(name, password);

		if (constantObjects.containsKey(hash)) {
			return constantObjects.get(hash);
		} else {
			SimleBean bean = new SimleBean();
			bean.isObjectConstant = true;
			bean.name = name;
			bean.password = password;

			constantObjects.put(hash, bean);

			return bean;
		}
	}

	private String name;
	private String password;

	private boolean isObjectConstant = false;

	public SimleBean() {
	}

	public SimleBean(String name, String password) {
		this.name = name;
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isObjectConstant ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimleBean other = (SimleBean) obj;
		if (isObjectConstant != other.isObjectConstant)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (isObjectConstant) {
			throw new UnsupportedOperationException(this + " bean is constant!");
		}
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (isObjectConstant) {
			throw new UnsupportedOperationException(this + " bean is constant!");
		}
		this.password = password;
	}

	@Override
	public String toString() {
		return "SimleBean [name=" + name + ", password=" + password + ", isObjectConstant=" + isObjectConstant + "]";
	}
}
