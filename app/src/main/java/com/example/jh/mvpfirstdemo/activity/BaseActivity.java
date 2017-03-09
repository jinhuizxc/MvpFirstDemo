package com.example.jh.mvpfirstdemo.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.example.jh.mvpfirstdemo.presenter.BasePersenter;

/**
 * 作者：jinhui on 2017/3/9
 * 邮箱：1004260403@qq.com
 */

public abstract class BaseActivity<B extends BasePersenter> extends RxBaseActivity{

    protected B mvpPerenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mvpPerenter = createPerenter();
    }
    protected abstract B createPerenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mvpPerenter != null){
            //继承父类，调用其方法
            mvpPerenter.detachView();
        }
    }

    public void showLoading(){
        //继承父类调用其方法
        showProgressDialog();
    }
    public void hideLoading(){
        dismissProgressDialog();
    }
}
