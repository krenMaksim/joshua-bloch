package joshua.bloch.article39;

import java.util.Date;

public class MainGoodClass {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
		Date start = new Date();
		Date end = new Date();

		GoodClassPeriod period = new GoodClassPeriod(start, end);

		// attak !!! IT DOES NOT WORK
		start.setYear(88);

		// AND attak !!! IT DOES NOT WORK
		period.getEnd().setYear(99);
	}
}
