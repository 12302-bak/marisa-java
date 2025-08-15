package site.wtfu.framework.rime.utils;

import jp.darts.DoubleArrayNative;

/**
 *
 * Copyright https://wtfu.site Inc. All Rights Reserved.
 *
 * @date 2025/4/16
 *                          @since  1.0
 *                          @author 12302
 *
 */
public class DartsTest {

    public static void main(String[] args) {
        String[] keys = {"e", "er", "h", "hao", "here", "y", "yi"};
        DoubleArrayNative doubleArrayNative = new DoubleArrayNative();
        int build = doubleArrayNative.build(keys.length, keys);
        System.out.println(build);
    }
}
