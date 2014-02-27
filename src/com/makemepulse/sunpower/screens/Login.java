package com.makemepulse.sunpower.screens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.makemepulse.sunpower.R;
import com.makemepulse.sunpower.screens.home.Home;

/**
 * Created by Denis on 19.02.14.
 */
public final class Login extends Activity implements View.OnClickListener {

    private Button btnConnect_SL;
    private EditText etLogin_SL, etPass_SL;
    private TextView tvError_SL;
    private ImageView ivError_SL;

    @Override
    public final void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.screen_login);

        findViews();
        setListeners();

        setErrorHintVisibility(false);
    }

    private final void findViews() {
        btnConnect_SL       = (Button)findViewById(R.id.btnConnect_SL);
        etLogin_SL          = (EditText) findViewById(R.id.etLogin_SL);
        etPass_SL           = (EditText) findViewById(R.id.etPass_SL);
        tvError_SL          = (TextView) findViewById(R.id.tvError_SL);
        ivError_SL          = (ImageView) findViewById(R.id.ivError_SL);
    }

    private final void setListeners() {
        btnConnect_SL.setOnClickListener(this);
    }

    /**
     * Hadling clicks on views.
     * @param _v clicked view
     */
    @Override
    public final void onClick(View _v) {
        switch (_v.getId()) {
            case R.id.btnConnect_SL: onClickBtnConnect_SL(); break;
        }
    }

    private final void onClickBtnConnect_SL() {
        final String login = etLogin_SL.getText().toString();
        final String pass = etPass_SL.getText().toString();

//        if (login.isEmpty() || pass.isEmpty()) setErrorHintVisibility(true);

        startActivity(new Intent(getBaseContext(), Home.class));
        finish();
    }

    /**
     * Changes error hint visibility: VISIBLE or INVISIBLE.
     * @param _visible
     */
    private final void setErrorHintVisibility(final boolean _visible) {
        tvError_SL.setVisibility(_visible ? View.VISIBLE : View.GONE);
        ivError_SL.setVisibility(_visible ? View.VISIBLE : View.GONE);
    }
}
