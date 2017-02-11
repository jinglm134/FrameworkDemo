package frameworkdemo.com.jlm.frameworkdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.OnClick;
import frameworkdemo.com.jlm.frameworkdemo.BuildConfig;
import frameworkdemo.com.jlm.frameworkdemo.R;
import frameworkdemo.com.jlm.frameworkdemo.network.BaseWeb;
import it.sephiroth.android.library.picasso.Callback;
import it.sephiroth.android.library.picasso.Picasso;

public class MainActivity extends BaseActivity {

    @BindView(R.id.imageView)
    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseWeb.requestLogin(this);

        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png")
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .resize(500, 500).centerCrop().into(imageView, new Callback() {
            @Override
            public void onSuccess() {
//                Toast.makeText(MainActivity.this, "onSuccess", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError() {
//                Toast.makeText(MainActivity.this, "onError", Toast.LENGTH_SHORT).show();
            }
        });

        Log.e("isDebug", String.valueOf(BuildConfig.LOG_DEBUG));
    }

    @OnClick(R.id.button1)
    public void onClickGlide() {
        startActivity(new Intent(this, ActivityGlideList.class));
    }

    @OnClick(R.id.button2)
    public void onClickPhotoView() {
        startActivity(new Intent(this, ActivityPhotoView.class));
    }

    @OnClick(R.id.button3)
    public void onClickPhoto() {
        startActivity(new Intent(this, ActivityCamera.class));
    }

    @OnClick(R.id.button4)
    public void onClickBessel() {
        startActivity(new Intent(this, ActivityBessel.class));
    }

    @OnClick(R.id.button5)
    public void onClickUtilTest() {
        startActivity(new Intent(this, ActivityUtilsTest.class));
    }

    @OnClick(R.id.button6)
    public void onClickCoordinatorLayout() {
        startActivity(new Intent(this, ActivityCoordinator.class));
    }

    @OnClick(R.id.button7)
    public void n_IM_Login() {
        startActivity(new Intent(this, LoginActivity.class));
    }


    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }
}
