package frameworkdemo.com.jlm.frameworkdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import frameworkdemo.com.jlm.frameworkdemo.adapter.AdapterGlideList;
import frameworkdemo.com.jlm.frameworkdemo.R;

/**
 * ActivityGlideList
 * Created by jlm on 2016/11/2.
 */

public class ActivityGlideList extends BaseActivity {

    @BindView(R.id.listView)
    ListView listView;

    private List<String> lists;

    @Override
    public int getContentViewId() {
        return R.layout.activity_glide_listview;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        AdapterGlideList adapter = new AdapterGlideList(this, lists);
        listView.setAdapter(adapter);
    }

    private void initData() {
        lists = new ArrayList<>();
        lists.add("http://i.imgur.com/rFLNqWI.jpg");
        lists.add("http://i.imgur.com/C9pBVt7.jpg");
        lists.add("http://i.imgur.com/rT5vXE1.jpg");
        lists.add("http://i.imgur.com/aIy5R2k.jpg");
        lists.add("http://i.imgur.com/MoJs9pT.jpg");
        lists.add("http://i.imgur.com/S963yEM.jpg");
        lists.add("http://i.imgur.com/rLR2cyc.jpg");
        lists.add("http://i.imgur.com/SEPdUIx.jpg");
        lists.add("http://i.imgur.com/aC9OjaM.jpg");
        lists.add("http://i.imgur.com/76Jfv9b.jpg");
        lists.add("http://i.imgur.com/fUX7EIB.jpg");
        lists.add("http://i.imgur.com/syELajx.jpg");
        lists.add("http://i.imgur.com/COzBnru.jpg");
        lists.add("http://i.imgur.com/Z3QjilA.jpg");
    }

}
