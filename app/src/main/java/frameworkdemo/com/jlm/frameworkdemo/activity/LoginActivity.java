package frameworkdemo.com.jlm.frameworkdemo.activity;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.netease.nimlib.sdk.NIMClient;
import com.netease.nimlib.sdk.RequestCallback;
import com.netease.nimlib.sdk.auth.AuthService;
import com.netease.nimlib.sdk.auth.LoginInfo;

import butterknife.BindView;
import frameworkdemo.com.jlm.frameworkdemo.R;
import frameworkdemo.com.jlm.frameworkdemo.util.ToastUtils;
import frameworkdemo.com.jlm.frameworkdemo.util.encrypt.MD5;
import frameworkdemo.com.jlm.frameworkdemo.view.ClearableEditTextWithIcon;

/**
 * Created by jaylim on 2017/2/10.
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.cet_account)
     ClearableEditTextWithIcon cet_account;

    @BindView(R.id.cet_password)
     ClearableEditTextWithIcon cet_password;

    @BindView(R.id.btn_login)
     Button btn_login;

    @Override
    public int getContentViewId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        super.initView();
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                login();
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
        if (password.length() < 1 || password == null) {
            ToastUtils.showLongToast(this, "密码不能为空");
            return;
        }

        LoginInfo info = new LoginInfo(account, MD5.getStringMD5(password));
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
    }
}
