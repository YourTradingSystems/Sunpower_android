package com.makemepulse.sunpower.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.makemepulse.sunpower.R;

public final class CheckListEtape6Fragment extends Fragment {

    private String question1;
    private String question2;
    private int question3;

    private RadioButton rbtnQuestion1Var1;
    private RadioButton rbtnQuestion2Var1;
    private RadioButton rbtnQuestion3Var1;
    private Spinner sAnswer;

    public static final CheckListEtape6Fragment create() {
        return new CheckListEtape6Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list6, _container, false);
        findViews(view);
        return view;
    }

    private final void findViews(View _view) {
        rbtnQuestion1Var1 = (RadioButton) _view.findViewById(R.id.rbtnEtap6Question1Var1);
        rbtnQuestion2Var1 = (RadioButton) _view.findViewById(R.id.rbtnEtap6Question2Var1);
        rbtnQuestion3Var1 = (RadioButton) _view.findViewById(R.id.rbtnEtap6Question3Var1);
        sAnswer = (Spinner) _view.findViewById(R.id.sEtap6Answer3);
    }

    private void saveAllFragment6Data() {
        if (rbtnQuestion1Var1.isChecked()) question1 = "OUI";
        else question1 = "NON";
        if (rbtnQuestion2Var1.isChecked()) question2 = "OUI";
        else question2 = "NON";
        question3 = sAnswer.getSelectedItemPosition();
    }

}
