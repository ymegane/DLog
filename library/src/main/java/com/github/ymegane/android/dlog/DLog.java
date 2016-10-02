package com.github.ymegane.android.dlog;

import android.content.Context;

public class DLog {

    private DLog() {}

    private static LogPrinter sLogPrinter;

    public static void init(Context context) {
        sLogPrinter = new LogPrinter(new OutputSettings(context), new TagBuilder(), new MessageBuilder());
    }

    public static void init(Context context, TagBuilder tagBuilder) {
        sLogPrinter = new LogPrinter(new OutputSettings(context), tagBuilder, new MessageBuilder());
    }

    public static void init(OutputSettings outputSettings, TagBuilder tagBuilder) {
        sLogPrinter = new LogPrinter(outputSettings, tagBuilder, new MessageBuilder());
    }

    public static void init(OutputSettings outputSettings, TagBuilder tagBuilder, MessageBuilder messageBuilder) {
        sLogPrinter = new LogPrinter(outputSettings, tagBuilder, messageBuilder);
    }

    public static int d(String msg, Throwable tr) {
        return sLogPrinter.d(msg, tr);
    }

    public static int d(String msg) {
        return sLogPrinter.d(msg);
    }

    public static int e(String msg) {
        return sLogPrinter.e(msg);
    }

    public static int e(String msg, Throwable tr) {
        return sLogPrinter.e(msg, tr);
    }

    public static int i(String msg, Throwable tr) {
        return sLogPrinter.i(msg, tr);
    }

    public static int i(String msg) {
        return sLogPrinter.i(msg);
    }

    public static int v(String msg) {
        return sLogPrinter.v(msg);
    }

    public static int v(String msg, Throwable tr) {
        return sLogPrinter.v(msg, tr);
    }

    public static int w(Throwable tr) {
        return sLogPrinter.w(tr);
    }

    public static int w(String msg, Throwable tr) {
        return sLogPrinter.w(msg, tr);
    }

    public static int w(String msg) {
        return sLogPrinter.w(msg);
    }

    public static int printMethod() {
        return sLogPrinter.printMethod();
    }
}
