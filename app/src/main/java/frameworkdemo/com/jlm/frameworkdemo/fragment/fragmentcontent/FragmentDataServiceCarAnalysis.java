package frameworkdemo.com.jlm.frameworkdemo.fragment.fragmentcontent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import frameworkdemo.com.jlm.frameworkdemo.R;
import frameworkdemo.com.jlm.frameworkdemo.fragment.BasicDrawerFragment;
import frameworkdemo.com.jlm.frameworkdemo.fragment.fragmentright.FragmentRight2;

/**
 * 数据服务-车系分析
 * Created by jaylim on 2017/4/11.
 */

public class FragmentDataServiceCarAnalysis extends BasicDrawerFragment {
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
}
