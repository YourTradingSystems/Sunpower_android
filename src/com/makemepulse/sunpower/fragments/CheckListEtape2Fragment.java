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
public final class CheckListEtape2Fragment extends Fragment implements OnClickListener {
    private List<RadioButton> mRadioGroup;
    private View returnView;

    public static CheckListEtape2Fragment create(){
        return new CheckListEtape2Fragment();
    }

    private CheckListEtape2Fragment(){
        mRadioGroup = new ArrayList<RadioButton>();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        if(returnView == null)
            returnView =  _inflater.inflate(R.layout.fragment_check_list2, _container, false);
        else {
            final ViewGroup vg = (ViewGroup)returnView.getParent();
            vg.removeView(returnView);
        }
        return returnView;
    }

    private final void setOnClickListeners() {
        for(RadioButton rb: mRadioGroup)
            rb.setOnClickListener(this);
    }


    public final int getChecked() {
        if (niceList(mRadioGroup)){
            for (int i = 0; i < mRadioGroup.size(); i++) {
                if(mRadioGroup.get(i).isChecked())
                    return i;
            }
        }
        return -1;
    }

    private boolean niceList(final List<RadioButton> list) {
        return list != null && !list.isEmpty();
    }

    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);
        findViews();
        setOnClickListeners();
    }

    private final void findViews() {
        mRadioGroup.add((RadioButton)getView().findViewById(R.id.radioBtnBetween3kmAnd10km_FCL2));
        mRadioGroup.add((RadioButton)getView().findViewById(R.id.radioBtnUrbanLessThan3km_FCL2));
        mRadioGroup.add((RadioButton)getView().findViewById(R.id.radioBtnMoreThan10km_FCL2));
    }

    @Override
    public final void onClick(final View _view) {
        for (RadioButton rb: mRadioGroup) {
            if (_view == rb) rb.setChecked(true);
            else rb.setChecked(false);
        }
    }

}