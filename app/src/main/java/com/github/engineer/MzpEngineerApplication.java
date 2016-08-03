package com.github.engineer;

import android.app.Application;

import com.orhanobut.logger.Logger;

/**
 * Author:  ice_coffee
 * Email:   ice_coffee_mzp@163.com
 * Date:    2016/7/9
 * Description:
 */
public class MzpEngineerApplication extends Application
{
    private static final String TAG = "MzpEngineer";
    @Override
    public void onCreate()
    {
        super.onCreate();

        loggerInit();
    }

    /**
     * Logger初始化
     */
    private void loggerInit()
    {
        Logger
                .init(TAG)
                .methodCount(0)
                .hideThreadInfo();
    }

    
}
