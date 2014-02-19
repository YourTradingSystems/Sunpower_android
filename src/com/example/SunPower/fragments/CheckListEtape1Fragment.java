package com.example.SunPower.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.example.SunPower.R;

/**
 * Created by Eduard on 19.02.14.
 */
public final class CheckListEtape1Fragment extends Fragment implements OnClickListener {

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        return _inflater.inflate(R.layout.fragment_check_list1, _container, false);
    }



    @Override
    public final void onClick(final View _view) {

    }
}
