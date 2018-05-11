package joshua.bloch.article15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThingArray {
    // bad
    // public static final ThingArray[] PRIVATE_VALUES = { new ThingArray(), new ThingArray() };

    // good
    private static final ThingArray[] PRIVATE_VALUES = { new ThingArray(), new ThingArray() };
    public static final List<ThingArray> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    // good
    public static final ThingArray[] values() {
	return PRIVATE_VALUES.clone();
    }
}
