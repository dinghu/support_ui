package com.fkh.support.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.fkh.support.ui.R;
import com.fkh.support.ui.widget.NoScrollViewPager;
import com.fkh.support.ui.widget.alphatab.AlphaTabsLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dinghu on 2019/4/3.
 */
public class HomeActivity extends BaseActivity {

    NoScrollViewPager mViewPager;
    View line1;
    AlphaTabsLayout alphaIndicator;

    public interface HomeListener {
        void onTabCreated();
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_home;
    }

    @Override
    protected void initView() {
        alphaIndicator = findViewById(R.id.alphaIndicator);
        line1 = findViewById(R.id.line1);
        mViewPager = findViewById(R.id.mViewPager);
    }

    protected void bindFragement(List<Fragment> fragments) {
        mViewPager.setOffscreenPageLimit(fragments.size() - 1);
        mViewPager.setAdapter(new MainAdapter(getSupportFragmentManager(), fragments));
        alphaIndicator.setViewPager(mViewPager);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private class MainAdapter extends FragmentPagerAdapter implements ViewPager.OnPageChangeListener {

        private List<Fragment> fragments = new ArrayList<>();

        public MainAdapter(FragmentManager fm, List<Fragment> fragments) {
            super(fm);
            fragments.addAll(fragments);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            if (0 == position) {
            } else if (2 == position) {
            } else if (3 == position) {
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }
}
