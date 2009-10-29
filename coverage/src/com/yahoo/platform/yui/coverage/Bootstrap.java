/*
 * YUI Test Coverage
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yui.coverage;

import com.yahoo.platform.yui.util.JarClassLoader;

import java.lang.reflect.Method;
 
public class Bootstrap {
    public static void main(String args[]) throws Exception {
        ClassLoader loader = new JarClassLoader();
        Thread.currentThread().setContextClassLoader(loader);
        Class c = loader.loadClass(YUITestCoverage.class.getName());
        Method main = c.getMethod("main", new Class[]{String[].class});
        main.invoke(null, new Object[]{args});
    }
}
