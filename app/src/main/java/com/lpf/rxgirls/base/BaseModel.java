package com.lpf.rxgirls.base;


import com.lpf.rxgirls.helper.RetrofitManager;

import retrofit2.Retrofit;

/**
 * 业务对象的基类
 */
public class BaseModel {
    //retrofit请求数据的管理类
    public Retrofit retrofit;

    public BaseModel() {
        retrofit = RetrofitManager.builder();
    }

}
