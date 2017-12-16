package joshua.bloch.article39;

import java.util.Date;

public class MainBadClass {

	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {
		Date start = new Date();
		Date end = new Date();

		BadClassPeriod period = new BadClassPeriod(start, end);

		// attak !!!
		start.setYear(88);

	}

}
