package com.github.engineer.presenter.impel;

import android.content.Context;

import com.github.engineer.model.MainModel;
import com.github.engineer.presenter.MainPresenter;
import com.github.engineer.views.MainView;

/**
 * Author:  ice_coffee
 * Email:   ice_coffee_mzp@163.com
 * Date:    2016/7/8
 * Description:
 */
public class MainPresenterImpel implements MainPresenter
{
    private Context context;
    private MainView mainView;

    public MainPresenterImpel(Context context, MainView mainView)
    {
        this.context = context;
        this.mainView = mainView;
    }

    @Override
    public void setMainListAdapter()
    {
        mainView.showMainList(MainModel.getMainListString(context));
    }
}
