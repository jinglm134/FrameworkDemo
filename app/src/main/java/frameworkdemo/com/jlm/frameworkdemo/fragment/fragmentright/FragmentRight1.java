package frameworkdemo.com.jlm.frameworkdemo.fragment.fragmentright;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import frameworkdemo.com.jlm.frameworkdemo.R;

/**
 * Created by jaylim on 2017/4/12.
 */

public class FragmentRight1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_right_1, container, false);
    }

}
