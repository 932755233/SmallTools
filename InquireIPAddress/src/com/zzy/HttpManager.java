package com.zzy;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import jdk.nashorn.internal.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.w3c.dom.NodeList;

import javax.swing.text.html.HTML;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpManager {

    public static HttpManager getInstance() {
        return new HttpManager();
    }

    public void post(CallBack callBack) {

        Observable.create((ObservableEmitter<String> emitter) -> {
            System.out.println("ObservableEmitter");
            URL url = new URL("http://1212.ip138.com/ic.asp");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {

                InputStream inputStream = connection.getInputStream();
                //要在流之前编码
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "GB2312");
                BufferedReader reader = new BufferedReader(inputStreamReader);

                StringBuffer sb = new StringBuffer();
                String str = "";
                while ((str = reader.readLine()) != null) {
                    sb.append(str);
                }


                Document document = Jsoup.parse(sb.toString());
                Elements center = document.getElementsByTag("center");
                String html = center.html();


                emitter.onNext(html);


            } else {
                emitter.onError(new Throwable("联网失败:" + responseCode));
            }

        }).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                System.out.println("onSubscribe");

            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext:" + s);
                callBack.onSucceed(s);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError:" + throwable.getMessage());
                callBack.onFailure();
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");

            }
        });

    }
}
