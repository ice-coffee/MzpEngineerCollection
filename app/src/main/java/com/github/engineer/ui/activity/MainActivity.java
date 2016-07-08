package com.github.engineer.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.engineer.R;
import com.github.engineer.presenter.MainPresenter;
import com.github.engineer.presenter.impel.MainPresenterImpel;
import com.github.engineer.views.MainView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 1. 在使用ButterKnife时的加载方式
 * https://github.com/JakeWharton/butterknife
 */
public class MainActivity extends AppCompatActivity implements MainView
{
    @BindView(R.id.all_question)
    ListView allQuestion;

    private MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mainPresenter = new MainPresenterImpel(this, this);
        mainPresenter.setMainListAdapter();
    }

    @Override
    public void showMainList(String[] objects)
    {
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, objects);
        allQuestion.setAdapter(adapter);
    }
}
