package com.makemepulse.sunpower.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
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

    private List<RadioButton> radioButtonList;

    public static CheckListEtape1Fragment create(){
        return new CheckListEtape1Fragment();
    }

    private CheckListEtape1Fragment(){
        radioButtonList = new ArrayList<RadioButton>();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        return  _inflater.inflate(R.layout.fragment_check_list1, _container, false);
    }


    private void findViews(){
        radioButtonList.add((RadioButton)getView().findViewById(R.id.radio_btn_coastal_zone));
        radioButtonList.add((RadioButton)getView().findViewById(R.id.radio_btn_urban));
        radioButtonList.add((RadioButton)getView().findViewById(R.id.radio_btn_suburbs));
        radioButtonList.add((RadioButton)getView().findViewById(R.id.radio_btn_open_space));
        radioButtonList.add((RadioButton)getView().findViewById(R.id.radio_btn_open_terrain));
    }

    private void setOnClickListeners(){
        for(RadioButton rb: radioButtonList)
            rb.setOnClickListener(this);
    }


    public final int getChecked(){
        if (niceList(radioButtonList)){
            for(int i = 0; i < radioButtonList.size(); i++){
                if(radioButtonList.get(i).isChecked())
                    return i;
            }
        }
        return -1;
    }

    private boolean niceList(final List<RadioButton> list){
        return list != null && !list.isEmpty();
    }

    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);
        findViews();
        setOnClickListeners();
    }

    @Override
    public void onClick(final View _view) {
        for(RadioButton rb: radioButtonList){
            if(_view == rb)
                rb.setChecked(true);
            else
                rb.setChecked(false);
        }
        Log.i("Click", "> " + getChecked());
    }
}
