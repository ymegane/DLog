package com.github.ymegane.android.dlog;

public class MessageBuilder {
    boolean lineNumber = true;
    boolean method = true;

    public MessageBuilder lineNumber(boolean output) {
        lineNumber = output;
        return this;
    }

    public MessageBuilder method(boolean output) {
        method = output;
        return this;
    }

    String message(StackTraceElement stackTraceElement, String message) {
        StringBuilder stringBuilder = new StringBuilder();
        if (method) {
            stringBuilder.append(stackTraceElement.getMethodName()).append(" ");
        }
        if (lineNumber) {
            stringBuilder.append("[L.").append(stackTraceElement.getLineNumber()).append("] ");
        }
        stringBuilder.append(message);

        return stringBuilder.toString();
    }
}
