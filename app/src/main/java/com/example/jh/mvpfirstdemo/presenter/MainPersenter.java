package com.example.jh.mvpfirstdemo.presenter;

import com.example.jh.mvpfirstdemo.callback.ApiCallback;
import com.example.jh.mvpfirstdemo.model.MainModel;
import com.example.jh.mvpfirstdemo.service.ApiServices;
import com.example.jh.mvpfirstdemo.interfaces.MainView;
import com.example.jh.mvpfirstdemo.service.AppClient;
import com.wuxiaolong.androidutils.library.LogUtil;

/**
 * 作者：jinhui on 2017/3/9
 * 邮箱：1004260403@qq.com
 */

public class MainPersenter extends BasePersenter<MainView>{

    private ApiServices mApiServices;

   public MainPersenter(MainView view){
       attachView(view);
       mApiServices = AppClient.retrofit().create(ApiServices.class);
   }

   //得到天气数据
    public void getWeatherData(String cityId){
        mvpView.showLoading();
        addSubscription(mApiServices.getWeatherApi(cityId),
                new ApiCallback<MainModel>(){
                    @Override
                    public void onSuccess(MainModel model) {
                        mvpView.getDataSuccess(model);

                    }

                    @Override
                    public void onFailure(String msg) {
                        mvpView.getDataFail(msg);
                        LogUtil.e("onFailure");
                    }

                    @Override
                    public void onFinish() {
                        mvpView.hideLoading();
                    }
                });
    }

}
