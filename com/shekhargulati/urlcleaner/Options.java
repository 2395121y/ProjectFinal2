package com.shekhargulati.urlcleaner;

/**
 * Original Source Code: https://github.com/shekhargulati/urlcleaner
 * This file assists for unshortening the URL.
 */

public class Options {

    public static final Options DEFAULT_OPTIONS = new Options();

    private boolean stripFragment = true;
    private boolean stripWWW = true;

    private Options() {
    }

    public Options(boolean stripFragment, boolean stripWWW) {
        this.stripFragment = stripFragment;
        this.stripWWW = stripWWW;
    }

    public boolean isStripFragment() {
        return stripFragment;
    }

    public boolean isStripWWW() {
        return stripWWW;
    }
}