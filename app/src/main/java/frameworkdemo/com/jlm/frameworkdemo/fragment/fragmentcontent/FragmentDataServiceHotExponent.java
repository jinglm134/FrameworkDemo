package frameworkdemo.com.jlm.frameworkdemo.fragment.fragmentcontent;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import frameworkdemo.com.jlm.frameworkdemo.R;
import frameworkdemo.com.jlm.frameworkdemo.activity.Main2Activity;
import frameworkdemo.com.jlm.frameworkdemo.fragment.fragmentright.FragmentRight1;

/**
 * 数据服务-热门指数
 * Created by jaylim on 2017/4/13.
 */

public class FragmentDataServiceHotExponent extends Fragment implements View.OnClickListener {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof Main2Activity){
            drawerLayout=(DrawerLayout)((Main2Activity) context).findViewById(R.id.drawer);
        }
    }

    private TextView tv_filter_area;
    private TextView tv_filter_date;

    private DrawerLayout drawerLayout;

    public FragmentDataServiceHotExponent() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_data_service_hot_exponent, container, false);
        initView(view);
        setListener();
        return view;
    }

    private void setListener() {
        tv_filter_area.setOnClickListener(this);
        tv_filter_date.setOnClickListener(this);
    }

    private void initView(View view) {
        tv_filter_area = (TextView) view.findViewById(R.id.tv_filter_area);
        tv_filter_date = (TextView) view.findViewById(R.id.tv_filter_date);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_filter_area:
                FragmentRight1 fragmentRight = new FragmentRight1();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragment_right, fragmentRight).commit();
                drawerLayout.openDrawer(Gravity.END);
                break;
            case R.id.tv_filter_date:
                break;
        }
    }
}
