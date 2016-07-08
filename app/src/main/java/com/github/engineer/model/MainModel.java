package com.github.engineer.model;

import android.content.Context;

import com.github.engineer.R;

/**
 * Author:  ice_coffee
 * Email:   ice_coffee_mzp@163.com
 * Date:    2016/7/8
 * Description:
 */
public class MainModel
{
    public static String[] getMainListString(Context context)
    {
        return context.getResources().getStringArray(R.array.question_list);
    }
}
