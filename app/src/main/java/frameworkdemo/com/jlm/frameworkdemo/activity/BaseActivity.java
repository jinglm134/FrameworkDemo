package frameworkdemo.com.jlm.frameworkdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * BaseActivity
 * Created by jlm on 2016/11/2.
 */

public abstract class BaseActivity extends AppCompatActivity {
    private Unbinder bind;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        bind = ButterKnife.bind(this);
        initView();
    }

    protected void initView() {
    }

    public abstract int getContentViewId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }
}
