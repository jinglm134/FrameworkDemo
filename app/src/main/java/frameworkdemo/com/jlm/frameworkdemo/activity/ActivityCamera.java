package frameworkdemo.com.jlm.frameworkdemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.GridView;
import android.widget.Toast;

import com.yanzhenjie.album.Album;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import frameworkdemo.com.jlm.frameworkdemo.adapter.AdapterGridImage;
import frameworkdemo.com.jlm.frameworkdemo.config.RequestConfig;
import frameworkdemo.com.jlm.frameworkdemo.R;

/**
 * ActivityCamera
 * Created by jlm on 2016/11/4.
 */

public class ActivityCamera extends BaseActivity {

    @BindView(R.id.gv_images)
    GridView gv_images;

    private AdapterGridImage mAdapter;
    private List<String> mLists;

    private static final int MAX_IMAGE = 9;


    @Override
    public int getContentViewId() {
        return R.layout.activity_camera;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mLists = new ArrayList<>();
        mAdapter = new AdapterGridImage(this, mLists);
        mAdapter.setMaxImages(MAX_IMAGE);
        gv_images.setAdapter(mAdapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != Activity.RESULT_OK) {
            return;
        }
        if (requestCode == RequestConfig.REQUEST_PHOTO) {

            mLists.addAll(Album.parseResult(data));
            //TODO 去重
            if (mLists.size() > MAX_IMAGE) {
                Toast.makeText(this, "最多只能上传" + MAX_IMAGE + "张图片", Toast.LENGTH_SHORT).show();
            }

            mAdapter.notifyDataSetChanged();
        }
    }

}
