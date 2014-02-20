package com.example.SunPower.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.example.SunPower.R;

/**
 * Created by Eduard on 19.02.14.
 */
public final class CheckListEtape2Fragment extends Fragment implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup radioGroup;

    private CheckListEtape2Fragment(){}

    public static CheckListEtape2Fragment create(){
        return new CheckListEtape2Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list2, _container, false);
        findView(view);
        addCheckedChangeListener();
        return view;
    }

    public final void addCheckedChangeListener(){
        radioGroup.setOnCheckedChangeListener(this);
    }

    public final void findView(final View view){
        radioGroup = (RadioGroup)view.findViewById(R.id.radio_group_left);
    }

    @Override
    public void onCheckedChanged(final RadioGroup _group, final int _checkedId) {
        if (_group == radioGroup){
        }
    }

    public final int getChecked(){
        return -1;
    }
}