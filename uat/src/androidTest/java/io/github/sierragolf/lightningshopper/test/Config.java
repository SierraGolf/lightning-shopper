package io.github.sierragolf.lightningshopper.test;

import android.test.ActivityInstrumentationTestCase2;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import io.github.sierragolf.lightningshopper.ListItemsActivity;


@CucumberOptions(features = "features", tags = {"~@ignore"})
public class Config extends ActivityInstrumentationTestCase2<ListItemsActivity> {


    public Config() {
        super(ListItemsActivity.class);
    }

    @Before
    public void before() throws Exception {
        getActivity();
    }

}