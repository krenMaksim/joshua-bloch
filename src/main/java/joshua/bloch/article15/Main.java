package joshua.bloch.article15;

public class Main {

	public static void main(String[] args) {

		SimleBean constBean = SimleBean.newInstanceConstantObject("bob", "1234");
		System.out.println(constBean);
		constBean = SimleBean.newInstanceConstantObject("bob", "1234");

		System.out.println(constBean);

		constBean = SimleBean.newInstanceConstantObject("mike", "1234");

		System.out.println(constBean);

		constBean.setName("tim");
	}

}
