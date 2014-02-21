package com.example.SunPower.fragments;

        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.TextView;
        import com.example.SunPower.R;

/**
 * Created by Eduard on 19.02.14.
 */
public final class CheckListEtape0Fragment extends Fragment implements View.OnClickListener {

    private Button btnStartChecklist;
    private TextView tvParentProfile;
    private Button btnLeadChange;
    private Button btnNewLead;

    public static CheckListEtape0Fragment create(){
        return new CheckListEtape0Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list0, _container, false);
        findView(view);
        setBtnOnClickListener();
        return view;
    }

    public final void findView(final View _view){
        btnStartChecklist = (Button)_view.findViewById(R.id.btnStartChecklist);
        tvParentProfile = (TextView)_view.findViewById(R.id.tvParentProfile);
        btnLeadChange = (Button)_view.findViewById(R.id.btnLeadChange);
        btnNewLead = (Button)_view.findViewById(R.id.btnNewLead);
    }

    public final void setBtnOnClickListener(){
        btnStartChecklist.setOnClickListener(this);
        btnLeadChange.setOnClickListener(this);
        btnNewLead.setOnClickListener(this);
    }

    @Override
    public final void onClick(final View _view) {
        if(_view == btnStartChecklist){
            showCheckListEtap1();
        }
        if(_view == btnLeadChange){
            //showCheckListEtap1();
        }
        if(_view == btnNewLead){
            showCheckListEtap1();
        }
    }

    public final void showCheckListEtap1(){
    }
}

