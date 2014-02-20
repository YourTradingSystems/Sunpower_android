package com.example.SunPower.screens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.SunPower.R;
import com.example.SunPower.screens.argumentarie.Argumentarie;

/**
 * Created by Denis on 19.02.14.
 */
public final class Home extends Activity implements View.OnClickListener {

    @Override
    public final void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.screen_home);
        findViewById(R.id.btnAdministrator_HS).setOnClickListener(this);
        findViewById(R.id.btnArgumentaire_HS).setOnClickListener(this);
        findViewById(R.id.btnEligibility_HS).setOnClickListener(this);
    }

    @Override
    public final void onClick(View _v) {
        switch (_v.getId()) {
            case R.id.btnAdministrator_HS:
                startActivity(new Intent(getBaseContext(), Administrator.class));
                break;

            case R.id.btnArgumentaire_HS:
                startActivity(new Intent(getBaseContext(), Argumentarie.class));
                break;

            case R.id.btnEligibility_HS:
                startActivity(new Intent(getBaseContext(), Eligibility.class));
                break;
        }
    }
}
