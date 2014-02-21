package com.example.SunPower.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.example.SunPower.R;

public final class CheckListEtape4Fragment extends Fragment {

    private String question1;
    private String question2;

    private RadioButton rbtnQuestion1Var1;
    private RadioButton rbtnQuestion2Var1;
    private RadioButton rbtnQuestion3Var1;
    private RadioButton rbtnQuestion4Var1;
    private RadioButton rbtnQuestion5Var1;
    private RadioButton rbtnQuestion6Var1;

    public static final CheckListEtape4Fragment create() {
        return new CheckListEtape4Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list4, _container, false);
        findViews(view);
        return view;
    }

    private final void findViews(View _view) {
        rbtnQuestion1Var1 = (RadioButton) _view.findViewById(R.id.rbtnEtap4Question1Var1);
        rbtnQuestion2Var1 = (RadioButton) _view.findViewById(R.id.rbtnEtap4Question2Var1);
        rbtnQuestion3Var1 = (RadioButton) _view.findViewById(R.id.rbtnEtap4Question3Var1);
        rbtnQuestion4Var1 = (RadioButton) _view.findViewById(R.id.rbtnEtap4Question4Var1);
        rbtnQuestion5Var1 = (RadioButton) _view.findViewById(R.id.rbtnEtap4Question5Var1);
        rbtnQuestion6Var1 = (RadioButton) _view.findViewById(R.id.rbtnEtap4Question6Var1);
    }

    private void saveAllFragment4Data() {
        if (rbtnQuestion1Var1.isChecked()) question1 = "OUI";
        else question1 = "NON";
        if (rbtnQuestion2Var1.isChecked()) question2 = "OUI";
        else question2 = "NON";

    }

}
