package frameworkdemo.com.jlm.frameworkdemo.fragment.fragmentmenu;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import frameworkdemo.com.jlm.frameworkdemo.R;
import frameworkdemo.com.jlm.frameworkdemo.activity.NavigationDrawerAdapter;
import frameworkdemo.com.jlm.frameworkdemo.activity.NavigationDrawerCallbacks;
import frameworkdemo.com.jlm.frameworkdemo.activity.NavigationItem;

public class NavigationDrawerFragment extends Fragment implements NavigationDrawerCallbacks {

    protected DrawerLayout mDrawerLayout;
    protected View mFragmentContainerView;


    TextView tv_logo;

    CircleImageView circleImageView;

    TextView tv_name;

    RecyclerView mDrawerList;

    private NavigationDrawerCallbacks mCallbacks;

//    private int mCurrentSelectedPosition = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
        mDrawerList = (RecyclerView) view.findViewById(R.id.drawerList);
        tv_logo = (TextView) view.findViewById(R.id.tv_logo);
        tv_name = (TextView) view.findViewById(R.id.tv_name);
        circleImageView = (CircleImageView) view.findViewById(R.id.circleImageView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mDrawerList.setLayoutManager(layoutManager);
        mDrawerList.setHasFixedSize(true);

        final List<NavigationItem> navigationItems = getMenu();
        NavigationDrawerAdapter adapter = new NavigationDrawerAdapter(navigationItems);
        adapter.setNavigationDrawerCallbacks(this);
        mDrawerList.setAdapter(adapter);
//        selectItem(mCurrentSelectedPosition);

        initHead();
        return view;
    }

    private void initHead() {
        tv_logo.setText("logo logo");
        circleImageView.setImageDrawable(getActivity().getResources().getDrawable(R.drawable.default_header_fang));
        tv_name.setText("成都省心宝汽车");
    }

    public void setup(int fragmentId, DrawerLayout drawerLayout) {
        mFragmentContainerView = getActivity().findViewById(fragmentId);
        mDrawerLayout = drawerLayout;
    }
    public boolean isDrawerOpen() {
        return mDrawerLayout != null && mDrawerLayout.isDrawerOpen(mFragmentContainerView);
    }

  /*  public ActionBarDrawerToggle getActionBarDrawerToggle() {
        return mActionBarDrawerToggle;
    }*/

    public DrawerLayout getDrawerLayout() {
        return mDrawerLayout;
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        selectItem(position);
    }

    public List<NavigationItem> getMenu() {
        List<NavigationItem> items = new ArrayList<>();
        items.add(new NavigationItem("数据服务", getResources().getDrawable(R.drawable.ic_menu_check)));
        items.add(new NavigationItem("客户看车", getResources().getDrawable(R.drawable.ic_menu_check)));
        items.add(new NavigationItem("客户管理", getResources().getDrawable(R.drawable.ic_menu_check)));
        items.add(new NavigationItem("工具助手", getResources().getDrawable(R.drawable.ic_menu_check)));
        items.add(new NavigationItem("白条金融", getResources().getDrawable(R.drawable.ic_menu_check)));
        items.add(new NavigationItem("服务中心", getResources().getDrawable(R.drawable.ic_menu_check)));
        return items;
    }


    private void selectItem(int position) {
//        mCurrentSelectedPosition = position;
        if (mDrawerLayout != null) {
            mDrawerLayout.closeDrawer(mFragmentContainerView);
        }
        if (mCallbacks != null) {
            mCallbacks.onNavigationDrawerItemSelected(position);
        }
        ((NavigationDrawerAdapter) mDrawerList.getAdapter()).selectPosition(position);
    }

    public void openDrawer() {
        mDrawerLayout.openDrawer(mFragmentContainerView);
    }

    public void closeDrawer() {
        mDrawerLayout.closeDrawer(mFragmentContainerView);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mCallbacks = (NavigationDrawerCallbacks) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException("Activity must implement NavigationDrawerCallbacks.");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallbacks = null;
    }

}
