package com.makemepulse.sunpower.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.makemepulse.sunpower.R;

import java.util.ArrayList;

public final class CheckListEtape7Fragment extends Fragment {

    private ArrayList<String> fragmentAnswers = new ArrayList<String>();

    private EditText etQuestion1, etQuestion2, etQuestion3, etQuestion4, etQuestion5;
    private RadioButton rbtnQuestion6Var1;
    private EditText etQuestion7, etQuestion8, etQuestion9, etQuestion10;
    private RadioButton rbtnQuestion11Var1;

    public static final CheckListEtape7Fragment create() {
        return new CheckListEtape7Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list7, _container, false);
        findViews(view);
        return view;
    }

    private final void findViews(View _view) {
        etQuestion1 = (EditText) _view.findViewById(R.id.etChecklistEtap7Question1);
        etQuestion2 = (EditText) _view.findViewById(R.id.etChecklistEtap7Question2);
        etQuestion3 = (EditText) _view.findViewById(R.id.etChecklistEtap7Question3);
        etQuestion4 = (EditText) _view.findViewById(R.id.etChecklistEtap7Question4);
        etQuestion5 = (EditText) _view.findViewById(R.id.etChecklistEtap7Question5);
        rbtnQuestion6Var1 = (RadioButton) _view.findViewById(R.id.rbtnEtap7Question6Var1);
        etQuestion7 = (EditText) _view.findViewById(R.id.etChecklistEtap7Question7);
        etQuestion8 = (EditText) _view.findViewById(R.id.etChecklistEtap7Question8);
        etQuestion9 = (EditText) _view.findViewById(R.id.etChecklistEtap7Question9);
        etQuestion10 = (EditText) _view.findViewById(R.id.etChecklistEtap7Question10);
        rbtnQuestion11Var1 = (RadioButton) _view.findViewById(R.id.rbtnEtap7Question11Var1);
    }

    private void getFragmentData() {
        fragmentAnswers.add(etQuestion1.getText().toString());
        fragmentAnswers.add(etQuestion2.getText().toString());
        fragmentAnswers.add(etQuestion3.getText().toString());
        fragmentAnswers.add(etQuestion4.getText().toString());
        fragmentAnswers.add(etQuestion5.getText().toString());
        if (rbtnQuestion6Var1.isChecked()) fragmentAnswers.add("OUI");
        else fragmentAnswers.add("NON");
        fragmentAnswers.add(etQuestion7.getText().toString());
        fragmentAnswers.add(etQuestion8.getText().toString());
        fragmentAnswers.add(etQuestion9.getText().toString());
        fragmentAnswers.add(etQuestion10.getText().toString());
        if (rbtnQuestion11Var1.isChecked()) fragmentAnswers.add("OUI");
        else fragmentAnswers.add("NON");
    }

}
