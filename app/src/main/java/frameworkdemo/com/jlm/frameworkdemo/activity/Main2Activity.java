package frameworkdemo.com.jlm.frameworkdemo.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.View;

import frameworkdemo.com.jlm.frameworkdemo.R;
import frameworkdemo.com.jlm.frameworkdemo.fragment.fragmentcontent.FragmentDataService;
import frameworkdemo.com.jlm.frameworkdemo.fragment.fragmentcontent.FragmentSeekCar;
import frameworkdemo.com.jlm.frameworkdemo.fragment.fragmentmenu.NavigationDrawerFragment;


public class Main2Activity extends ActionBarActivity implements NavigationDrawerCallbacks {

    private NavigationDrawerFragment mNavigationDrawerFragment;
    private DrawerLayout mDrawer;
    private FragmentDataService fragmentDataService;
    private FragmentSeekCar fragmentSeekCar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initView();
        setListener();
    }

    private void setListener() {
        mDrawer.addDrawerListener(new DrawerLayout.DrawerListener() {
            private boolean isMenu;

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                isMenu = drawerView.getTag().equals("START");
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // 打开手势滑动
                if (!isMenu) {
                    mDrawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED, Gravity.END);
                }
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                // 关闭手势滑动
                if (!isMenu) {
                    mDrawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED, Gravity.END);
                }
            }

            @Override
            public void onDrawerStateChanged(int newState) {
            }
        });
    }

    private void initView() {
        fragmentDataService = new FragmentDataService();
        fragmentSeekCar = new FragmentSeekCar();

        mDrawer = (DrawerLayout) findViewById(R.id.drawer);
        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment_menu);

        mNavigationDrawerFragment.setup(R.id.fragment_menu, mDrawer);

        // 关闭手势滑动
        mDrawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED, Gravity.END);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragmentDataService).commit();
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {

//        Bundle args = new Bundle();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (position) {
            case 0:
                /*args.putString("key", "1");
                fragmentDataService.setArguments(args);*/
                fragmentTransaction.replace(R.id.container, fragmentDataService).commit();
                break;
            case 1:
               /* args.putString("key", "2");
                fragmentDataServiceCarAnalysis.setArguments(args);*/
                fragmentTransaction.replace(R.id.container, fragmentSeekCar).commit();
                break;
            case 2:
//                args.putString("key", "3");
                break;
            case 3:
//                args.putString("key", "4");
                break;
            default:
                break;
        }
    }


    @Override
    public void onBackPressed() {
        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();

        else
            super.onBackPressed();
    }
}
