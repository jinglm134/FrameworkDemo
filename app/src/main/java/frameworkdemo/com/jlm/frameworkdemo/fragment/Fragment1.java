package frameworkdemo.com.jlm.frameworkdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import frameworkdemo.com.jlm.frameworkdemo.R;

/**
 *
 * Created by jaylim on 2017/4/11.
 */

public class Fragment1 extends BasicDrawerFragment {
    private TextView tv_btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_content_1,container,false);
        tv_btn = (TextView)root.findViewById(R.id.tv_btn);
        initView();
        return root;
    }

    private void initView() {
        tv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentRight1 fragmentRight1=new FragmentRight1();
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragment_right,fragmentRight1).commit();
                mDrawerLayout.openDrawer(Gravity.END);
            }
        });
    }

    public Fragment1(View fragmentContainerView, DrawerLayout drawerLayout) {
        super(fragmentContainerView, drawerLayout);
    }
}
