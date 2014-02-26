package com.makemepulse.sunpower.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.makemepulse.sunpower.R;

/**
 * Created by Eduard on 20.02.14.
 */
public final class CheckListEtape11Fragment extends Fragment implements OnCheckedChangeListener {

    public final static int IDX_RADIO_BUTTON_OF_40 = 0;
    public final static int IDX_RADIO_BUTTON_40_60 = 1;
    public final static int IDX_RADIO_BUTTON_60_80 = 2;
    public final static int IDX_RADIO_BUTTON_OF_80 = 3;

    private RadioGroup mRadioGroup;

    private int mCheckedRadioButton = -1;

    public final static CheckListEtape11Fragment create() {
        return new CheckListEtape11Fragment();
    }


    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        return _inflater.inflate(R.layout.fragment_check_list11, _container, false);
    }


    private final void findViews() {
        mRadioGroup = (RadioGroup)getView().findViewById(R.id.rgEtap11);
    }

    private final void setCheckedChangeListener() {
        mRadioGroup.setOnCheckedChangeListener(this);
    }


    @Override
    public final void onCheckedChanged(final RadioGroup _group, final int _checkedId) {
        int radioButtonID = mRadioGroup.getCheckedRadioButtonId();
        View radioButton = mRadioGroup.findViewById(radioButtonID);
        mCheckedRadioButton = mRadioGroup.indexOfChild(radioButton);
    }

    public final int getmCheckedRadioButton() {
        return mCheckedRadioButton;
    }

    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);
        findViews();
        setCheckedChangeListener();
    }
}
