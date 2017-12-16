package joshua.bloch.article43;

import java.util.Collections;
import java.util.List;

public class GoodArrayMethod {
	private static final String[] EMPTY_ARRAY = new String[0];

	private List<String> list;

	public String[] getList() {
		if (list.isEmpty()) {
			return EMPTY_ARRAY;
		}

		return (String[]) list.toArray();
	}

	// good aproach return copy of list
	public List<String> getCopyList() {
		if (list.isEmpty()) {
			return Collections.emptyList();
		} else {
			return list;
		}
	}
}
