package com.github.engineer.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.github.engineer.R;
import com.orhanobut.logger.Logger;

/**
 * Author:  ice_coffee
 * Email:   ice_coffee_mzp@163.com
 * Date:    2016/7/8
 * Description:
 */
public class ListAndScrollActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_scroll);
    }

    public void answerOne(View view)
    {
        Logger.e("answerOne");
    }

    public void answerTwo(View view)
    {
        Logger.e("answerTwo");
    }

    public void answerThree(View view)
    {
        Logger.e("answerThree");
    }

    public void answerFour(View view)
    {
        Logger.e("answerFour");
    }
}
