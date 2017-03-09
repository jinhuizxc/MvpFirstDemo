package com.example.jh.mvpfirstdemo.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.support.annotation.LayoutRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jh.mvpfirstdemo.R;

import butterknife.ButterKnife;

/**
 * 作者：jinhui on 2017/3/9
 * 邮箱：1004260403@qq.com
 */

public class RxBaseActivity extends AppCompatActivity {

    public Activity mActivity;
    public ProgressDialog progressDialog;
    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
        mActivity = this;
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        ButterKnife.bind(this);
        mActivity = this;
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        ButterKnife.bind(this);
        mActivity = this;
    }

    public Toolbar initToolBar(String title){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(toolbar != null){
            setSupportActionBar(toolbar);
            TextView toolBarTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
            toolBarTitle.setText(title);
        }
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            //
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(false);
        }
       return  toolbar;
    }

    public Toolbar initToolBarAsHome(String title) {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            TextView toolbaTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
            toolbaTitle.setText(title);
        }
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setDisplayShowTitleEnabled(false);
        }
        return toolbar;
    }

    //显示toast
    public void toastShow(int resId){
        Toast.makeText(mActivity, resId, Toast.LENGTH_SHORT).show();
    }
    public void toastShow(String resId){
        Toast.makeText(mActivity, resId, Toast.LENGTH_SHORT).show();
    }
    //显示dialog
    public ProgressDialog showProgressDialog(){
        progressDialog = new ProgressDialog(mActivity);
        progressDialog.setMessage("加载中...");
        progressDialog.show();
        return progressDialog;
    }
    public ProgressDialog showProgressDialog(CharSequence message) {
        progressDialog = new ProgressDialog(mActivity);
        progressDialog.setMessage(message);
        progressDialog.show();
        return progressDialog;
    }
    //隐藏进度条
    public void dismissProgressDialog(){
        if(progressDialog != null && progressDialog.isShowing()){
            // progressDialog.hide();会导致android.view.WindowLeaked
            progressDialog.dismiss();
        }
    }
}
