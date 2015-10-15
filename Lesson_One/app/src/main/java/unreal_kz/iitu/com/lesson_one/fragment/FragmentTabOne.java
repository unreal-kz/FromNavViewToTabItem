package unreal_kz.iitu.com.lesson_one.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import unreal_kz.iitu.com.lesson_one.R;

/**
 * Created by Unreal_KZ on 24.09.2015.
 */
public class FragmentTabOne extends Fragment
{
    private static final int LAYOUT = R.layout.content_main;
    private View view;

    public static FragmentTabOne getInstance(){
        Bundle args = new Bundle();
        FragmentTabOne fragmentTabOne = new FragmentTabOne();
        fragmentTabOne.setArguments(args);
        return fragmentTabOne;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }
}
