package com.makemepulse.sunpower.screens.home;

import android.widget.FrameLayout;
import android.widget.ImageButton;

/**
 * Class for handling click, touches etc on home screen.
 *
 * User: ZOG
 * Date: 26.02.14
 * Time: 9:08
 */
abstract class ViewInteractionHandler {

    protected static final void onClickBtnArg_SH(final FrameLayout _flArg_SH, final ImageButton _btnArg_SH) {
        AnimationWorker.animateArg(_flArg_SH, _btnArg_SH);
    }

    protected static final void onClickBtnChecklist_SH(final FrameLayout _flChecklist_SH, final ImageButton _btnChecklist_SH) {
        AnimationWorker.animateCheck(_flChecklist_SH, _btnChecklist_SH);
    }
}
