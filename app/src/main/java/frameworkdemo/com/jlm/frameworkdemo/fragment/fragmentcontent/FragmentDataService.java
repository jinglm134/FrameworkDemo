package frameworkdemo.com.jlm.frameworkdemo.fragment.fragmentcontent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import frameworkdemo.com.jlm.frameworkdemo.R;
import frameworkdemo.com.jlm.frameworkdemo.fragment.BasicDrawerFragment;

/**
 * 数据服务
 * Created by jaylim on 2017/4/11.
 */

public class FragmentDataService extends BasicDrawerFragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private static final String[] TITLES = {"热门指数", "车系分析"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_data_service, container, false);
        initView(root);
        setListener();
        return root;
    }

    private void setListener() {

        /*tv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    private void initView(View root) {
        //        tv_btn = (TextView)root.findViewById(R.id.tv_btn);
        MyPagerAdapter mAdapter = new MyPagerAdapter(getActivity().getSupportFragmentManager());
        viewPager = (ViewPager) root.findViewById(R.id.viewPager);
        tabLayout = (TabLayout) root.findViewById(R.id.tabLayout);
//        tabLayout.addTab(new TabLayout.Tab().setText("热门指数"));

        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(mAdapter);
        //设置TabLayout的模式
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabsFromPagerAdapter(mAdapter);
    }


    class MyPagerAdapter extends FragmentPagerAdapter {

        MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new FragmentDataServiceHotExponent();
                case 1:
                    return new FragmentDataServiceCarAnalysis();
                default:
                   return null;
            }
        }

        @Override
        public int getCount() {
            return TITLES.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return TITLES[position];
        }
    }
}
