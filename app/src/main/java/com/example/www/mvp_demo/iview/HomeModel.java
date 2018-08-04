package com.example.www.mvp_demo.iview;

import com.example.www.mvp_demo.bean.HomeBean;

/**
 * Description:
 * Date       : 2018/7/29.
 */
public interface HomeModel {
    void loadData(int id,IViewListener<HomeBean> listener);
}
