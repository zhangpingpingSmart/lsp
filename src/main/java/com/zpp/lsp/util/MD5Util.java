package com.zpp.lsp.util;

/**
 * @Author: 张平平
 * @Date: 2021/3/10 17:54
 */
public class MD5Util {
    /**
     * MD5加密工具类
     * @param data
     * @return
     */
    public static String MD5(String data) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(data.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte bt : array) {
                sb.append(Integer.toHexString((bt & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString().toUpperCase();
        } catch (Exception ex) {
        }
        return null;
    }
}
