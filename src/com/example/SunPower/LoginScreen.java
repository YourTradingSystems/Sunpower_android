package com.example.SunPower;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Denis on 19.02.14.
 */
public final class LoginScreen extends Activity implements View.OnClickListener{
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
                startActivity(new Intent(getBaseContext(), HomeScreen.class));
                break;
        }
    }
}
