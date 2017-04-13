package frameworkdemo.com.jlm.frameworkdemo.fragment.fragmentcontent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import frameworkdemo.com.jlm.frameworkdemo.R;
import frameworkdemo.com.jlm.frameworkdemo.fragment.BasicDrawerFragment;

/**
 * 客户看车模块
 * Created by jaylim on 2017/4/13.
 */

public class FragmentSeekCar extends BasicDrawerFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_seek_car,container,false);
        return view;
    }
}
