package frameworkdemo.com.jlm.frameworkdemo.application;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import frameworkdemo.com.jlm.frameworkdemo.helper.NIMHelper;

/**
 * Created by jlm on 2017/1/14.
 */

public class MyApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //        RocooFix.init(this);

        // SDK初始化（启动后台服务，若已经存在用户登录信息， SDK 将完成自动登录）
        NIMHelper.init(this);
    }


}

