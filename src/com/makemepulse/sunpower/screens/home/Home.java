package com.makemepulse.sunpower.screens.home;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.makemepulse.sunpower.R;

/**
 * Created by Denis on 19.02.14.
 */
public final class Home extends FragmentActivity implements ViewTreeObserver.OnGlobalLayoutListener, View.OnClickListener {

    private RelativeLayout rlRoot_SH;
    private FrameLayout flArg_SH, flChecklist_SH, flTopSector_SH, flLead_SH;
    private ImageButton btnArg_SH, btnChecklist_SH;

    @Override
    public final void onCreate(final Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.screen_home);

        findViews();
        setListeners();
    }

    private final void findViews() {
        rlRoot_SH           = (RelativeLayout) findViewById(R.id.rlRoot_SH);
        flArg_SH            = (FrameLayout) findViewById(R.id.flArg_SH);
        flChecklist_SH      = (FrameLayout) findViewById(R.id.flChecklist_SH);
        flTopSector_SH      = (FrameLayout) findViewById(R.id.flTopSector_SH);
        flLead_SH           = (FrameLayout) findViewById(R.id.flLead_SH);
        btnArg_SH           = (ImageButton) findViewById(R.id.btnArg_SH);
        btnChecklist_SH     = (ImageButton) findViewById(R.id.btnChecklist_SH);
    }

    private final void setListeners() {
        rlRoot_SH.getViewTreeObserver().addOnGlobalLayoutListener(this);
        btnArg_SH.setOnClickListener(this);
        btnChecklist_SH.setOnClickListener(this);
    }

    /**
     * invoke when layouts size is calculated
     */
    @SuppressWarnings("deprecation")
    @Override
    public final void onGlobalLayout() {
        if (Build.VERSION.SDK_INT < 16) rlRoot_SH.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        else rlRoot_SH.getViewTreeObserver().removeOnGlobalLayoutListener(this);

        ViewWorker.initSizeAndPositionData(rlRoot_SH);

        ViewWorker.resizeTopSector(flTopSector_SH);
        ViewWorker.resizeAndMoveLead(flLead_SH);
        ViewWorker.resizeAndMoveArg(flArg_SH, btnArg_SH);
        ViewWorker.resizeAndMoveChecklist(flChecklist_SH, btnChecklist_SH);

        AnimationWorker.initPositionData(rlRoot_SH, btnArg_SH, btnChecklist_SH);
    }

    @Override
    public final void onClick(final View _view) {
        if (_view == btnArg_SH) {
            ViewInteractionHandler.onClickBtnArg_SH(flArg_SH, btnArg_SH);
        } else if (_view == btnChecklist_SH) {
            ViewInteractionHandler.onClickBtnChecklist_SH(flChecklist_SH, btnChecklist_SH);
        }
    }
}