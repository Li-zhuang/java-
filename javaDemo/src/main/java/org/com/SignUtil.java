package org.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;

public class SignUtil {
    static String getSign(String appId, String appKey, String timestamp, String body, String url) throws MalformedURLException {
        URL urlObj = new URL(url);
        url=urlObj.getPath();
        appKey = appKey.trim();
        appKey = appKey.replaceAll("\"", "");
        if (body != null) {
            body = body.trim();
        }
        if (!body.equals("")) {
            body = body.replaceAll(" ", "");
            body = body.replaceAll("\t", "");
            body = body.replaceAll("\r", "");
            body = body.replaceAll("\n", "");
        }
//        log.info("body:"+body);
        StringBuffer sb = new StringBuffer();
        sb.append(url).append(body).append(appId).append(appKey).append(timestamp);

        MessageDigest md = null;
        byte[] bytes = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
            bytes = md.digest(sb.toString().getBytes("utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return BinaryToHexString(bytes);
    }

    static String BinaryToHexString(byte[] bytes) {
        StringBuilder hex = new StringBuilder();
        String hexStr = "0123456789abcdef";
        for (int i = 0; i < bytes.length; i++) {
            hex.append(String.valueOf(hexStr.charAt((bytes[i] & 0xF0) >> 4)));
            hex.append(String.valueOf(hexStr.charAt(bytes[i] & 0x0F)));
        }
        return hex.toString();
    }
    public static void main(String[] args) throws MalformedURLException {


        String ss = getSign("MB-DEMO-0000","504f37c39bb062a789b28598fe94d9d8","1614331048386","{\"deviceId\":\"2C37C530B5F1\"}","https://uws.haier.net/shadow/v1/info");
        System.out.println(ss);

    } //计算出的ss为7e5ffbf921dabc9dc3db657c4d2fdb7c990444380d638973f26762722d7b09d2
}
