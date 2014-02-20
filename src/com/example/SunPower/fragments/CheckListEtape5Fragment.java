package com.example.SunPower.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.example.SunPower.R;

public final class CheckListEtape5Fragment extends Fragment {

    private String question1;
    private String question2;

    private RadioButton rbtnQuestion1Var1;
    private RadioButton rbtnQuestion2Var1;

    private CheckListEtape5Fragment() {
    }

    public static final CheckListEtape5Fragment create() {
        return new CheckListEtape5Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {

        View view = _inflater.inflate(R.layout.fragment_check_list5, _container, false);

        rbtnQuestion1Var1 = (RadioButton) view.findViewById(R.id.rbtnEtap5Question1Var1);
        rbtnQuestion2Var1 = (RadioButton) view.findViewById(R.id.rbtnEtap5Question2Var1);

        return view;
    }

    private void saveAllFragment5Data() {
        if (rbtnQuestion1Var1.isChecked()) question1 = "OUI";
        else question1 = "NON";
        if (rbtnQuestion2Var1.isChecked()) question2 = "OUI";
        else question2 = "NON";

    }

}
