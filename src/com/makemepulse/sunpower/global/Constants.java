package com.makemepulse.sunpower.global;

/**
 * contains global constants
 * User: ZOG
 * Date: 19.02.14
 * Time: 14:56
 */
public abstract class Constants {
    public static final int RESULT_LOAD_IMAGE = 1;

    /**
     * homepage
     */
    public static final float MINIMIZED_HEIGHT_PERCENT = 0.1f;
    public static final float TOP_SECTOR_SIZE_PERCENT                   = MINIMIZED_HEIGHT_PERCENT;
    public static final float CHECKLIST_START_Y_OFFSET_PERCENT          = MINIMIZED_HEIGHT_PERCENT;
    public static final float ARGUMENTARIE_START_Y_OFFSET_PERCENT       = 2 * MINIMIZED_HEIGHT_PERCENT;
    public static final int HOME_OPEN_CLOSE_ANIM_DURATION               = 300;

    /**
     * returns Compass Degree
     */
    public static final int COMPASS_PARTY_S = 0;
    public static final int COMPASS_PARTY_Se = 1;
    public static final int COMPASS_PARTY_E = 2;
    public static final int COMPASS_PARTY_Ne = 3;
    public static final int COMPASS_PARTY_N = 4;
    public static final int COMPASS_PARTY_No = 5;
    public static final int COMPASS_PARTY_O = 6;
    public static final int COMPASS_PARTY_So = 7;

    /**
     * returns checked radio button
     * for CheckList1
     */
    public static final int CHECKED_RB_COASTAL_ZONE = 0;
    public static final int CHECKED_RB_URBAN = 1;
    public static final int CHECKED_RB_SUBURBS = 2;
    public static final int CHECKED_RB_OPEN_SPACE = 3;
    public static final int CHECKED_RB_OPEN_TERRAIN = 4;
}