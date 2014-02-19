package com.example.SunPower.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.SunPower.R;

/**
 * Created by Eduard on 19.02.14.
 */
public final class CheckListEtape0Fragment extends Fragment {


    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list0, _container, false);
        findView(view);
        return view;
    }

    public final void findView(final View view){
    }
}
