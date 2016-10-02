package com.github.ymegane.android.dlog;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class MessageBuilderTest {

    MessageBuilder mMessageBuilder;

    @Before
    public void setUp() {
        mMessageBuilder = new MessageBuilder();
    }

    @Test
    public void setParameters() {
        mMessageBuilder.lineNumber(false);
        assertThat(mMessageBuilder.lineNumber, is(false));
        mMessageBuilder.method(false);
        assertThat(mMessageBuilder.method, is(false));
    }
}
