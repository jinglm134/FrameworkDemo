package frameworkdemo.com.jlm.frameworkdemo.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * BaseAppAdapter
 * Created by jlm on 2016/11/2.
 */

abstract class BaseAppAdapter<T> extends BaseAdapter {

    Activity mActivity;
    List<T> mList;
    LayoutInflater mInflater;


    BaseAppAdapter(Activity activity, List<T> list) {

        if (list == null) {
            mList = new ArrayList<>();
        } else {
            mList = list;
        }

        this.mActivity = activity;
        this.mInflater = LayoutInflater.from(mActivity);

    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
}
