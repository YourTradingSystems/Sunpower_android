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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_home);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnAdministrator_HS:
                startActivity(new Intent(getBaseContext(), Administrator.class));
                break;

            case R.id.btnEligibility_HS:
                startActivity(new Intent(getBaseContext(), Eligibility.class));
                break;

            case R.id.btnArgumentaire_HS:
                startActivity(new Intent(getBaseContext(), Argumentarie.class));
                break;
        }
    }
}
