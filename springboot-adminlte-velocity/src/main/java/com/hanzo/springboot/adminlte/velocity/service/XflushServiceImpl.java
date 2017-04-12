package com.hanzo.springboot.adminlte.velocity.service;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by P10103052 on 2017/4/1.
 */
public class XflushServiceImpl implements XflushService {
    private static final String XFLUSH_API_TOKEN = "6716e47e-dc24-49ad-a619-e1acee9579df";

    @Override
    public String getXflushData(String strUrl, String params) throws Exception {
        URL url = new URL(strUrl);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();

        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setUseCaches(false);
        connection.setInstanceFollowRedirects(true);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("apiToken", "6716e47e-dc24-49ad-a619-e1acee9579df");
        connection.connect();

        OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
        out.append(params);
        out.flush();
        out.close();

        int code = connection.getResponseCode();
        if (200 != code) {
            throw new Exception("invalid response code:" + code);
        }

        int length = (int)connection.getContentLength();
        InputStream is = connection.getInputStream();
        String ret = "";

        if (-1 != length) {
            byte[] data = new byte[length];
            byte[] tmp = new byte[512];
            int readLen = 0;
            int destPos = 0;

            while ((readLen = is.read(tmp)) > 0) {
                System.arraycopy(tmp, 0, data, destPos, readLen);
                destPos += readLen;
            }

            ret = new String(data, "UTF-8");
        }
        return ret;
    }
}
