package com.makemepulse.sunpower.fragments;


import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.TextView;
import com.makemepulse.sunpower.R;

import static android.widget.LinearLayout.LayoutParams;

public final class CheckListEtape3Fragment extends Fragment {

    private String question1;
    private String question2;
    private String question3;

    private RadioButton rbtnQuestion1Var1;
    private RadioButton rbtnQuestion2Var1;
    private RadioButton rbtnQuestion3Var1;
    private TextView tvPopUp;

    public static final CheckListEtape3Fragment create() {
        return new CheckListEtape3Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list3, _container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        findViews();
    }

    private final void findViews() {
        rbtnQuestion1Var1 = (RadioButton) getView().findViewById(R.id.rbtnEtap3Question1Var1);
        rbtnQuestion2Var1 = (RadioButton) getView().findViewById(R.id.rbtnEtap3Question2Var1);
        rbtnQuestion3Var1 = (RadioButton) getView().findViewById(R.id.rbtnEtap3Question3Var1);
        tvPopUp = (TextView) getView().findViewById(R.id.tvCheckListEtap3PopUp);
    }

    private void saveAllFragment3Data() {
        if (rbtnQuestion1Var1.isChecked()) question1 = "OUI";
        else question1 = "NON";
        if (rbtnQuestion2Var1.isChecked()) question2 = "OUI";
        else question2 = "NON";
        if (rbtnQuestion3Var1.isChecked()) question3 = "OUI";
        else question3 = "NON";
    }

    private void showPopUp() {
        tvPopUp.setVisibility(View.VISIBLE);
    }

    private void hidePopUp() {
        tvPopUp.setVisibility(View.INVISIBLE);
    }

}
