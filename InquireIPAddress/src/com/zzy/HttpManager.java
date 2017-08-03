package com.zzy;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

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
                InputStreamReader reader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(reader);

                String str = "";
                String sss = "";
                while ((str = bufferedReader.readLine()) != null) {
                    sss += new String(str.getBytes("gb2312"), "utf-8");
                }


//                String utf = new String(sb.substring(ii).getBytes("gb2312"), "UTF-8");
                emitter.onNext(sss);


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
