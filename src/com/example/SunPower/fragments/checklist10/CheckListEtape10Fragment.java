package com.example.SunPower.fragments.checklist10;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.SunPower.R;

/**
 * Created by Eduard on 21.02.14.
 */
public final class CheckListEtape10Fragment extends Fragment {


    public static CheckListEtape10Fragment create(){
        return new CheckListEtape10Fragment();
    }


    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        return _inflater.inflate(R.layout.fragment_check_list10, _container, false);
    }


    private void findViews(){
        CustomMovementSun sunPosition = (CustomMovementSun) getView().findViewById(R.id.customMovementSun);
    }


    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);
        findViews();
    }
}
