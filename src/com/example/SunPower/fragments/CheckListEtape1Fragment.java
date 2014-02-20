package com.example.SunPower.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.example.SunPower.R;

/**
 * Created by Eduard on 19.02.14.
 */
public final class CheckListEtape1Fragment extends Fragment implements OnCheckedChangeListener {
    private RadioGroup radioGroupLeft;
    private RadioGroup radioGroupRight;

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list1, _container, false);
        findView(view);
        addCheckedChangeListener();
        return view;
    }

    public final void addCheckedChangeListener(){
        radioGroupRight.setOnCheckedChangeListener(this);
        radioGroupLeft.setOnCheckedChangeListener(this);
    }

    public final void findView(final View view){
        radioGroupLeft = (RadioGroup)view.findViewById(R.id.radio_group_left);
        radioGroupRight = (RadioGroup)view.findViewById(R.id.radio_group_right);
    }

    @Override
    public void onCheckedChanged(final RadioGroup _group, final int _checkedId) {
        if (_group == radioGroupLeft){
            if (radioGroupRight.getCheckedRadioButtonId() > 0){
                radioGroupRight.clearCheck();
            }
        }
        if(_group == radioGroupRight){
            if (radioGroupLeft.getCheckedRadioButtonId() > 0){
                radioGroupLeft.clearCheck();
            }

        }
    }

    public final int getChecked(){
        return -1;
    }
}
