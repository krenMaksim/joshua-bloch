package joshua.bloch.article3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		System.out.println(SimpleSingeltonGood.newInstance().hashCode());
		System.out.println(SimpleSingeltonGood.newInstance().hashCode());
		System.out.println(SimpleSingeltonGood.newInstance().hashCode());
		System.out.println(SimpleSingeltonGood.newInstance().hashCode());
		System.out.println(TheBestSingelton.INSTANCE.hashCode());
		System.out.println(TheBestSingelton.INSTANCE.hashCode());
		System.out.println(TheBestSingelton.INSTANCE.toString());

	}

	public static void crackSingeltonWithReflection() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> cl = SimpleSingeltonGood.class;

		Constructor<?> constructor;
		constructor = cl.getDeclaredConstructor();
		constructor.setAccessible(true);
		SimpleSingeltonGood singeltonGood;

		for (int i = 0; i < 5; i++) {
			singeltonGood = (SimpleSingeltonGood) constructor.newInstance();
			System.out.println(singeltonGood);
		}
	}

}
