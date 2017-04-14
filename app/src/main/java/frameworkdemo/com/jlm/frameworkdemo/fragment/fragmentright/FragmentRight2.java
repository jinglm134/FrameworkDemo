package frameworkdemo.com.jlm.frameworkdemo.fragment.fragmentright;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import frameworkdemo.com.jlm.frameworkdemo.R;
import lecho.lib.hellocharts.view.ColumnChartView;

/**
 * 车系分析
 * Created by jaylim on 2017/4/12.
 */

public class FragmentRight2 extends Fragment {

//    private ColumnChartView columnChartView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_right_2, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
//        columnChartView=(ColumnChartView)view.findViewById(R.id.columnChartView);
    }

}
