package joshua.bloch.article11;

public class Main {

	public static void main(String[] args) {
		SimleBean clonedObject = new SimleBean("tom", "12345");

		System.out.println("clonedObject: " + clonedObject);

		SimleBean cloneOne = new SimleBean(clonedObject);

		System.out.println("cloneOne: " + cloneOne);

		SimleBean cloneTwo = SimleBean.newInstance(clonedObject);

		System.out.println("cloneTwo: " + cloneTwo);
	}
}
