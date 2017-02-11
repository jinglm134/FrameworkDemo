package frameworkdemo.com.jlm.frameworkdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * 贝塞尔曲线
 * Created by jlm on 2016/11/30.
 */

public class Bessel extends View {

    private PointF center, start, end, control;//中心点，起始点，结束点，控制点

    private Paint pointPaint, linePaint, besselPaint;//点的画笔，辅助线的画笔，贝塞尔线的画笔

    public Bessel(Context context) {
        this(context, null);
    }

    public Bessel(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    /**
     * 初始化点和画笔
     */
    private void init() {
        center = new PointF(0, 0);
        start = new PointF(0, 0);
        end = new PointF(0, 0);
        control = new PointF(0, 0);

        pointPaint = new Paint();
        pointPaint.setColor(Color.BLUE);
        pointPaint.setAntiAlias(true);
        pointPaint.setStrokeWidth(12);
        pointPaint.setStyle(Paint.Style.STROKE);

        linePaint = new Paint();
        linePaint.setColor(Color.GRAY);
        linePaint.setAntiAlias(true);
        linePaint.setStrokeWidth(4);
        linePaint.setStyle(Paint.Style.STROKE);

        besselPaint = new Paint();
        besselPaint.setColor(Color.RED);
        besselPaint.setAntiAlias(true);
        besselPaint.setStrokeWidth(4);
        besselPaint.setStyle(Paint.Style.STROKE);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        center.x = w / 2;
        center.y = h / 2;

        /**初始化起始点和终点*/
        start.x = center.x - 200;
        start.y = center.y;

        end.x = center.x + 200;
        end.y = center.y;

        control.x = center.x;
        control.y = center.y - 200;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        control.x = event.getX();
        control.y = event.getY();
        invalidate();
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //画点
        canvas.drawPoint(start.x, start.y, pointPaint);
        canvas.drawPoint(end.x, end.y, pointPaint);
        canvas.drawPoint(control.x, control.y, pointPaint);

        //画辅助线
        canvas.drawLine(start.x, start.y, control.x, control.y, linePaint);
        canvas.drawLine(end.x, end.y, control.x, control.y, linePaint);

        //贝塞尔曲线
        Path path = new Path();
        path.moveTo(start.x, start.y);
        path.quadTo(control.x, control.y, end.x, end.y);
        canvas.drawPath(path, besselPaint);
    }
}
