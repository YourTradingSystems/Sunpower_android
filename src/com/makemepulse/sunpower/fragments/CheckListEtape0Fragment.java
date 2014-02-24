package com.makemepulse.sunpower.fragments;

        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.TextView;
        import com.makemepulse.sunpower.R;

/**
 * Created by Eduard on 19.02.14.
 */
public final class CheckListEtape0Fragment extends Fragment implements View.OnClickListener {

    private Button btnStartChecklist;
    private TextView tvParentProfile;
    private Button btnLeadChange;
    private Button btnNewLead;

    private CheckListEtape0Fragment(){}

    public static CheckListEtape0Fragment create(){
        return new CheckListEtape0Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        return  _inflater.inflate(R.layout.fragment_check_list0, _container, false);
    }

    private void findViews(){
        btnStartChecklist = (Button)getView().findViewById(R.id.btnStartChecklist);
        tvParentProfile = (TextView)getView().findViewById(R.id.tvParentProfile);
        btnLeadChange = (Button)getView().findViewById(R.id.btnLeadChange);
        btnNewLead = (Button)getView().findViewById(R.id.btnNewLead);
    }

    private void setBtnOnClickListener(){
        btnStartChecklist.setOnClickListener(this);
        btnLeadChange.setOnClickListener(this);
        btnNewLead.setOnClickListener(this);
    }

    @Override
    public final void onClick(final View _view) {
/*        if(_view == btnStartChecklist){
            showCheckListEtap1();
        }else if(_view == btnLeadChange){
            //showCheckListEtap1();
        }else if(_view == btnNewLead){
            showCheckListEtap1();
        }*/
    }

    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);
        findViews();
        setBtnOnClickListener();
    }
}

