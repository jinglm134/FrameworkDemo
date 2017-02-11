package frameworkdemo.com.jlm.frameworkdemo.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import de.hdodenhof.circleimageview.CircleImageView;
import frameworkdemo.com.jlm.frameworkdemo.adapter.ViewHolder.BaseViewHolder;
import frameworkdemo.com.jlm.frameworkdemo.R;
import jp.wasabeef.glide.transformations.GrayscaleTransformation;

/**
 * AdapterGlideList
 * Created by jlm on 2016/11/2.
 */

public class AdapterGlideList extends BaseAppAdapter<String> {

    public AdapterGlideList(Activity activity, List<String> list) {
        super(activity, list);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        MyViewHolder holder;
        if (view == null) {
            view = mInflater.inflate(R.layout.item_glidelist, viewGroup, false);
            holder = new MyViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (MyViewHolder) view.getTag();
        }

        String url = mList.get(i);

        Glide.with(mActivity).load(url).
                bitmapTransform(new GrayscaleTransformation(Glide.get(mActivity).getBitmapPool()))
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .crossFade(300)
                .into(holder.imageView);
        return view;
    }


    class MyViewHolder extends BaseViewHolder {
        @BindView(R.id.imageView)
        CircleImageView imageView;

        MyViewHolder(View convertView) {
            super(convertView);
        }
    }
}
