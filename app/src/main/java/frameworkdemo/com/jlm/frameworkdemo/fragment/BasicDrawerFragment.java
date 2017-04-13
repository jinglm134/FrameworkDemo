package frameworkdemo.com.jlm.frameworkdemo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import frameworkdemo.com.jlm.frameworkdemo.R;
import frameworkdemo.com.jlm.frameworkdemo.activity.Main2Activity;

/**
 *
 * Created by jaylim on 2017/4/11.
 */

public class BasicDrawerFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof Main2Activity){
            mDrawerLayout = (DrawerLayout)((Main2Activity) context).findViewById(R.id.drawer);
            mFragmentContainerView=((Main2Activity) context).findViewById(R.id.container);
        }
    }

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

}
