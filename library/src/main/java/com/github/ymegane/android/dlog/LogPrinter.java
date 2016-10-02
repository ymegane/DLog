package com.github.ymegane.android.dlog;

import android.util.Log;

class LogPrinter {
    private OutputSettings mSettings;
    private TagBuilder mTagBuilder;
    private MessageBuilder mMessageBuilder;

    private MessageBuilder mPrintMethodMessageBuilder = new MessageBuilder().method(true).lineNumber(true);

    private static final int RESULT_STOPPED_OUTPUT = -1;

    LogPrinter(OutputSettings settings, TagBuilder tagBuilder, MessageBuilder messageBuilder) {
        mSettings = settings;
        mTagBuilder = tagBuilder;
        mMessageBuilder = messageBuilder;
    }

    int d(String msg, Throwable tr) {
        if (mSettings.isOutput()) {
            StackTraceElement stackTrace = stackTrace();
            return Log.d(mTagBuilder.tag(stackTrace), mMessageBuilder.message(stackTrace, msg), tr);
        }
        return RESULT_STOPPED_OUTPUT;
    }

    int d(String msg) {
        if (mSettings.isOutput()) {
            StackTraceElement stackTrace = stackTrace();
            return Log.d(mTagBuilder.tag(stackTrace), mMessageBuilder.message(stackTrace, msg));
        }
        return RESULT_STOPPED_OUTPUT;
    }

    int e(String msg) {
        if (mSettings.isOutput()) {
            StackTraceElement stackTrace = stackTrace();
            return Log.d(mTagBuilder.tag(stackTrace), mMessageBuilder.message(stackTrace, msg));
        }
        return RESULT_STOPPED_OUTPUT;
    }

    int e(String msg, Throwable tr) {
        if (mSettings.isOutput()) {
            StackTraceElement stackTrace = stackTrace();
            return Log.e(mTagBuilder.tag(stackTrace), mMessageBuilder.message(stackTrace, msg), tr);
        }
        return RESULT_STOPPED_OUTPUT;
    }

    int i(String msg, Throwable tr) {
        if (mSettings.isOutput()) {
            StackTraceElement stackTrace = stackTrace();
            return Log.i(mTagBuilder.tag(stackTrace), mMessageBuilder.message(stackTrace, msg), tr);
        }
        return RESULT_STOPPED_OUTPUT;
    }

    int i(String msg) {
        if (mSettings.isOutput()) {
            StackTraceElement stackTrace = stackTrace();
            return Log.i(mTagBuilder.tag(stackTrace), mMessageBuilder.message(stackTrace, msg));
        }
        return RESULT_STOPPED_OUTPUT;
    }

    int v(String msg) {
        if (mSettings.isOutput()) {
            StackTraceElement stackTrace = stackTrace();
            return Log.v(mTagBuilder.tag(stackTrace), mMessageBuilder.message(stackTrace, msg));
        }
        return RESULT_STOPPED_OUTPUT;
    }

    int v(String msg, Throwable tr) {
        if (mSettings.isOutput()) {
            StackTraceElement stackTrace = stackTrace();
            return Log.v(mTagBuilder.tag(stackTrace), mMessageBuilder.message(stackTrace, msg), tr);
        }
        return RESULT_STOPPED_OUTPUT;
    }

    int w(Throwable tr) {
        if (mSettings.isOutput()) {
            StackTraceElement stackTrace = stackTrace();
            return Log.w(mTagBuilder.tag(stackTrace), tr);
        }
        return RESULT_STOPPED_OUTPUT;
    }

    int w(String msg, Throwable tr) {
        if (mSettings.isOutput()) {
            StackTraceElement stackTrace = stackTrace();
            return Log.w(mTagBuilder.tag(stackTrace), mMessageBuilder.message(stackTrace, msg), tr);
        }
        return RESULT_STOPPED_OUTPUT;
    }

    int w(String msg) {
        if (mSettings.isOutput()) {
            StackTraceElement stackTrace = stackTrace();
            return Log.w(mTagBuilder.tag(stackTrace), mMessageBuilder.message(stackTrace, msg));
        }
        return RESULT_STOPPED_OUTPUT;
    }

    int printMethod() {
        if (mSettings.isOutput()) {
            StackTraceElement stackTrace = stackTrace();
            return Log.d(mTagBuilder.tag(stackTrace), mPrintMethodMessageBuilder.message(stackTrace, ""));
        }
        return RESULT_STOPPED_OUTPUT;
    }

    private StackTraceElement stackTrace() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        return stackTraceElements[3];
    }
}
