package com.example.jh.mvpfirstdemo.interfaces;

import com.example.jh.mvpfirstdemo.model.MainModel;

/**
 * 作者：jinhui on 2017/3/9
 * 邮箱：1004260403@qq.com
 */

public interface MainView extends BaseView {

    void getDataSuccess(MainModel model);
    void getDataFail(String msg);

}
