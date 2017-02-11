package frameworkdemo.com.jlm.frameworkdemo.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.yanzhenjie.album.Album;

import java.util.List;

import butterknife.BindView;
import frameworkdemo.com.jlm.frameworkdemo.adapter.ViewHolder.BaseViewHolder;
import frameworkdemo.com.jlm.frameworkdemo.config.RequestConfig;
import frameworkdemo.com.jlm.frameworkdemo.R;
import frameworkdemo.com.jlm.frameworkdemo.activity.ActivityPhotoView;
import jp.wasabeef.glide.transformations.GrayscaleTransformation;

/**
 * AdapterGridImage
 * Created by jlm on 2016/11/4.
 */

public class AdapterGridImage extends BaseAppAdapter<String> {

    public AdapterGridImage(Activity activity, List<String> list) {
        super(activity, list);
    }

    private int maxImages = 9;

    /**
     * 设置最大选择几张图片
     */
    public void setMaxImages(int maxImages) {
        this.maxImages = maxImages;
    }

    /**
     * 如果不足最大图片数，末尾加一张加号的图片
     *
     * @return size
     */
    @Override
    public int getCount() {
        if (mList.size() >= maxImages) {
            return maxImages;
        } else {
            return mList.size() + 1;
        }
    }

    @Override
    public Object getItem(int i) {
        if (mList.size() > i) {
            return mList.get(i);
        }
        return null;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        ImageViewHolder holder;
        if (view == null) {
            view = mInflater.inflate(R.layout.item_gridimage, viewGroup, false);
            holder = new ImageViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ImageViewHolder) view.getTag();
        }


        if (mList.size() > i) {
            holder.image_remove.setVisibility(View.VISIBLE);
            String url = mList.get(i);
            Glide.with(mActivity).load(url).bitmapTransform(new GrayscaleTransformation(Glide.get(mActivity).getBitmapPool()))
                    .priority(Priority.HIGH).into(holder.image_item);

        } else {
            /**最后一张图片*/
            holder.image_remove.setVisibility(View.GONE);
            Glide.with(mActivity).load(R.mipmap.addimage).priority(Priority.HIGH).into(holder.image_item);
        }

        holder.image_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**删除图片*/
                mList.remove(i);
                notifyDataSetChanged();
            }
        });

        /**使用glide时不能给view设置tag，否则会抛出You must not call setTag() on a view Glide is targeting.因为防止图片加载错乱，glide中已经给该imageView设置过tag*/
        holder.image_item.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (mList.size() > i) {
                    /**查看大图*/
                    Intent intent = new Intent(mActivity, ActivityPhotoView.class);
                    intent.putExtra("url", mList.get(i));
                    mActivity.startActivity(intent);
                } else {
                    /**添加图片*/
                    Album.startAlbum(mActivity, RequestConfig.REQUEST_PHOTO, maxImages - mList.size());
                }
            }
        });

        return view;
    }


    class ImageViewHolder extends BaseViewHolder {

        @BindView(R.id.image_item)
        ImageView image_item;

        @BindView(R.id.image_remove)
        ImageView image_remove;

        ImageViewHolder(View convertView) {
            super(convertView);
        }
    }
}
