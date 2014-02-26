package com.makemepulse.sunpower.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.makemepulse.sunpower.R;

public final class CheckListEtape6Fragment extends Fragment {

    private String question1;
    private String question2;
    private int question3;

    private RadioButton rbtnRoof_FCL6;
    private RadioButton rbtnPresence_FCL6;
    private RadioButton rbtnStructuralConcrete_FCL6;
    private Spinner sYear_FCL6;

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
        rbtnRoof_FCL6 = (RadioButton) _view.findViewById(R.id.rbtnRoofVar1_FCL6);
        rbtnPresence_FCL6 = (RadioButton) _view.findViewById(R.id.rbtnPresenceVar1_FCL6);
        rbtnStructuralConcrete_FCL6 = (RadioButton) _view.findViewById(R.id.rbtnStructuralConcreteVar1_FCL6);
        sYear_FCL6 = (Spinner) _view.findViewById(R.id.sYear_FCL6);
    }

    private void saveAllFragment6Data() {
        if (rbtnRoof_FCL6.isChecked()) question1 = "OUI";
        else question1 = "NON";
        if (rbtnPresence_FCL6.isChecked()) question2 = "OUI";
        else question2 = "NON";
        question3 = sYear_FCL6.getSelectedItemPosition();
    }

}
