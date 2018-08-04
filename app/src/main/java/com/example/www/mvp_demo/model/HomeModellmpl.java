package com.example.www.mvp_demo.model;

import com.example.www.mvp_demo.base.RxSchedelers;
import com.example.www.mvp_demo.bean.HomeBean;
import com.example.www.mvp_demo.contract.HomeModel;
import com.example.www.mvp_demo.contract.IViewListener;

import okhttp3.ResponseBody;

/**
 * Description:
 * Date       : 2018/8/3.
 */
public class HomeModellmpl implements HomeModel {
    @Override
    public void loadData(int id, final IViewListener<HomeBean> listener) {
        Model m = Model.getInstance();
        m.apiBase(m.getApi().getempty()).subscribe(new RxSchedelers<ResponseBody>(){
            @Override
            public void onNext(ResponseBody responseBody) {
                super.onNext(responseBody);
                listener.onSuccess("成功");
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
                listener.onFail("失败");
            }
        });
    }
}
