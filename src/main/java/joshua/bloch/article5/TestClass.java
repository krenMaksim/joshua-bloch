package joshua.bloch.article5;

public class TestClass {

	public static void main(String[] args) {
		Long timeStart = null;

		timeStart = getTime();
		badRealization();
		showDeltaTime(timeStart);

		timeStart = getTime();
		goodRealization();
		showDeltaTime(timeStart);

		timeStart = getTime();
		varyBadRealization();
		showDeltaTime(timeStart);
	}

	public static void badRealization() {
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

	public static void goodRealization() {
		long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

	public static void varyBadRealization() {
		Long sum = 0L;
		for (Long i = 0L; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

	public static void showDeltaTime(Long timeStart) {
		System.out.println(getTime() - timeStart);
	}

	public static long getTime() {
		return System.currentTimeMillis();
	}
}
