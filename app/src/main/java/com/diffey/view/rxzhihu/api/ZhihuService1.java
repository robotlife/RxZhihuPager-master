package com.diffey.view.rxzhihu.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by diff on 2016/2/15.
 */
public class ZhihuService1 {
    public static final String BASE_ZHIHU_URL = "http://news-at.zhihu.com/";

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_ZHIHU_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build();

    private ZhihuService1() {
    }

    public static ZhihuApi1 createZhihuService() {
        return retrofit.create(ZhihuApi1.class);
    }
}
