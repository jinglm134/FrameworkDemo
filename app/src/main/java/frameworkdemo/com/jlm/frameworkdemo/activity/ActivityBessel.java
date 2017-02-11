package frameworkdemo.com.jlm.frameworkdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import frameworkdemo.com.jlm.frameworkdemo.view.Bessel;

/**
 * ActivityBessel
 * Created by jlm on 2016/11/30.
 */

public class ActivityBessel extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bessel bessel = new Bessel(this);
        setContentView(bessel);
    }
}
