package com.makemepulse.sunpower.screens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.makemepulse.sunpower.R;
import com.makemepulse.sunpower.screens.home.Home;

/**
 * Created by Denis on 19.02.14.
 */
public final class Login extends Activity implements View.OnClickListener {

    private Button btnConnect_SL;

    @Override
    public final void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.screen_login);

        findViews();
        setListeners();
    }

    private final void findViews() {
        btnConnect_SL = (Button)findViewById(R.id.btnConnect_SL);
    }

    private final void setListeners() {
        btnConnect_SL.setOnClickListener(this);
    }

    @Override
    public final void onClick(View _v) {
        switch (_v.getId()) {
            case R.id.btnConnect_SL:
                startActivity(new Intent(getBaseContext(), Home.class));
                finish();
                break;
        }
    }
}
