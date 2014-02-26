package com.makemepulse.sunpower.fragments.checklist_etape10;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.makemepulse.sunpower.R;

/**
 * Created by Eduard on 21.02.14.
 */

public final class CustomMovementSun extends View {

    private static final int EPS = 23;
    private int mPointerRadius;
    private Paint paintToggle;
    private Paint mCircletPaint;
    private Paint mCircletTogglePaint;
    private Paint textPaint;
    private int mAngle;
    private int mCircletPulmonary;

    public CustomMovementSun(final Context _context) {
        super(_context);
        init();
    }

    public CustomMovementSun(final Context _context, final AttributeSet _attrs) {
        super(_context, _attrs);
        init();
    }

    public CustomMovementSun(final Context _context, final AttributeSet _attrs, final int _defStyle) {
        super(_context, _attrs, _defStyle);
        init();
    }

    private final void init() {
        mPointerRadius = 0;
        mCircletPulmonary = 0;
        mAngle = 180;

        mCircletPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mCircletPaint.setColor(Color.WHITE);
        mCircletPaint.setStyle(Paint.Style.STROKE);
        mCircletPaint.setStrokeWidth(1);

        mCircletTogglePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mCircletTogglePaint.setColor(Color.WHITE);
        mCircletTogglePaint.setStyle(Paint.Style.STROKE);
        mCircletTogglePaint.setStrokeWidth(2);

        paintToggle = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintToggle.setColor(getContext().getResources().getColor(R.color.bg_screen_checklist));
        paintToggle.setStyle(Paint.Style.STROKE);
        paintToggle.setStyle(Paint.Style.FILL);

        textPaint = new Paint();
        textPaint.setTextSize(25);
        textPaint.setColor(Color.WHITE);
        textPaint.setTextAlign(Paint.Align.CENTER);
        final ViewTreeObserver obs = this.getViewTreeObserver();
        if (obs != null)
            obs.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw () {
                mPointerRadius = (int) (getHeight() / 3.5);
                mCircletPulmonary = mPointerRadius / 4;
                return true;
            }
        });
    }

    @Override
    protected final void onDraw(final Canvas _canvas) {
        drawCircle(_canvas); // draw Circle
        drawToggle(_canvas, mAngle); // draw Toggle
        drawTextInCenterCircle(_canvas); // Draw text in center circle
        drawTextInCircle(_canvas, mPointerRadius + mCircletPulmonary + 20);
    }

    private final void drawCircle(final Canvas _canvas) {
        _canvas.drawCircle(getWidth()/2, getHeight()/2,
                mPointerRadius, mCircletPaint);
    }

    private final void drawTextInCenterCircle(final Canvas _canvas) {
        textPaint.setTextSize(25);
        final int xPos = (_canvas.getWidth() / 2);
        final int yPos = (int) ((_canvas.getHeight() / 2) - ((textPaint.descent() + textPaint.ascent()) / 2)) ;

        if (getContext() != null){
            final String str1 = getContext().getString(R.string.orientation);
            final String str2 = getContext().getString(R.string.du_toit);

            _canvas.drawText(str1, xPos, yPos - 15, textPaint);
            _canvas.drawText(str2, xPos, yPos + 15, textPaint);
        }
    }


    private final void drawToggle(final Canvas _canvas, final int _angle) {
        int x = (int) (getWidth()/2 + mPointerRadius * Math.sin(Math.PI * _angle / 180));
        int y = (int) (getHeight()/2 + mPointerRadius * Math.cos(Math.PI * _angle / 180));
        _canvas.drawCircle(x, y, mCircletPulmonary, paintToggle);
        _canvas.drawCircle(x, y, mCircletPulmonary + 1, mCircletTogglePaint);
    }

    private final void drawTextInCircle(final Canvas _canvas, final int _radius) {
        for(int i = 0; i < 8; i++){
            int x = (int) (getWidth()/2 + _radius * Math.sin(Math.PI * i * 45 / 180));
            int y = (int) (getHeight()/2 + _radius * Math.cos(Math.PI * i * 45 / 180));
            String [] cardinal = getResources().getStringArray(R.array.cardinal);
            if (i % 2 == 0) textPaint.setTextSize(25);
            else textPaint.setTextSize(16);
            _canvas.drawText(cardinal[i], x, y + 10, textPaint);
        }
    }

    @Override
    public final boolean onTouchEvent(final MotionEvent _event) {
        int x = (int) _event.getX();
        int y = (int) _event.getY();
        switch (_event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                calcAndRedraw(x, y);
                break;
            case MotionEvent.ACTION_UP:
                correction();
                break;
        }
        return true;
    }


    private final double sideLength(final int _x1, final int _y1, final int _x2, final int _y2) {
        return Math.sqrt(Math.pow((_x2 - _x1), 2) + Math.pow((_y2 - _y1), 2));
    }


    private final void calcAndRedraw(final int _x, final int _y) {
        double a = sideLength(_x, _y, getWidth()/2, getHeight()/2 + mPointerRadius);
        double c = sideLength(_x, _y, getWidth()/2, getHeight()/2);
        double b = sideLength(getWidth()/2, getHeight()/2, getWidth()/2, getHeight()/2) + mPointerRadius;
        if (isNiceTriangle(a, b, c)){
            double k3 = Math.acos(((c * c) + (b * b)-(a * a)) / (2.0 * c * b));
            c = (int)(( k3 * 180) / Math.PI);
            if (_x < getWidth()/2) c = 2 * 180 - c;
            mAngle = (int) c;
            invalidate();
        }
    }

    private final boolean isNiceTriangle(final double _a, final double _b, final double _c) {
        return _a < _b + _c && _b < _a + _c && _c < _a + _b && _a != 0 && _b != 0 && _c != 0;
    }

    private final void correction() {
        int angle = mAngle;
        int part = mAngle / 45;
        mAngle = part * 45;
        if (Math.abs(angle - mAngle) > EPS) mAngle += 45;
        invalidate();
    }

    public final int getCompassDegree() {
        int res = mAngle / 45;
        if (res == 8) res = 0;
        return res;
    }

}
