package com.github.ymegane.android.dlog;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

@RunWith(RobolectricTestRunner.class)
public class LogPrinterTest {

    static {
        System.setProperty("robolectric.logging", "stdout");
    }

    private LogPrinter mLogPrinter;

    @Before
    public void setUp() {
        mLogPrinter = new LogPrinter(
                new OutputSettings(RuntimeEnvironment.application).force(),
                new TagBuilder().addPackage(true),
                new MessageBuilder().lineNumber(true).method(true)
        );
    }

    @Test
    public void v() {
        mLogPrinter.v("v-test");
        mLogPrinter.v("v-test", new Throwable());
    }

    @Test
    public void d() {
        mLogPrinter.d("d-test");
        mLogPrinter.d("d-test", new Throwable());
    }

    @Test
    public void i() {
        mLogPrinter.i("i-test");
        mLogPrinter.i("i-test", new Throwable());
    }

    @Test
    public void w() {
        mLogPrinter.w("w-test");
        mLogPrinter.w("w-test", new Throwable());
        mLogPrinter.w(new Throwable());
    }

    @Test
    public void e() {
        mLogPrinter.e("e-test");
        mLogPrinter.e("e-test", new Throwable());
    }

    @Test
    public void printMethod() {
        mLogPrinter.printMethod();
    }
}
