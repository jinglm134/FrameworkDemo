package frameworkdemo.com.jlm.frameworkdemo.activity;

import android.graphics.Color;
import android.webkit.WebView;

import butterknife.BindView;
import frameworkdemo.com.jlm.frameworkdemo.R;

/**
 * Created by jaylim on 2017/4/11.
 */

public class WebViewActivity extends BaseActivity {

    @BindView(R.id.webView)
    WebView mWebView;

    @Override
    public int getContentViewId() {
        return R.layout.activity_webview;
    }

    @Override
    protected void initView() {
        super.initView();
        /**设置编码方式*/
        mWebView.getSettings().setDefaultTextEncodingName("utf-8");
        /**设置背景透明*/
        mWebView.setBackgroundColor(Color.argb(0, 0, 0, 0));

        /**设置支持js*/
        mWebView.getSettings().setJavaScriptEnabled(true);
        /**设置支持缩放*/
        mWebView.getSettings().setSupportZoom(true);

        /***打开本地缓存提供JS调用**/
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.getSettings().setAppCacheMaxSize(1024 * 1024 * 8);
        mWebView.getSettings().setAllowFileAccess(true);
        mWebView.getSettings().setAppCacheEnabled(true);
        mWebView.loadUrl("http://192.168.0.130:3000/video");
    }
}
