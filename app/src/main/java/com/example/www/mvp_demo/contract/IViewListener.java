package com.example.www.mvp_demo.contract;

/**
 * Description:
 * Date       : 2018/8/3.
 */
public interface IViewListener<T> {
    void onSuccess(String t);
    void onFail(String error);
}
