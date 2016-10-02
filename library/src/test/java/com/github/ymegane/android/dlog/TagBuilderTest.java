package com.github.ymegane.android.dlog;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class TagBuilderTest {

    TagBuilder mTagBuilder;

    @Before
    public void setUp() {
        mTagBuilder = new TagBuilder();
    }

    @Test
    public void setParameters() {
        mTagBuilder.addPackage(true);
        assertThat(mTagBuilder._package, is(true));
    }
}
