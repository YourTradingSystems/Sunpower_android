package com.example.SunPower.fragments.checklist10;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.example.SunPower.R;

/**
 * Created by Eduard on 21.02.14.
 */
public final class CustomMovementSun extends View {

    private int mPointerRadius;
    private Paint paintToggle;
    private float[] pointerPosition;
    private Paint mCircletPaint;
    private Paint mCircletTogglePaint;
    private Paint textPaint;
    private int mAngle;
    float aa = 0;
    float bb = 0;

    public CustomMovementSun(final Context _context) {
        super(_context);
        init(null);
    }

    public CustomMovementSun(final Context _context, final AttributeSet _attrs) {
        super(_context, _attrs);
        init(_attrs);
    }

    public CustomMovementSun(final Context _context, final AttributeSet _attrs, final int _defStyle) {
        super(_context, _attrs, _defStyle);
        init(_attrs);
    }

    private void init(final AttributeSet _attrs) {
        mPointerRadius = 120;
        mAngle = 180;

        mCircletPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mCircletPaint.setColor(Color.WHITE);
        mCircletPaint.setStyle(Paint.Style.STROKE);
        mCircletPaint.setStrokeWidth(1);

        mCircletTogglePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mCircletTogglePaint.setColor(Color.WHITE);
        mCircletTogglePaint.setStyle(Paint.Style.STROKE);
        mCircletTogglePaint.setStrokeWidth(2);

        textPaint = new Paint();
        textPaint.setTextSize(25);
        textPaint.setColor(Color.WHITE);
        textPaint.setTextAlign(Paint.Align.CENTER);

    }



    @Override
    protected final void onDraw(final Canvas _canvas) {
        drawCircle(_canvas); // draw Circle
        drawToggle(_canvas, mAngle); // draw Toggle
        drawTextInCenterCircle(_canvas); // Draw text in center circle
        drawTextInCircle(_canvas, mPointerRadius + 35);
        drawTriangle(_canvas);

    }


    private void drawCircle(final Canvas _canvas){
        _canvas.drawCircle(getWidth()/2, getHeight()/2,
                mPointerRadius, mCircletPaint);
    }

    private void drawTextInCenterCircle(final Canvas _canvas){
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


    private void drawToggle(final Canvas _canvas, final int _angle){
        int x = (int) (getWidth()/2 + mPointerRadius * Math.sin(Math.PI * _angle / 180));
        int y = (int) (getHeight()/2 + mPointerRadius * Math.cos(Math.PI * _angle / 180));
        _canvas.drawCircle(x, y, 25, mCircletTogglePaint);
    }

    private void drawTextInCircle(final Canvas _canvas, final int _radius){
        for(int i = 0; i < 8; i++){
            int x = (int) (getWidth()/2 + _radius * Math.sin(Math.PI * i * 45 / 180));
            int y = (int) (getHeight()/2 + _radius * Math.cos(Math.PI * i * 45 / 180));
            String [] cardinal = getResources().getStringArray(R.array.cardinal);
            if (i % 2 == 0)
                textPaint.setTextSize(25);
            else
                textPaint.setTextSize(16);
            _canvas.drawText(cardinal[i], x, y + 10, textPaint);
        }
    }

    @Override
    public final boolean onTouchEvent(final MotionEvent _event) {
        int x = (int)_event.getX();
        int y = (int)_event.getY();

        aa = x;
        bb = y;

        switch (_event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("onTouchEvent", "   DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                mAngle = (int) java.lang.Math.atan2(y, x);
                int a = sideLength(x, y, getWidth()/2, getHeight()/2 + mPointerRadius);
                int c = sideLength(x, y, getWidth()/2, getHeight()/2);
                int b = sideLength(getWidth()/2, getHeight()/2, getWidth()/2, getHeight()/2) + mPointerRadius;
                if ( a < b + c && b < a + c && c < a + b ){
                    /*double k1 = Math.acos(((a*a)+(b*b)-(c*c))/(2.*a*b));
                    a = (int)((k1*180)/Math.PI);
                    double k2 = Math.acos(((a*a)+(c*c)-(b*b))/(2.*a*c));
                    b = (int)((k2*180)/Math.PI);
                    double k3 = Math.acos(((c*c)+(b*b)-(a*a))/(2.*c*b));
                    c = (int)((k3*180)/Math.PI);
                    mAngle = a;*/
                    Log.i("Angle", "   a = " + a + "   b = " + b + "    c = " + c);
                    double k1 = ( 180 * Math.acos( ( b * b + c * c - a * a ) / ( 2 * b * c ) ) / Math.PI );
                    double k2 = ( 180 * Math.acos( ( a * a + c * c - b * b ) / ( 2 * a * c ) ) / Math.PI );
                    double k3 = ( 180 * Math.acos( ( a * a + b * b - c * c ) / ( 2 * a * b ) ) / Math.PI );
                    Log.i("Angle", "   k1 = " + k1 + "   k2 = " + k2 + "   k3 = " + k3);

                    mAngle = c;

                }
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                Log.i("onTouchEvent", "   UP");
                break;
        }
        Log.i("onTouchEvent", "    x = " + x + "    y = " + y);


        return true;
    }


    private int sideLength(final int _x1, final int _y1, final int _x2, final int _y2){
        return (int)Math.sqrt(Math.pow((_x2 - _x1), 2) + Math.pow((_y2 - _y1), 2));
    }


    private void drawTriangle(final Canvas _canvas){
        _canvas.drawLine(getWidth()/2, getHeight()/2, aa, bb, mCircletPaint);
        _canvas.drawLine(getWidth()/2, getHeight()/2, getWidth()/2, getHeight()/2 + mPointerRadius, mCircletPaint);
        _canvas.drawLine(getWidth()/2, getHeight()/2 + mPointerRadius, aa, bb, mCircletPaint);

    }



}
