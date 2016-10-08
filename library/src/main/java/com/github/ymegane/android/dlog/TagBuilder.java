package com.github.ymegane.android.dlog;

public class TagBuilder {
    boolean _package = false;

    public TagBuilder addPackage(boolean output) {
        _package = output;
        return this;
    }

    String tag(StackTraceElement stackTraceElement) {
        StringBuilder stringBuilder = new StringBuilder();

        String className = stackTraceElement.getClassName();
        String[] packages = className.split("\\.");

        if (_package) {
            stringBuilder.append(className);
        } else {
            stringBuilder.append(packages[packages.length - 1]);
        }

        return stringBuilder.toString();
    }
}
