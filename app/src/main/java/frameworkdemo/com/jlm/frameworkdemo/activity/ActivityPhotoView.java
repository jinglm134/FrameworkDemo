package frameworkdemo.com.jlm.frameworkdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import frameworkdemo.com.jlm.frameworkdemo.R;
import jp.wasabeef.glide.transformations.GrayscaleTransformation;
import uk.co.senab.photoview.PhotoView;

/**
 * ActivityPhotoView
 * Created by jlm on 2016/11/3.
 */

public class ActivityPhotoView extends BaseActivity {

    @BindView(R.id.photoView)
    PhotoView photoView;

    @Override
    public int getContentViewId() {
        return R.layout.activity_photoview;
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String url = getIntent().getStringExtra("url");
        if (url == null) {
            url = "http://i.imgur.com/SEPdUIx.jpg";
        }
        Glide.with(this).load(url).bitmapTransform(new GrayscaleTransformation(Glide.get(this).getBitmapPool())).into(photoView);
//        Glide.with(this).load("http://i.imgur.com/SEPdUIx.jpg").into(photoView);

//        photoView.setRotationTo(90);
//        PhotoViewAttacher mAttacher = new PhotoViewAttacher(photoView);
//        mAttacher.setOnPhotoTapListener(new PhotoViewAttacher.OnPhotoTapListener() {
//            @Override
//            public void onPhotoTap(View view, float x, float y) {
//                Log.e("tagX", x + "");
//                Log.e("tagY", y + "");
//            }
//        });
//
//        mAttacher.setOnMatrixChangeListener(new PhotoViewAttacher.OnMatrixChangedListener() {
//            @Override
//            public void onMatrixChanged(RectF rect) {
//                Log.e("tagRect", rect.toString());
//            }
//        });


    }
}
