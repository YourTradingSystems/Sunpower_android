package com.makemepulse.sunpower.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;

import com.makemepulse.sunpower.R;

/**
 * Created by Eduard on 20.02.14.
 */

public final class CheckListEtape9Fragment extends Fragment {

    private EditText etEmailAddress_FCL9;
    private RadioButton rbtnOwner_FCL9;
    private RadioButton rbtnPrimaryResidence_FCL9;

    public static CheckListEtape9Fragment create() {
        return new CheckListEtape9Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list9, _container, false);
        return view;
    }

    private void findViews() {
        etEmailAddress_FCL9 = (EditText)getView().findViewById(R.id.etEmailAddress_FCL9);
        rbtnOwner_FCL9 = (RadioButton)getView().findViewById(R.id.rbtnOwnerVar1_FCL9);
        rbtnPrimaryResidence_FCL9 = (RadioButton)getView().findViewById(R.id.rbtnPrimaryResidenceVar1_FCL9);
    }

    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);
        findViews();
    }
}
