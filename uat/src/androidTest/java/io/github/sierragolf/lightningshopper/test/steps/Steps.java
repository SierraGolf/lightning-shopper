package io.github.sierragolf.lightningshopper.test.steps;

import cucumber.api.java.en.Then;
import io.github.sierragolf.lightningshopper.R;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

public class Steps {

    @Then("^I expect to see the text (.*)$")
    public static void I_expect_to_see_the_text(final String text) {
        onView(withText(text)).check(matches(isDisplayed()));
    }

    @Then("^I click the button$")
    public static void I_click_the_button() {
        onView(withId(R.id.button)).perform(click());
    }

    @Then("^I wait for (\\d+) seconds$")
    public static void I_wait_for_seconds(final long seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }
}