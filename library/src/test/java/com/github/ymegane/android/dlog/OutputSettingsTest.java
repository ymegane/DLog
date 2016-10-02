package com.github.ymegane.android.dlog;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class OutputSettingsTest {
    OutputSettings mSettings;

    @Before
    public void setUp() {
        mSettings = new OutputSettings(RuntimeEnvironment.application);
    }

    @Test
    public void setParameters() {
        mSettings.debuggable();
        assertThat(mSettings.mMeans, is(OutputSettings.Means.DEBUGGABLE));
        mSettings.force();
        assertThat(mSettings.mMeans, is(OutputSettings.Means.FORCE));
    }
}
