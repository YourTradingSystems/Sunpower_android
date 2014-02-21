package com.example.SunPower.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.example.SunPower.R;

public final class CheckListEtape5Fragment extends Fragment {

    private String question1;
    private String question2;

    private RadioButton rbtnQuestion1Var1;
    private RadioButton rbtnQuestion2Var1;

    public static final CheckListEtape5Fragment create() {
        return new CheckListEtape5Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list5, _container, false);
        findViews(view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        findViews();
    }

    private final void findViews(View _view) {
        rbtnQuestion1Var1 = (RadioButton) _view.findViewById(R.id.rbtnEtap5Question1Var1);
        rbtnQuestion2Var1 = (RadioButton) _view.findViewById(R.id.rbtnEtap5Question2Var1);
    }

    private void saveAllFragment5Data() {
        if (rbtnQuestion1Var1.isChecked()) question1 = "OUI";
        else question1 = "NON";
        if (rbtnQuestion2Var1.isChecked()) question2 = "OUI";
        else question2 = "NON";

    }

}
