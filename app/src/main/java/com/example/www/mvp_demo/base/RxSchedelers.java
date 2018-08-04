package com.example.www.mvp_demo.base;


import com.example.www.mvp_demo.utils.LogUtil;

import rx.Subscriber;

/**
 * Description: 自定义Subscriber
 */

public class RxSchedelers<T> extends Subscriber<T> {

    @Override
    public void onCompleted() {
        LogUtil.e("TAG","请求完成");
    }

    @Override
    public void onError(Throwable e) {
        LogUtil.e("TAG","请求异常"+e.getMessage());
    }

    @Override
    public void onNext(T t) {

    }

}
