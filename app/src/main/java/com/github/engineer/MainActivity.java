package com.github.engineer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 1. 在使用ButterKnife时的加载方式
 * https://github.com/JakeWharton/butterknife
 */
public class MainActivity extends AppCompatActivity
{
    @BindView(R.id.all_question)
    ListView allQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        allQuestion.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.question_list)));
    }
}
