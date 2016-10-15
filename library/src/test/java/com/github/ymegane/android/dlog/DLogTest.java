package com.github.ymegane.android.dlog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import static org.junit.Assert.fail;

@RunWith(RobolectricTestRunner.class)
public class DLogTest {

    @Test
    public void initializeTest() {

        try {
            DLog.printMethod();
            fail();
        } catch (IllegalStateException e) {
        }

        DLog.init(RuntimeEnvironment.application);
    }
}
