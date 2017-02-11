package frameworkdemo.com.jlm.frameworkdemo.activity;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import frameworkdemo.com.jlm.frameworkdemo.R;
import frameworkdemo.com.jlm.frameworkdemo.util.DeviceUtils;

/**
 * Created by jlm on 2016/12/3.
 */

public class ActivityUtilsTest extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.tv_gj)
    TextView tv_gj;

    @BindView(R.id.tv_cq)
    TextView tv_cq;

    @Override
    public int getContentViewId() {
        return R.layout.activity_utils_test;
    }

    @Override
    protected void initView() {
        super.initView();
        tv_gj.setOnClickListener(this);
        tv_cq.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_gj:
                DeviceUtils.shutdown();
                break;
            case R.id.tv_cq:
                DeviceUtils.reboot();
                break;
        }
    }
}
