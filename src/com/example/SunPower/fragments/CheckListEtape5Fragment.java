package com.example.SunPower.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.example.SunPower.R;

public final class CheckListEtape5Fragment extends Fragment implements CompoundButton.OnCheckedChangeListener {

    private String question1;
    private String question2;

    private CheckListEtape5Fragment() {
    }

    public static final CheckListEtape5Fragment create() {
        return new CheckListEtape5Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {

        final RadioButton rbtnQuestion1Var1 = (RadioButton) getView().findViewById(R.id.rbtnEtap5Question1Var1);
        final RadioButton rbtnQuestion1Var2 = (RadioButton) getView().findViewById(R.id.rbtnEtap5Question1Var2);
        final RadioButton rbtnQuestion2Var1 = (RadioButton) getView().findViewById(R.id.rbtnEtap5Question2Var1);
        final RadioButton rbtnQuestion2Var2 = (RadioButton) getView().findViewById(R.id.rbtnEtap5Question2Var2);

        rbtnQuestion1Var1.setOnCheckedChangeListener(this);
        rbtnQuestion1Var2.setOnCheckedChangeListener(this);
        rbtnQuestion2Var1.setOnCheckedChangeListener(this);
        rbtnQuestion2Var2.setOnCheckedChangeListener(this);

        return _inflater.inflate(R.layout.fragment_check_list5, _container, false);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.rbtnEtap5Question1Var1 :
                if (isChecked) question1 = "OUI";
                break;
            case R.id.rbtnEtap5Question1Var2 :
                if (isChecked) question1 = "NON";
                break;
            case R.id.rbtnEtap5Question2Var1 :
                if (isChecked) question2 = "OUI";
                break;
            case R.id.rbtnEtap5Question2Var2 :
                if (isChecked) question2 = "NON";
                break;
        }
    }

}
