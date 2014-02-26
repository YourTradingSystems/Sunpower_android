package com.makemepulse.sunpower.screens.home;

import android.animation.ObjectAnimator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import static com.makemepulse.sunpower.global.Constants.*;

/**
 * User: ZOG
 * Date: 25.02.14
 * Time: 18:24
 */
abstract class AnimationWorker {

    //center position for buttons
    private static int mCenterX = 0;

    private static int mArgTopPos = 0;
    private static int mArgBottomPos = 0;
    //offsets to center of button arg
    private static int mOffsetYBtnArg = 0;
    private static int mOffsetXBtnArg = 0;

    private static int mCheckTopPos = 0;
    private static int mCheckBotPos = 0;
    //offsets to center of button check
    private static int mOffsetYBtnCheck = 0;
    private static int mOffsetXBtnCheck = 0;

    /**
     * Get and save positions for animations
     * @param _rlRoot_SH root layout
     * @param _btnArg_SH arg button
     * @param _btnChecklist_SH check button
     */
    protected static final void initPositionData(final RelativeLayout _rlRoot_SH,
                                                 final ImageButton _btnArg_SH, final ImageButton _btnChecklist_SH) {
        //Root layout's y position and height
        final int rootY = (int) _rlRoot_SH.getY();
        final int rootHeight = _rlRoot_SH.getHeight();
        final int rootWidth = _rlRoot_SH.getWidth();

        mCenterX = rootWidth / 2;

        final int topSectorHeight = (int) (rootHeight * TOP_SECTOR_SIZE_PERCENT);

        mArgTopPos = rootY + topSectorHeight;
        mArgBottomPos = (int) (rootY + rootHeight * (1 - ARGUMENTARIE_START_Y_OFFSET_PERCENT));
        mOffsetYBtnArg = _btnArg_SH.getHeight() / 2;
        mOffsetXBtnArg = _btnArg_SH.getWidth() / 2;

        mCheckTopPos = rootY + topSectorHeight;
        mCheckBotPos = (int) (rootY + rootHeight * (1 - CHECKLIST_START_Y_OFFSET_PERCENT));
        mOffsetYBtnCheck = _btnChecklist_SH.getHeight() / 2;
        mOffsetXBtnCheck = _btnChecklist_SH.getWidth() / 2;
    }

    /**
     * Start arg animation. Simultaneously animate layout and button.
     * Used in both directions.
     * @param _flArg_SH frame to animate
     * @param _btnArg_SH button to animate
     */
    protected static final void animateArg(final FrameLayout _flArg_SH, final ImageButton _btnArg_SH) {
        final int currentPos = (int) _flArg_SH.getY();
        //animation coordinates layout and button
        final int destLy, destBx;
        if (currentPos == mArgTopPos) {
            destLy = mArgBottomPos;
            destBx = mCenterX;
        } else {
            destLy = mArgTopPos;
            destBx = mOffsetXBtnArg;
        }

        //animate layout top-bottom
        final ObjectAnimator animatorL = ObjectAnimator.ofFloat(_flArg_SH, "y", destLy);
        animatorL.setDuration(HOME_OPEN_CLOSE_ANIM_DURATION);
        animatorL.start();

        //animate button top-bottom with layout
        final ObjectAnimator animatorBy = ObjectAnimator.ofFloat(_btnArg_SH, "y", destLy - mOffsetYBtnArg);
        animatorBy.setDuration(HOME_OPEN_CLOSE_ANIM_DURATION);
        animatorBy.start();

        //animate button left-center
        final ObjectAnimator animatorBx = ObjectAnimator.ofFloat(_btnArg_SH, "x", destBx - mOffsetXBtnArg);
        animatorBx.setDuration(HOME_OPEN_CLOSE_ANIM_DURATION);
        animatorBx.start();
    }

    /**
     * Start check animation. Simultaneously animate layout and button.
     * Used in both directions.
     * @param _flChecklist_SH frame to animate
     * @param _btnChecklist_SH button to animate
     */
    protected static final void animateCheck(final FrameLayout _flChecklist_SH, final ImageButton _btnChecklist_SH) {
        final int currentPos = (int) _flChecklist_SH.getY();
        //animation coordinates layout and button
        final int destLy, destBx;
        if (currentPos == mCheckTopPos) {
            destLy = mCheckBotPos;
            destBx = mCenterX;
        } else {
            destLy = mCheckTopPos;
            destBx = mOffsetXBtnCheck;
        }

        //animate layout top-bottom
        final ObjectAnimator animatorL = ObjectAnimator.ofFloat(_flChecklist_SH, "y", destLy);
        animatorL.setDuration(HOME_OPEN_CLOSE_ANIM_DURATION);
        animatorL.start();

        //animate button top-bottom with layout
        final ObjectAnimator animatorB = ObjectAnimator.ofFloat(_btnChecklist_SH, "y", destLy - mOffsetYBtnCheck);
        animatorB.setDuration(HOME_OPEN_CLOSE_ANIM_DURATION);
        animatorB.start();

        //animate button left-center
        final ObjectAnimator animatorBx = ObjectAnimator.ofFloat(_btnChecklist_SH, "x", destBx - mOffsetXBtnCheck);
        animatorBx.setDuration(HOME_OPEN_CLOSE_ANIM_DURATION);
        animatorBx.start();
    }
}