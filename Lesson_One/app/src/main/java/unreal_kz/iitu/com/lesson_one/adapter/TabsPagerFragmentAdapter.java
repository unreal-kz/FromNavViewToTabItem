package unreal_kz.iitu.com.lesson_one.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import unreal_kz.iitu.com.lesson_one.fragment.FragmentTabThree;
import unreal_kz.iitu.com.lesson_one.fragment.FragmentTabTwo;
import unreal_kz.iitu.com.lesson_one.fragment.FragmentTabOne;

/**
 * Created by Unreal_KZ on 24.09.2015.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{"Message", "Like"};
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FragmentTabOne.getInstance();
            case 1:
                return FragmentTabTwo.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
