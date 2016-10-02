package com.github.ymegane.android.dlog;

import android.content.Context;
import android.content.pm.ApplicationInfo;

public class OutputSettings {
    enum Means {
        DEBUGGABLE, FORCE
    }

    Means mMeans = Means.DEBUGGABLE;
    final boolean isDebuggable;

    OutputSettings(Context context) {
        isDebuggable = isDebuggable(context);
    }

    public OutputSettings debuggable() {
        mMeans = Means.DEBUGGABLE;
        return this;
    }

    public OutputSettings force() {
        mMeans = Means.FORCE;
        return this;
    }

    boolean isOutput() {
        switch (mMeans) {
            case DEBUGGABLE:
                return isDebuggable;
            case FORCE:
                return true;
            default:
                return false;
        }
    }

    static boolean isDebuggable(Context context) {
        return (0 != (context.getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE));
    }
}
