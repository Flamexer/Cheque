package edu.up.cs301.checkers;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.content.Context;
import android.view.SurfaceView;

/**
 * Created by tollisen19 on 1/26/2016.
 */

public class Doodle extends SurfaceView {
    public Doodle(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public Doodle(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
    }

    public Doodle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setWillNotDraw(false);
    }

    public Doodle(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setWillNotDraw(false);
    }
    public void onDraw(Canvas canvas) {
        Paint white = new Paint();
        white.setColor(0xFFFFFFFF);
        Paint red = new Paint();
        red.setColor(0xFF690202)
        canvas.drawRect(0.0f, 0.0f, 400.0f, 400.0f, red);
    }
}