package com.diffey.view.rxzhihu.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by diff on 2016/2/15.
 */
public class TRService1 {
    public static final String BASE_TRC_URL = "http://www.tuling123.com/openapi/";

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_TRC_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build();

    private TRService1() {
    }

    public static TRApi1 createTRService() {
        return retrofit.create(TRApi1.class);
    }
}
