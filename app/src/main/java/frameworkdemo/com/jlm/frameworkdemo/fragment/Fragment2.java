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
 * Created by jaylim on 2017/4/11.
 */

public class Fragment2 extends BasicDrawerFragment {
private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_content_2, container, false);
        textView=(TextView)view.findViewById(R.id.textView);
        setListener();
        return view;
    }

    private void setListener() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentRight2 fragmentRight2=new FragmentRight2();
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragment_right,fragmentRight2).commit();
                mDrawerLayout.openDrawer(Gravity.END);
            }
        });
    }

    public Fragment2(View fragmentContainerView, DrawerLayout drawerLayout) {
        super(fragmentContainerView, drawerLayout);
    }
}
