package com.makemepulse.sunpower.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import com.makemepulse.sunpower.R;

/**
 * Created by Eduard on 20.02.14.
 */

public final class CheckListEtape8Fragment extends Fragment {

    private RadioButton rbValueCurrentConsumption;

    public static CheckListEtape8Fragment create() {
        return new CheckListEtape8Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list8, _container, false);
        return view;
    }

    private void findViews() {
        rbValueCurrentConsumption = (RadioButton)getView().findViewById(R.id.rbtnEtap8Question1Var1);
    }

    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);
        findViews();
    }



}
