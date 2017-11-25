package joshua.bloch.article2;

import joshua.bloch.article2.RedisCredentialsBean.Builder;

public class Start {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		RedisCredentialsBean reBean = new RedisCredentialsBean.Builder().userInfo("dfdfd").userKey(55).userLibs("fdfds").build();

		RedisCredentialsBean.Builder builder = new Builder();
		RedisCredentialsBean reBeanTwo = builder.userInfo("dfdfd").userKey(55).userLibs("fdfds").build();
	}

}
