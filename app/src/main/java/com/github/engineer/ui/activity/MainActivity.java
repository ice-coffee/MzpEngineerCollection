package com.github.engineer.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.engineer.R;
import com.github.engineer.presenter.MainPresenter;
import com.github.engineer.presenter.impel.MainPresenterImpel;
import com.github.engineer.views.MainView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 1. 在使用ButterKnife时的加载方式
 * https://github.com/JakeWharton/butterknife
 */
public class MainActivity extends AppCompatActivity implements MainView
{
    @Bind(R.id.all_question)
    ListView allQuestion;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        allQuestion= (ListView) findViewById(R.id.all_question);
        mainPresenter = new MainPresenterImpel(this, this);
        mainPresenter.setMainListAdapter();

        allQuestion.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:
                        startActivity(new Intent(MainActivity.this, ListAndScrollActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, DialogActivity.class));
                        break;
                }
            }
        });
    }

    @Override
    public void showMainList(String[] objects)
    {
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, objects);
        allQuestion.setAdapter(adapter);
    }
}
