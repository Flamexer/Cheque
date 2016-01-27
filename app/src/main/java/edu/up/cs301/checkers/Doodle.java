package edu.up.cs301.checkers;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 *
 * The Doodle class creates a SurfaceView,
 * then draws some sample pieces onto it in various
 * positions.
 *
 * Created by Sean Tollisen on 1/26/2016.
 */

/**
 External Citation
    Date:       1/26/2016
    Problem:    Was not entirely sure how to draw in android java
    Resource:   In-class sample code
    (https://learning.up.edu/moodle/pluginfile.php/212505/mod_resource/content/0/Doodle.java);
    Solution:   Imitated sample code
 */

public class Doodle extends SurfaceView {

    //The various constructors for various numbers of arguments
    public Doodle(Context context) {
        super(context);
        //Set the SurfaceView to be drawn (not default)
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

    /**
     * Method which actually defines the paints and draws the pieces
     */
    public void onDraw(Canvas canvas) {
        //Define green paint
        Paint green = new Paint();
        green.setColor(0xFFC8FFC8);
        //That color look familiar?

        //Define red paint
        Paint red = new Paint();
        red.setColor(0xFF887788);

        //Draw the seven pieces onto the board
        canvas.drawCircle(810.0f, 670.0f, 45.0f, red);
        canvas.drawCircle(685.0f, 130.0f, 45.0f, red);
        canvas.drawCircle(290.0f, 240.0f, 45.0f, red);
        canvas.drawCircle(155.0f, 790.0f, 45.0f, green);
        canvas.drawCircle(425.0f, 570.0f, 45.0f, green);
        canvas.drawCircle(290.0f, 900.0f, 45.0f, green);
        canvas.drawCircle(1085.0f, 460.0f, 45.0f, green);
    }
}