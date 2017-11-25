package joshua.bloch.article8;

// demonstrates cashing og hashCode 
// If we will use objects this class for keys in map, for example.
public class SimleBean {
	private String name;
	private String password;

	private volatile int hashCode;

	// cashing hashCode as Joshua Bloh
	@Override
	public int hashCode() {
		int result = hashCode;

		if (result == 0) {
			result = 1;
			final int prime = 31;

			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((password == null) ? 0 : password.hashCode());

			hashCode = result;
		}

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		SimleBean other = (SimleBean) obj;

		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password)) {
			return false;
		}

		return true;
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
