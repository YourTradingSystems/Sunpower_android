package com.makemepulse.sunpower.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.makemepulse.sunpower.R;

public final class CheckListEtape3Fragment extends Fragment {

    private String question1;
    private String question2;
    private String question3;

    private RadioButton rbtnQuestion1Var1;
    private RadioButton rbtnQuestion2Var1;
    private RadioButton rbtnQuestion3Var1;
    private TextView tvPopUp;

    private View returnView;

    public static final CheckListEtape3Fragment create() {
        return new CheckListEtape3Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        if(returnView == null)
            returnView =  _inflater.inflate(R.layout.fragment_check_list3, _container, false);
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
        rbtnQuestion1Var1 = (RadioButton) getView().findViewById(R.id.rbtnQuestion1Var1_FCL3);
        rbtnQuestion2Var1 = (RadioButton) getView().findViewById(R.id.rbtnQuestion2Var1_FCL3);
        rbtnQuestion3Var1 = (RadioButton) getView().findViewById(R.id.rbtnQuestion3Var1_FCL3);
        tvPopUp = (TextView) getView().findViewById(R.id.tvPopUp_FCL3);
    }

    /**
     * save user input data
     */

    private void saveAllFragment3Data() {
        if (rbtnQuestion1Var1.isChecked()) question1 = "OUI";
        else question1 = "NON";
        if (rbtnQuestion2Var1.isChecked()) question2 = "OUI";
        else question2 = "NON";
        if (rbtnQuestion3Var1.isChecked()) question3 = "OUI";
        else question3 = "NON";
    }


    /**
     * show popUp window
     */

    private void showPopUp() {
        tvPopUp.setVisibility(View.VISIBLE);
    }

    /**
     * hide popUp window
     */

    private void hidePopUp() {
        tvPopUp.setVisibility(View.INVISIBLE);
    }

}
