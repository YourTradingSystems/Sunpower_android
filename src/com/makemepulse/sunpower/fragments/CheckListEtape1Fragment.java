package com.makemepulse.sunpower.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.makemepulse.sunpower.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eduard on 19.02.14.
 */

public final class CheckListEtape1Fragment extends Fragment implements OnClickListener {

    private List<RadioButton> mRadioButtonList;
    private View returnView;

    public final static CheckListEtape1Fragment create() {
        return new CheckListEtape1Fragment();
    }

    private CheckListEtape1Fragment() {
        mRadioButtonList = new ArrayList<RadioButton>();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container,
                                   final Bundle _savedInstanceState) {
        if(returnView == null)
            returnView =  _inflater.inflate(R.layout.fragment_check_list1, _container, false);
        else {
            final ViewGroup vg = (ViewGroup)returnView.getParent();
            vg.removeView(returnView);
        }
        return returnView;
    }


    private final void findViews() {
        mRadioButtonList.add((RadioButton)getView().findViewById(R.id.radio_btn_coastal_zone_FCL1));
        mRadioButtonList.add((RadioButton)getView().findViewById(R.id.radio_btn_urban_FCL1));
        mRadioButtonList.add((RadioButton)getView().findViewById(R.id.radio_btn_suburbs_FCL1));
        mRadioButtonList.add((RadioButton)getView().findViewById(R.id.radio_btn_open_space_FCL1));
        mRadioButtonList.add((RadioButton)getView().findViewById(R.id.radio_btn_open_terrain_FCL1));
    }

    private final void setOnClickListeners() {
        for (RadioButton rb: mRadioButtonList)
            rb.setOnClickListener(this);
    }


    public final int getChecked() {
        if (niceList(mRadioButtonList))
            for (int i = 0; i < mRadioButtonList.size(); i++)
                if(mRadioButtonList.get(i).isChecked()) return i;
        return -1;
    }

    private final boolean niceList(final List<RadioButton> _list){
        return _list != null && !_list.isEmpty();
    }

    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);
        findViews();
        setOnClickListeners();
    }

    @Override
    public final void onClick(final View _view) {
        for (RadioButton rb: mRadioButtonList) {
            if (_view == rb) rb.setChecked(true);
            else rb.setChecked(false);
        }
    }
}
