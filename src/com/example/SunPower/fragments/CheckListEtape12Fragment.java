package com.example.SunPower.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.SunPower.R;

/**
 * Created by Eduard on 20.02.14.
 */

public final class CheckListEtape12Fragment extends Fragment {

    private TextView tvValueAddress;
    private TextView tvValueOrientation;
    private TextView tvValueArea;
    private TextView tvValueProduction;
    private TextView tvValueIncome;


    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list12, _container, false);
        findView(view);
        return view;
    }

    public final void findView(final View _view){
        if (_view != null){
            tvValueAddress = (TextView)_view.findViewById(R.id.tvValueAddress);
            tvValueOrientation = (TextView)_view.findViewById(R.id.tvValueOrientation);
            tvValueArea = (TextView)_view.findViewById(R.id.tvValueArea);
            tvValueProduction = (TextView)_view.findViewById(R.id.tvValueProduction);
            tvValueIncome = (TextView)_view.findViewById(R.id.tvValueIncome);
        }
    }


    public void setTvValueAddress(final String _value) {
        tvValueAddress.setText(_value);
    }

    public void setTvValueOrientation(final String _value) {
        tvValueOrientation.setText(_value);
    }

    public void setTvValueArea(final String _value) {
        tvValueArea.setText(_value);
    }

    public void setTvValueProduction(final String _value) {
        tvValueProduction.setText(_value);
    }

    public void setTvValueIncome(final String _value) {
        tvValueIncome.setText(_value);
    }



}
