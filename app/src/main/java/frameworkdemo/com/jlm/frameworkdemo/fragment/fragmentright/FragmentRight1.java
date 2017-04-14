package frameworkdemo.com.jlm.frameworkdemo.fragment.fragmentright;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import frameworkdemo.com.jlm.frameworkdemo.R;
import frameworkdemo.com.jlm.frameworkdemo.view.barchart.BarChart;
import frameworkdemo.com.jlm.frameworkdemo.view.barchart.model.BarModel;
import lecho.lib.hellocharts.gesture.ContainerScrollType;
import lecho.lib.hellocharts.gesture.ZoomType;
import lecho.lib.hellocharts.model.ColumnChartData;
import lecho.lib.hellocharts.view.ColumnChartView;


/**
 * Created by jaylim on 2017/4/12.
 */

public class FragmentRight1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_right_1, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        BarChart mBarChart = (BarChart) view.findViewById(R.id.barChat);

        List<BarModel> barModelList = new ArrayList<>();
        barModelList.add(new BarModel("北京", 36f, 0xFFFF0000));
        barModelList.add(new BarModel("成都", 17f, 0xFFFF0000));
        barModelList.add(new BarModel("上海", 3f, 0xFFFF0000));
        barModelList.add(new BarModel("深圳", 99f, 0xFFFF0000));
        barModelList.add(new BarModel("重庆", 55f, 0xFFFF0000));
        barModelList.add(new BarModel("杭州", 9f, 0xFFFF0000));
        barModelList.add(new BarModel("长沙", 78f, 0xFFFF0000));
        barModelList.add(new BarModel("雄安", 39f, 0xFFFF0000));


        mBarChart.addBarList(barModelList);
        /* mBarChart.addBar(new BarModel("北京",36f, 0xFFFF0000));
        mBarChart.addBar(new BarModel("成都",17f,  0xFFFF0000));
        mBarChart.addBar(new BarModel("上海",3f, 0xFFFF0000));
        mBarChart.addBar(new BarModel("深圳",99f, 0xFFFF0000));
        mBarChart.addBar(new BarModel("重庆",55f, 0xFFFF0000));
        mBarChart.addBar(new BarModel("杭州",9f,  0xFFFF0000));
        mBarChart.addBar(new BarModel("长沙",78f, 0xFFFF0000));
        mBarChart.addBar(new BarModel("雄安",39f,  0xFFFF0000));*/


        mBarChart.startAnimation();

        /*ColumnChartView columnChartView= (ColumnChartView) view.findViewById(R.id.columnChartView);
        columnChartView.setColumnChartData();
        columnChartView.setZoomType(ZoomType.HORIZONTAL_AND_VERTICAL);
        columnChartView.setContainerScrollEnabled(true, ContainerScrollType.HORIZONTAL);

        ColumnChartData data=new ColumnChartData();*/

    }


}
