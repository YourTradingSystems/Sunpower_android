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


    public static final CheckListEtape16Fragment create() {
        return new CheckListEtape16Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list16, _container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        findViews();
        setListeners();
    }

    private final void findViews() {
        btnTop = (Button) getView().findViewById(R.id.btnCheckListEtap16Up);
        btnBottom = (Button) getView().findViewById(R.id.btnCheckListEtap16Down);
        btnRefresh = (Button) getView().findViewById(R.id.btnCheckListEtap16Refresh);
    }

    private final void setListeners() {
        btnTop.setOnClickListener(this);
        btnBottom.setOnClickListener(this);
        btnRefresh.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCheckListEtap16Up:

                break;
            case R.id.btnCheckListEtap16Down:

                break;
            case R.id.btnCheckListEtap16Refresh:

                break;
        }

    }

}
