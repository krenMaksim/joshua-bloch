package joshua.bloch.article43;

import java.util.List;

public class BadArrayMethod {

	private List<String> list;

	// because client will be to check result on null
	public String[] getList() {
		if (list.isEmpty()) {
			return null;
		}

		return (String[]) list.toArray();
	}

}
