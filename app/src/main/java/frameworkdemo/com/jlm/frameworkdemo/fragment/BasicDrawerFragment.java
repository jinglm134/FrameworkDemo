package frameworkdemo.com.jlm.frameworkdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 *
 * Created by jaylim on 2017/4/11.
 */

public class BasicDrawerFragment extends Fragment {

    protected View mFragmentContainerView;
    protected DrawerLayout mDrawerLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public BasicDrawerFragment() {
    }

    public BasicDrawerFragment(View fragmentContainerView, DrawerLayout drawerLayout) {
        mFragmentContainerView = fragmentContainerView;
        mDrawerLayout = drawerLayout;
    }

}
