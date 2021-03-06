package com.diffey.view.rxzhihu.api;

import com.diffey.view.rxzhihu.bean.NewsEntity;
import com.diffey.view.rxzhihu.bean.StoryDetailsEntity;
import com.diffey.view.rxzhihu.bean.TREntity;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 *
 */
public interface ZhihuService {
    @GET("api/4/news/latest")
    Observable<NewsEntity> getLastestNews();

    /**
     * 这里的Path的含义应该是将此值放进去
     * @param id
     * @return
     */
    @GET("api/4/news/before/{id}")
    Observable<NewsEntity> getBeforeNews(@Path("id") String id);

    @GET("api/4/news/{id}")
    Observable<StoryDetailsEntity> getNewsDetails(@Path("id") int id);
}
