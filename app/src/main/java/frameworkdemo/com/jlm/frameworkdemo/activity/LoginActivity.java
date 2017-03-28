package frameworkdemo.com.jlm.frameworkdemo.activity;

import android.Manifest;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.netease.nimlib.sdk.NIMClient;
import com.netease.nimlib.sdk.RequestCallback;
import com.netease.nimlib.sdk.StatusCode;
import com.netease.nimlib.sdk.auth.AuthService;
import com.netease.nimlib.sdk.auth.LoginInfo;

import butterknife.BindView;
import frameworkdemo.com.jlm.frameworkdemo.R;
import frameworkdemo.com.jlm.frameworkdemo.util.ToastUtils;
import frameworkdemo.com.jlm.frameworkdemo.util.permission.MPermission;
import frameworkdemo.com.jlm.frameworkdemo.util.permission.annotation.OnMPermissionDenied;
import frameworkdemo.com.jlm.frameworkdemo.util.permission.annotation.OnMPermissionGranted;
import frameworkdemo.com.jlm.frameworkdemo.view.ClearableEditTextWithIcon;
import rx.Observable;
import rx.Subscriber;

/**
 * Created by jaylim on 2017/2/10.
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private static final int BASIC_PERMISSION_REQUEST_CODE = 0x1001;
    @BindView(R.id.cet_account)
    ClearableEditTextWithIcon cet_account;

    @BindView(R.id.cet_password)
    ClearableEditTextWithIcon cet_password;

    @BindView(R.id.btn_login)
    Button btn_login;

    @BindView(R.id.btn_chat)
    Button btn_chat;

    @Override
    public int getContentViewId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        super.initView();
        requestBasicPermission();
        btn_login.setOnClickListener(this);
        btn_chat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                login();
                break;
            case R.id.btn_chat:
                Observable.from(new String[]{"dd", "ee", "ff"}).subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {
                        Log.e("onCompleted", "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("throwable", e.toString());
                    }

                    @Override
                    public void onNext(String s) {
                        Log.e("onNext--------------",s);
                    }
                });
                break;
        }
    }

    public void login() {
        String account = cet_account.getText().toString();
        if (account.length() < 1 || account == null) {
            ToastUtils.showLongToast(this, "用户名不能为空");
            return;
        }

        String password = cet_password.getText().toString();
        if (password.length() < 1) {
            ToastUtils.showLongToast(this, "密码不能为空");
            return;
        }

        LoginInfo info = new LoginInfo(account, password);
        doLogin(info);
        //        String token = MD5.gets

    }

    public void doLogin(LoginInfo info) {

        RequestCallback<LoginInfo> callback = new RequestCallback<LoginInfo>() {
            @Override
            public void onSuccess(LoginInfo param) {
                // 可以在此保存LoginInfo到本地，下次启动APP做自动登录用
                Toast.makeText(LoginActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailed(int code) {
                if (code == 302 || code == 404) {
                    Toast.makeText(LoginActivity.this, "账号或密码错误", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LoginActivity.this, "登录失败: " + code, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onException(Throwable exception) {
                Toast.makeText(LoginActivity.this, "无效输入", Toast.LENGTH_LONG).show();
            }

        };
        NIMClient.getService(AuthService.class).login(info).setCallback(callback);

        StatusCode status = NIMClient.getStatus();
        Log.e("Status", status.toString());

    }


    /**
     * 基本权限管理
     */
    private void requestBasicPermission() {
        MPermission.with(LoginActivity.this)
                .addRequestCode(BASIC_PERMISSION_REQUEST_CODE)
                .permissions(
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE
                )
                .request();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        MPermission.onRequestPermissionsResult(this, requestCode, permissions, grantResults);
    }

    @OnMPermissionGranted(BASIC_PERMISSION_REQUEST_CODE)
    public void onBasicPermissionSuccess() {
        Toast.makeText(this, "授权成功", Toast.LENGTH_SHORT).show();
    }

    @OnMPermissionDenied(BASIC_PERMISSION_REQUEST_CODE)
    public void onBasicPermissionFailed() {
        Toast.makeText(this, "授权失败", Toast.LENGTH_SHORT).show();
    }

}
