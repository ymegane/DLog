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
            for (int i=0; i<packages.length-2; i++) {
                stringBuilder.append(packages[i]);
            }
        }
        stringBuilder.append(packages[packages.length-1]);

        return stringBuilder.toString();
    }
}
