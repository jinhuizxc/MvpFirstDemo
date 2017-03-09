package com.example.jh.mvpfirstdemo.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jh.mvpfirstdemo.R;
import com.example.jh.mvpfirstdemo.interfaces.MainView;
import com.example.jh.mvpfirstdemo.model.MainModel;
import com.example.jh.mvpfirstdemo.presenter.MainPersenter;
import com.wuxiaolong.androidutils.library.LogUtil;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 天气MVP项目测试
 */

public class MainActivity extends BaseActivity<MainPersenter> implements MainView, View.OnClickListener {

    private static final String TAG = "MainActivity";
    @Bind(R.id.button)
    Button mButton;
    @Bind(R.id.textView)
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        mButton.setOnClickListener(this);
    }

    @Override
    protected MainPersenter createPerenter() {
        return new MainPersenter(this);
    }

    @Override
    public void showLoading() {

    }
    @Override
    public void hideLoading() {

    }

    @Override
    public void getDataSuccess(MainModel model) {
        dataSuccess(model);
    }
    @Override
    public void getDataFail(String msg) {
        toastShow("网络加载失败");
    }
    private void dataSuccess(MainModel model) {
        MainModel.WeatherinfoBean weatherinfo = model.getWeatherinfoBean();
        String showData = getResources().getString(R.string.city) + weatherinfo.getCity()
        + getResources().getString(R.string.wd) + weatherinfo.getWD()
                + getResources().getString(R.string.ws) + weatherinfo.getWS()
                + getResources().getString(R.string.time) + weatherinfo.getTime();
        mTextView.setText(showData);
    }



    @Override
    public void onClick(View v) {
        Log.e(TAG,"onClick");
        // 北京天气, 根据城市id获取
        //加载天气  101010100
        //城市 id——http://www.weather.com.cn/adat/sk/101010100.html     101310222
        mvpPerenter.getWeatherData("101010100");
    }
}
