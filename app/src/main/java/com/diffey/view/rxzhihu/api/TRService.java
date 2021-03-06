package com.diffey.view.rxzhihu.api;

import com.diffey.view.rxzhihu.bean.TREntity;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 *
 */
public interface TRService {
    /**
     * 可以看到这里应该是post传递的参数。
     * @param key
     * @param info
     * @param userid
     * @return
     */
    @FormUrlEncoded
    @POST("api")
    Observable<TREntity> getTRResponse(@Field("key") String key, @Field("info") String info, @Field("userid") String userid);
}
