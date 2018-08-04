package com.example.www.mvp_demo.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.www.mvp_demo.R;
import com.example.www.mvp_demo.base.BaseFragment;
import com.example.www.mvp_demo.presenter.HomePresenter;
import com.example.www.mvp_demo.ui.views.HomeView;
import com.example.www.mvp_demo.utils.ToastUtil;

import java.util.List;

import butterknife.BindView;

/**
 * Description:
 * Date       : 2018/7/29.
 */
public class HomeFragment extends BaseFragment implements HomeView{


    @BindView(R.id.h_tv)
    TextView h_tv;
    private HomePresenter hp;


    @Override
    protected View setLayoutId(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        hp = new HomePresenter(this);
        return View.inflate(getContext(), R.layout.homelayout, null);
    }

    @Override
    protected void init() {
        super.init();
        hp.loadData(0);
    }

    @Override
    public void setAdapter(List list) {

    }

    @Override
    public void startRefresh() {

    }

    @Override
    public void stopRefresh() {

    }

    @Override
    public void refresh(List list) {

    }

    @Override
    public void loadRefresh(List list) {

    }

    @Override
    public void setText(String str) {
        ToastUtil.showShort(getContext(),str);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showFailMsg() {

    }
}
