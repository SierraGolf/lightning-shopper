package io.github.sierragolf.lightningshopper;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SomeManagerTest {

    @Test
    public void returnsParameter() {
        assertThat(new SomeManager().returnParameter(false), is(false));
    }
}
