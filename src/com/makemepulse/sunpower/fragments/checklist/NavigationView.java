package com.makemepulse.sunpower.fragments.checklist;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * User: ZOG
 * Date: 21.02.14
 * Time: 16:56
 */
final class NavigationView extends RelativeLayout {

    private TextView tvPosition;

    private int mCount = 0;
    private int mPosition = 0;

    public NavigationView(final Context _context, final AttributeSet _attrs) {
        super(_context, _attrs);

        tvPosition = new TextView(_context);
        tvPosition.setText(mPosition + "");

        addView(tvPosition);
    }

    public final void setCount(final int _count) {
        mCount = _count;
        mPosition = 0;
        tvPosition.setText(mPosition + "");
    }

    public final void setPosition(final int _position) {
        mPosition = _position > mCount || _position < 0 ? 0 : _position;

        tvPosition.setText(mPosition + "");
    }
}