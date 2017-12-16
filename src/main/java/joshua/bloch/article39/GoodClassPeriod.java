package joshua.bloch.article39;

import java.util.Date;

public final class GoodClassPeriod {
	private final Date start;
	private final Date end;

	// take attention on order! first - fields, second - validation data
	public GoodClassPeriod(Date start, Date end) {
		this.start = new Date(start.getTime());
		this.end = new Date(end.getTime());

		if (start.compareTo(end) > 0) {
			throw new IllegalArgumentException(start + " after " + end);
		}
	}

	public Date getStart() {
		return new Date(start.getTime());
	}

	public Date getEnd() {
		return new Date(end.getTime());
	}

}
