/*
 * YUI Test Coverage
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */
package com.yahoo.platform.yuitest.coverage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;
import java.util.Set;

public class FileDirFilter implements FilenameFilter {
    private Set<String> excludes = new HashSet<String>();

    public FileDirFilter(HashSet<String> excludes) {
        this.excludes = excludes;
    }

    public boolean accept(File dir, String name) {
        if (excludes.contains(dir.getPath()) ||
            excludes.contains(dir.getPath() + File.separator + name)) {
                return false;
        } else {
            return true;
        }
    }
}
