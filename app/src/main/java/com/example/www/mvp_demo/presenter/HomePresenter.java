package com.example.www.mvp_demo.presenter;

import com.example.www.mvp_demo.bean.HomeBean;
import com.example.www.mvp_demo.iview.IViewListener;
import com.example.www.mvp_demo.model.HomeModellmpl;
import com.example.www.mvp_demo.iview.HomeView;

/**
 * Description:
 * Date       : 2018/7/29.
 */
public class HomePresenter  {
    private HomeView homeView;
    private HomeModellmpl homeModellmpl;


    public HomePresenter(HomeView homeView) {
        this.homeView = homeView;
        this.homeModellmpl = new HomeModellmpl();
    }

    public void loadData(int id) {
        homeModellmpl.loadData(id, new IViewListener<HomeBean>() {
            @Override
            public void onSuccess(String t) {
                homeView.setText(t);
            }

            @Override
            public void onFail(String error) {
                homeView.setText(error);
            }

        });
    }
}

