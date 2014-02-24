package com.makemepulse.sunpower.screens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.makemepulse.sunpower.R;
import com.makemepulse.sunpower.screens.argumentarie.Argumentarie;
import com.makemepulse.sunpower.screens.checklist.Checklist;

/**
 * Created by Denis on 19.02.14.
 */
public final class Home extends Activity implements View.OnClickListener {

    private Button btnAdministrator_SH;
    private Button btnArgumentaire_SH;
    private Button btnCheckList_SH;

    @Override
    public final void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.screen_home);

        findViews();
        setListeners();
    }

    private final void findViews() {
        btnAdministrator_SH = (Button)findViewById(R.id.btnAdministrator_SH);
        btnArgumentaire_SH  = (Button)findViewById(R.id.btnArgumentaire_SH);
        btnCheckList_SH  = (Button)findViewById(R.id.btnCheckList_SH);
    }

    private final void setListeners() {
        btnAdministrator_SH.setOnClickListener(this);
        btnArgumentaire_SH.setOnClickListener(this);
        btnCheckList_SH.setOnClickListener(this);
    }

    @Override
    public final void onClick(View _v) {
        switch (_v.getId()) {
            case R.id.btnAdministrator_SH:
                startActivity(new Intent(getBaseContext(), Administrator.class));
                break;

            case R.id.btnArgumentaire_SH:
                startActivity(new Intent(getBaseContext(), Argumentarie.class));
                break;

            case R.id.btnCheckList_SH:
                startActivity(new Intent(getBaseContext(), Checklist.class));
                break;
        }
    }
}
