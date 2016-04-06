package com.ss.mrm.util;

        import android.text.TextUtils;

        import com.ss.mrm.model.DoctorBaseInfo;

        import java.io.BufferedWriter;
        import java.io.ByteArrayOutputStream;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.OutputStream;
        import java.io.OutputStreamWriter;
        import java.net.HttpURLConnection;
        import java.net.URL;
        import java.net.URLConnection;
        import java.net.URLEncoder;
        import java.util.List;
        import java.util.Map;

/**
 * Created by woshi on 2016/4/5.
 */
public class HttpUtil {

/*public static HttpURLConnection getHttpURLConnection(String u){
        HttpURLConnection httpURLConnection = null;
    try {
        URL url =new URL(u);
        httpURLConnection=(HttpURLConnection)url.openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Connection","Keep-Alive");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
    } catch (IOException e){
        e.printStackTrace();
    }
    return  httpURLConnection;
    }

    public static void postParams(OutputStream output,DoctorBaseInfo paramsList)throws IOException{
        StringBuffer stringBuffer = new StringBuffer();
       *//* for (DoctorBaseInfo d;paramsList){
            if(!TextUtils.isEmpty(stringBuffer)){
                stringBuffer.append("&");
            }*//*
            stringBuffer.append(URLEncoder.encode(paramsList.getDoctorInfo_name(),"UTF-8"));
            stringBuffer.append("=");
            stringBuffer.append(URLEncoder.encode(paramsList.getDoctorInfo_pwd(),"UTF-8"));

       // }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output,"UTF-8"));
        writer.write(stringBuffer.toString());
        writer.flush();
        writer.close();
    }*/

}


