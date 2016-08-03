package com.github.engineer.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.github.engineer.R;

/**
 * 1. 设置theme为： android:Theme.Dialog， 并2设置各种属性
 * 2. 设置布局为底部居中
 * 3. 设置全屏
 */
public class DialogActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        //设置全屏
        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    }
}
