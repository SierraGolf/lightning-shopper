package io.github.sierragolf.lightningshopper.test;

import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import io.github.sierragolf.lightningshopper.SomeManager;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(AndroidJUnit4.class)
public class ExampleAndroidTestCase extends AndroidTestCase {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void junit4WithHamcrest() {
        assertThat(true, is(true));
    }

    @Test
    public void expectedException() {

        expectedException.expect(RuntimeException.class);

        throw new RuntimeException("foobar!");
    }
}
