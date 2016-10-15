package com.github.ymegane.android.dlog;

import android.content.Context;
import android.support.annotation.NonNull;

public class DLog {

    private DLog() {}

    private static LogPrinter sLogPrinter;

    public static void init(@NonNull Context context) {
        sLogPrinter = new LogPrinter(new OutputSettings(context), new TagBuilder(), new MessageBuilder());
    }

    public static void init(@NonNull Context context, @NonNull TagBuilder tagBuilder) {
        sLogPrinter = new LogPrinter(new OutputSettings(context), tagBuilder, new MessageBuilder());
    }

    public static void init(@NonNull OutputSettings outputSettings, @NonNull TagBuilder tagBuilder) {
        sLogPrinter = new LogPrinter(outputSettings, tagBuilder, new MessageBuilder());
    }

    public static void init(@NonNull OutputSettings outputSettings, @NonNull TagBuilder tagBuilder, @NonNull MessageBuilder messageBuilder) {
        sLogPrinter = new LogPrinter(outputSettings, tagBuilder, messageBuilder);
    }

    public static int d(@NonNull String msg, @NonNull Throwable tr) {
        checkInitialize();
        return sLogPrinter.d(msg, tr);
    }

    public static int d(@NonNull String msg) {
        checkInitialize();
        return sLogPrinter.d(msg);
    }

    public static int e(@NonNull String msg) {
        checkInitialize();
        return sLogPrinter.e(msg);
    }

    public static int e(@NonNull String msg, @NonNull Throwable tr) {
        checkInitialize();
        return sLogPrinter.e(msg, tr);
    }

    public static int i(@NonNull String msg, @NonNull Throwable tr) {
        checkInitialize();
        return sLogPrinter.i(msg, tr);
    }

    public static int i(@NonNull String msg) {
        checkInitialize();
        return sLogPrinter.i(msg);
    }

    public static int v(@NonNull String msg) {
        checkInitialize();
        return sLogPrinter.v(msg);
    }

    public static int v(@NonNull String msg, @NonNull Throwable tr) {
        checkInitialize();
        return sLogPrinter.v(msg, tr);
    }

    public static int w(@NonNull Throwable tr) {
        checkInitialize();
        return sLogPrinter.w(tr);
    }

    public static int w(@NonNull String msg, @NonNull Throwable tr) {
        checkInitialize();
        return sLogPrinter.w(msg, tr);
    }

    public static int w(@NonNull String msg) {
        checkInitialize();
        return sLogPrinter.w(msg);
    }

    public static int printMethod() {
        checkInitialize();
        return sLogPrinter.printMethod();
    }

    private static void checkInitialize() {
        if (sLogPrinter == null) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
