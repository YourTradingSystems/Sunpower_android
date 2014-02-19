package com.example.SunPower.screens.argumentarie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.SunPower.R;

/**
 * Created by Denis on 19.02.14.
 */
public final class Login extends Activity implements View.OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnConnect_LS:
                startActivity(new Intent(getBaseContext(), Home.class));
                break;
        }
    }
}
