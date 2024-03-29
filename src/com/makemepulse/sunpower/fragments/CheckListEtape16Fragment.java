package com.makemepulse.sunpower.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.makemepulse.sunpower.R;

import static android.view.View.OnClickListener;

public final class CheckListEtape16Fragment extends Fragment implements OnClickListener {

    private Button btnTop;
    private Button btnBottom;
    private Button btnRefresh;

    private View returnView;

    public static final CheckListEtape16Fragment create() {
        return new CheckListEtape16Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        if(returnView == null)
            returnView =  _inflater.inflate(R.layout.fragment_check_list16, _container, false);
        else {
            final ViewGroup vg = (ViewGroup)returnView.getParent();
            vg.removeView(returnView);
        }
        return returnView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        findViews();
        setListeners();
    }

    private final void findViews() {
        btnTop = (Button) getView().findViewById(R.id.btnTop_FCL16);
        btnBottom = (Button) getView().findViewById(R.id.btnMiddle_FCL16);
        btnRefresh = (Button) getView().findViewById(R.id.btnRefreshFCL16);
    }

    private final void setListeners() {
        btnTop.setOnClickListener(this);
        btnBottom.setOnClickListener(this);
        btnRefresh.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTop_FCL16:

                break;
            case R.id.btnMiddle_FCL16:

                break;
            case R.id.btnRefreshFCL16:

                break;
        }

    }

}
