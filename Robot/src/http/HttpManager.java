package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpManager {


    public void requestPost() {

    }

    public static void requestGet(String urlStr, CallBack callBack) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url = new URL(urlStr);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("GET");
                    conn.setRequestProperty("accept", "*/*");
                    conn.setRequestProperty("accept-encoding", "gzip, deflate, br");
                    conn.setRequestProperty("accept-language", "zh-CN,zh;q=0.8");
//                    conn.addRequestProperty("cookie","pt_login_sig=k7jzsZAKyCwHSLSFMcX4Cn1ttHj8LgEVmteaJ1DTljsIMWsrY*KQmJQp*t1rXIHd; pt_clientip=88c172fb463233a3; pt_serverip=842a0aa8825bf93b; pt_local_token=784521042; uikey=1554347c8c1493185308444b7ecb19f6cb6fd19f7ddc24d312ee0be03a0ab5ba; pt_guid_sig=df6e5ae0f9dbab96c98c4940430319af9b1b2c50217848343b9454638b2c1b57; pgv_pvi=8398352384; pgv_si=s7535468544; qrsig=QG8P3LsL*pCYgrVOw0777DQG2ETtIADJdOFAcYSkodsV79R*u3sznGokUFB9p2-I");
                    conn.setRequestProperty("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.101 Safari/537.36");
                    conn.setRequestProperty("referer", "https://xui.ptlogin2.qq.com/cgi-bin/xlogin?daid=164&target=self&style=40&mibao_css=m_webqq&appid=501004106&enable_qlogin=0&no_verifyimg=1&s_url=http%3A%2F%2Fw.qq.com%2Fproxy.html&f_url=loginerroralert&strong_login=1&login_state=10&t=20131024001");

                    conn.setRequestProperty("cookie", "pt_login_sig=k7jzsZAKyCwHSLSFMcX4Cn1ttHj8LgEVmteaJ1DTljsIMWsrY*KQmJQp*t1rXIHd; pt_clientip=88c172fb463233a3; pt_serverip=842a0aa8825bf93b; pt_local_token=784521042; uikey=1554347c8c1493185308444b7ecb19f6cb6fd19f7ddc24d312ee0be03a0ab5ba; pt_guid_sig=df6e5ae0f9dbab96c98c4940430319af9b1b2c50217848343b9454638b2c1b57; pgv_pvi=8398352384; pgv_si=s7535468544; qrsig=QG8P3LsL*pCYgrVOw0777DQG2ETtIADJdOFAcYSkodsV79R*u3sznGokUFB9p2-I");

                    conn.setDoInput(true);
                    conn.setDoOutput(true);

                    int responseCode = conn.getResponseCode();
                    if (responseCode == HttpURLConnection.HTTP_OK) {

                        InputStream in = conn.getInputStream();
                        InputStreamReader isr = new InputStreamReader(in);
                        BufferedReader bufr = new BufferedReader(isr);
                        String str;
                        StringBuffer sb = new StringBuffer();
                        while ((str = bufr.readLine()) != null) {
                            sb.append(str);
                        }
                        bufr.close();
                        System.out.println("http:url---" + urlStr + "---result:" + sb.toString());
                        callBack.doSucceed(sb.toString());
                    } else {
                        System.out.println("doFailure:" + responseCode + "---" + conn.getResponseMessage());
                        callBack.doFailure(responseCode + "---" + conn.getResponseMessage());
                    }


                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }
}
