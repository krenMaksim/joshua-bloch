package joshua.bloch.article39;

import java.util.Date;

public final class BadClassPeriod {
	private final Date start;
	private final Date end;

	public BadClassPeriod(Date start, Date end) {
		if (start.compareTo(end) > 0) {
			throw new IllegalArgumentException(start + " after " + end);
		}

		this.start = start;
		this.end = end;
	}

	public Date getStart() {
		return start;
	}

	public Date getEnd() {
		return end;
	}

}
