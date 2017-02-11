package frameworkdemo.com.jlm.frameworkdemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by jaylim on 2017/2/10.
 */

public class LayoutCheckError extends LinearLayout {

    private TextViewCheckError textViewCheckError;

    public LayoutCheckError(Context context) {
        this(context, null, 0);
    }

    public LayoutCheckError(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LayoutCheckError(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


        init();
    }

    private void init() {

        if (getChildCount() >= 2) {
            View view = getChildAt(1);
            if (view instanceof TextViewCheckError) {
                textViewCheckError = (TextViewCheckError) view;

            }

        }
    }
}
