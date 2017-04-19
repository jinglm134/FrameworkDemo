package frameworkdemo.com.jlm.frameworkdemo.fragment.fragmentright;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;
import java.util.List;

import frameworkdemo.com.jlm.frameworkdemo.R;
import frameworkdemo.com.jlm.frameworkdemo.view.barchart.BarChart;
import frameworkdemo.com.jlm.frameworkdemo.view.barchart.model.BarModel;


/**
 *
 * Created by jaylim on 2017/4/12.
 */

public class FragmentRight1 extends Fragment  implements OnChartValueSelectedListener {

    private com.github.mikephil.charting.charts.BarChart mChart;
    private ArrayList<String> xVals;
    private ArrayList<BarEntry> yVals;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_right_1, container, false);
        init(view);

        mChart = (com.github.mikephil.charting.charts.BarChart) view.findViewById(R.id.barChart);
        initXVal();
        initYVal();
        initBarChart();
        setListener();

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
        mBarChart.startAnimation();
    }



    private void setListener() {
        mChart.setOnChartValueSelectedListener(this);
    }

    private void initYVal() {
        yVals = new ArrayList<>();
        yVals.add(new BarEntry(0, 30));
        yVals.add(new BarEntry(1, 20));
        yVals.add(new BarEntry(2, 60));
        yVals.add(new BarEntry(3, 80));
        yVals.add(new BarEntry(4, 40));
        yVals.add(new BarEntry(5, 90));
        yVals.add(new BarEntry(6, 10));
    }

    private void initXVal() {
        xVals = new ArrayList<>();
        xVals.add("成都");
        xVals.add("雄安");
        xVals.add("北京");
        xVals.add("上海");
        xVals.add("杭州");
        xVals.add("南京");
        xVals.add("西安");
    }

    private void initBarChart() {

        mChart.getDescription().setEnabled(false);
        mChart.setMaxVisibleValueCount(60);
        mChart.setPinchZoom(false);
        mChart.setDrawBarShadow(false);
        mChart.setDrawGridBackground(false);

         /*底部X轴设置*/
        XAxis xAxis = mChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setValueFormatter(new MyXAxisValueFormatter(xVals));//格式化x轴的文本
        xAxis.setGranularity(1.0f);


        mChart.getAxisLeft().setEnabled(false);//设置左边Y轴无效
        mChart.getAxisRight().setEnabled(false);//设置有右边Y轴无效
        mChart.getLegend().setEnabled(false);//

//      mChart.setTouchEnabled(false);// 关闭与图表的所有触摸交互的情况。
//        mChart.setDragEnabled(false);//关闭对图表的拖动
//        mChart.setScaleEnabled(false);//关闭对图表所有轴的的缩放
        setData();
    }

    public void setData() {


        BarDataSet set1 = new BarDataSet(yVals, "各省份热度");
//        set1.setColors(ColorTemplate.VORDIPLOM_COLORS);
        set1.setDrawValues(false);

        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);


        BarData data = new BarData(dataSets);

        data.setBarWidth(0.75f);
        mChart.setData(data);
        mChart.setFitBars(true);

        mChart.animateXY(2000, 2000);//图表数据显示动画
        mChart.setVisibleXRangeMaximum(12);//设置x轴最多显示数据条数，（要在设置数据源后调用，否则是无效的）
        mChart.invalidate();
    }

    @Override
    public void onValueSelected(Entry entry, Highlight highlight) {
        if (entry == null) {
            return;
        }
        BarEntry barEntry = (BarEntry) entry;
        int position = (int) barEntry.getX();
        Toast.makeText(getActivity(), "click" + position, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected() {

    }


    public class MyXAxisValueFormatter implements IAxisValueFormatter {
        private List<String> labels;

        public MyXAxisValueFormatter(List<String> labels) {
            this.labels = labels;
        }

        @Override
        public String getFormattedValue(float value, AxisBase axis) {
            try {
                int index = (int) value;
                return labels.get(index);
            } catch (Exception e) {
                return "";
            }
        }
    }

}
