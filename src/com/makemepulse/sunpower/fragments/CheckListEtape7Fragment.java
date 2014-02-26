package com.makemepulse.sunpower.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;

import com.makemepulse.sunpower.R;

import java.util.ArrayList;

public final class CheckListEtape7Fragment extends Fragment {

    private ArrayList<String> fragmentAnswers = new ArrayList<String>();

    private EditText etName_FCL7, etForename_FCL7, etAddress_FCL7, etPostalCode_FCL7, etCity_FCL7;
    private RadioButton rbtnOwner_FCL7;
    private EditText etSuchFixed_FCL7, etMobilePhone_FCL7, etSuchOffice_FCL7, etEmail_FCL7;
    private RadioButton rbtnPrimaryResidence_FCL7;

    public static final CheckListEtape7Fragment create() {
        return new CheckListEtape7Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list7, _container, false);
        //findViews(view);
        return view;
    }

    private final void findViews(View _view) {
        etName_FCL7 = (EditText) _view.findViewById(R.id.etName_FCL7);
        etForename_FCL7 = (EditText) _view.findViewById(R.id.etForename_FCL7);
        etAddress_FCL7 = (EditText) _view.findViewById(R.id.etAddress_FCL7);
        etPostalCode_FCL7 = (EditText) _view.findViewById(R.id.etPostalCode_FCL7);
        etCity_FCL7 = (EditText) _view.findViewById(R.id.etCity_FCL7);
        rbtnOwner_FCL7 = (RadioButton) _view.findViewById(R.id.rbtnOwnerVar1_FCL7);
        etSuchFixed_FCL7 = (EditText) _view.findViewById(R.id.etSuchFixed_FCL7);
        etMobilePhone_FCL7 = (EditText) _view.findViewById(R.id.etMobilePhone_FCL7);
        etSuchOffice_FCL7 = (EditText) _view.findViewById(R.id.etSuchOffice_FCL7);
        etEmail_FCL7 = (EditText) _view.findViewById(R.id.etEmail_FCL7);
        rbtnPrimaryResidence_FCL7 = (RadioButton) _view.findViewById(R.id.rbtnPrimaryResidenceVar1_FCL7);
    }

    private void getFragmentData() {
        fragmentAnswers.add(etName_FCL7.getText().toString());
        fragmentAnswers.add(etForename_FCL7.getText().toString());
        fragmentAnswers.add(etAddress_FCL7.getText().toString());
        fragmentAnswers.add(etPostalCode_FCL7.getText().toString());
        fragmentAnswers.add(etCity_FCL7.getText().toString());
        if (rbtnOwner_FCL7.isChecked()) fragmentAnswers.add("OUI");
        else fragmentAnswers.add("NON");
        fragmentAnswers.add(etSuchFixed_FCL7.getText().toString());
        fragmentAnswers.add(etMobilePhone_FCL7.getText().toString());
        fragmentAnswers.add(etSuchOffice_FCL7.getText().toString());
        fragmentAnswers.add(etEmail_FCL7.getText().toString());
        if (rbtnPrimaryResidence_FCL7.isChecked()) fragmentAnswers.add("OUI");
        else fragmentAnswers.add("NON");
    }

}
