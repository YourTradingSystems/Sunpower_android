package com.makemepulse.sunpower.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.makemepulse.sunpower.R;

import static android.view.View.OnClickListener;

public final class CheckListEtape15Fragment extends Fragment implements OnClickListener {

    private Button btnTop;
    private Button btnBottom;
    private Button btnRefresh;


    public static final CheckListEtape15Fragment create() {
        return new CheckListEtape15Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list15, _container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        findViews();
        setListeners();
    }

    private final void findViews() {
        btnTop = (Button) getView().findViewById(R.id.btnTop_FCL15);
        btnBottom = (Button) getView().findViewById(R.id.btnMiddle_FCL15);
        btnRefresh = (Button) getView().findViewById(R.id.btnRefresh_FCL15);
    }

    private final void setListeners() {
        btnTop.setOnClickListener(this);
        btnBottom.setOnClickListener(this);
        btnRefresh.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTop_FCL15:

                break;
            case R.id.btnMiddle_FCL15:

                break;
            case R.id.btnRefresh_FCL15:

                break;
        }

    }

}
