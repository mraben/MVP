package com.example.www.mvp_demo.iview;

import java.util.List;

/**
 * Created by PrettyBoy on 2016/5/3.
 */
public interface HomeView extends BaseView{

    void setAdapter(List list);

    void startRefresh();

    void stopRefresh();

    void refresh(List list);

    void loadRefresh(List list);

    void setText(String str);

}
