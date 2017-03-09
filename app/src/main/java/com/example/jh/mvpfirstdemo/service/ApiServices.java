package com.example.jh.mvpfirstdemo.service;

import com.example.jh.mvpfirstdemo.model.MainModel;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * 作者：jinhui on 2017/3/9
 * 邮箱：1004260403@qq.com
 */

public interface ApiServices {

    //baseurl
    String API_SERVER_URL = "http://www.weather.com.cn/";
    //加载天气  101010100
    //城市 id——http://www.weather.com.cn/adat/sk/101010100.html     101310222

    @GET("adat/sk/{cityId}.html")
    Observable<MainModel> getWeatherApi(@Path("cityId") String cityId);


}
