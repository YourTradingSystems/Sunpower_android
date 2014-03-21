package com.makemepulse.sunpower.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.makemepulse.sunpower.R;

public final class CheckListEtape5Fragment extends Fragment {

    private String question1;
    private String question2;

    private RadioButton rbtnQuestion1Var1;
    private RadioButton rbtnQuestion2Var1;

    private View returnView;

    public static final CheckListEtape5Fragment create() {
        return new CheckListEtape5Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        if(returnView == null)
            returnView =  _inflater.inflate(R.layout.fragment_check_list5, _container, false);
        else {
            final ViewGroup vg = (ViewGroup)returnView.getParent();
            vg.removeView(returnView);
        }
        return returnView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        findViews();
    }

    private final void findViews() {
        rbtnQuestion1Var1 = (RadioButton) getView().findViewById(R.id.rbtnQuestion1Var1_FCL5);
        rbtnQuestion2Var1 = (RadioButton) getView().findViewById(R.id.rbtnQuestion2Var1_FCL5);
    }

    /*
     * save user input data
     */

    private void saveAllFragment5Data() {
        if (rbtnQuestion1Var1.isChecked()) question1 = "OUI";
        else question1 = "NON";
        if (rbtnQuestion2Var1.isChecked()) question2 = "OUI";
        else question2 = "NON";

    }

}
