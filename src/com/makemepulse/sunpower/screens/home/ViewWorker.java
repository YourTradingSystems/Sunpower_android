package com.makemepulse.sunpower.screens.home;

import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import static com.makemepulse.sunpower.global.Constants.*;

/**
 * Helper class for resizing and repositioning views for home screen.
 * User: ZOG
 * Date: 25.02.14
 * Time: 17:23
 */
abstract class ViewWorker {

    /*
    used for calculating sizes frames with fragments
     */
    private static int mTopSectorHeight = 0;

    private static int mArgHeight = 0;
    private static int mArgStartPos = 0;

    private static int mChecklistHeight = 0;
    private static int mChecklistStartPos = 0;

    /**
     * Get and save view's sizes and positions.
     * Should be called first.
     * @param _rlRoot_SH root layout
     */
    protected static final void initSizeAndPositionData(final RelativeLayout _rlRoot_SH) {
        //Root layout's y position and height
        final int rootY = (int) _rlRoot_SH.getY();
        final int rootHeight = _rlRoot_SH.getHeight();

        //Calculate and save top sector height
        mTopSectorHeight = (int) (rootHeight * TOP_SECTOR_SIZE_PERCENT);

        //Calculate and save arg height and initial position
        mArgHeight = (int) (rootHeight - mTopSectorHeight - (rootHeight * CHECKLIST_START_Y_OFFSET_PERCENT));
        mArgStartPos = (int) (rootY + rootHeight * (1 - ARGUMENTARIE_START_Y_OFFSET_PERCENT));

        //Calculate and save checklist height and initial position
        mChecklistHeight = rootHeight - mTopSectorHeight;
        mChecklistStartPos = (int) (rootY + rootHeight * (1 - CHECKLIST_START_Y_OFFSET_PERCENT));
    }

    /**
     * Set height to top sector.
     * Should be called after initSizeAndPositionData().
     * @param _flTopSector_SH top sector layout
     */
    protected static final void resizeTopSector(final FrameLayout _flTopSector_SH) {
        _flTopSector_SH.getLayoutParams().height = mTopSectorHeight;
        _flTopSector_SH.requestLayout();
    }

    /**
     * Resize and set initial position of arg frame and button.
     * Should be called after initSizeAndPositionData();
     * @param _flArg_SH arg frame layout
     */
    protected static final void resizeAndMoveArg(final FrameLayout _flArg_SH,
                                                 final ImageButton _btnArg_SH) {
        //layout
        final RelativeLayout.LayoutParams paramsL = (RelativeLayout.LayoutParams) _flArg_SH.getLayoutParams();
        paramsL.height = mArgHeight;
        paramsL.setMargins(0, mArgStartPos, 0, -mArgHeight);
        _flArg_SH.requestLayout();

        //button
        final int btnArgHeight = _btnArg_SH.getHeight();
        ((RelativeLayout.LayoutParams) _btnArg_SH.getLayoutParams()).setMargins(0, mArgStartPos - btnArgHeight / 2, 0, 0);
        _btnArg_SH.requestLayout();
    }

    /**
     * Resize and set initial position of checklist frame.
     * Should be called after initSizeAndPositionData();
     * @param _flChecklist_SH
     */
    protected static final void resizeAndMoveChecklist(final FrameLayout _flChecklist_SH,
                                                       final ImageButton _btnChecklist_SH) {
        //layout
        final RelativeLayout.LayoutParams paramsL = (RelativeLayout.LayoutParams) _flChecklist_SH.getLayoutParams();
        paramsL.height = mChecklistHeight;
        paramsL.setMargins(0, mChecklistStartPos, 0, -mChecklistHeight);
        _flChecklist_SH.requestLayout();

        //button
        final int btnCheckHeight = _btnChecklist_SH.getHeight();
        ((RelativeLayout.LayoutParams) _btnChecklist_SH.getLayoutParams()).setMargins(0, mChecklistStartPos - btnCheckHeight / 2, 0, 0);
        _btnChecklist_SH.requestLayout();
    }
}