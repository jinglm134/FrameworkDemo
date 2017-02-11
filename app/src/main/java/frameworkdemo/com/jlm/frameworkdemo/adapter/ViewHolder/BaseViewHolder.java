package frameworkdemo.com.jlm.frameworkdemo.adapter.ViewHolder;

import android.view.View;

import butterknife.ButterKnife;

/**
 * BaseViewHolder
 * Created by jlm on 2016/11/2.
 */

public class BaseViewHolder {
    public BaseViewHolder(View convertView) {
        ButterKnife.bind(this, convertView);
    }

    public int position;
}
