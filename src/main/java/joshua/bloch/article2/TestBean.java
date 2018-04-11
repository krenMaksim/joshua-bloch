package joshua.bloch.article2;

public class TestBean {
    private final String userInfo;
    private final String userLibs;
    private final Integer userKey;
    private final Integer subscription;

    private TestBean(Builder builder) {
	this.userInfo = builder.userInfo;
	this.userLibs = builder.userLibs;
	this.userKey = builder.userKey;
	this.subscription = builder.subscription;
    }

    public String getUserInfo() {
	return userInfo;
    }

    public String getUserLibs() {
	return userLibs;
    }

    public Integer getUserKey() {
	return userKey;
    }

    public Integer getSubscription() {
	return subscription;
    }

    public static class Builder {
	private String userInfo;
	private String userLibs;
	private Integer userKey;
	private Integer subscription;

	public Builder() {
	}

	public Builder userInfo(String val) {
	    userInfo = val;
	    return this;
	}

	public Builder userLibs(String val) {
	    userLibs = val;
	    return this;
	}

	public Builder userKey(Integer val) {
	    userKey = val;
	    return this;
	}

	public Builder subscription(Integer val) {
	    subscription = val;
	    return this;
	}

	public TestBean build() {
	    return new TestBean(this);
	}
    }
}
