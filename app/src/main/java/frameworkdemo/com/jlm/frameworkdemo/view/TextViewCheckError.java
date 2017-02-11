package frameworkdemo.com.jlm.frameworkdemo.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;

import frameworkdemo.com.jlm.frameworkdemo.R;

/**
 * Created by jlm on 2016/12/17.
 */

public class TextViewCheckError extends EditText implements View.OnFocusChangeListener {

    private String errorMessage;
    private String inputMessage;
    private int normalTextColor;
    private int normalBackGround;
    private int errorBackGround;

    private OnInputCompletedListener l;

    public TextViewCheckError(Context context) {
        super(context, null, 0);
    }

    public TextViewCheckError(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public TextViewCheckError(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        normalTextColor = getCurrentTextColor();
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.editTextCompleted);
        errorMessage = ta.getString(R.styleable.editTextCompleted_errorMessage);
        normalBackGround = ta.getResourceId(R.styleable.editTextCompleted_normalBackground, R.drawable.album_abc_spinner_white);
        errorBackGround = ta.getResourceId(R.styleable.editTextCompleted_errorBackground, R.drawable.album_abc_spinner_white);
        errorMessage = ta.getString(R.styleable.editTextCompleted_errorMessage);

        this.setOnFocusChangeListener(this);
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (hasFocus) {
            setText(inputMessage);
            setTextColor(normalTextColor);
            setBackgroundResource(normalBackGround);
        } else {

            inputMessage = getText().toString();

            if (l != null) {
                boolean isCorrect = l.onCompletedListener(inputMessage);
                if (!isCorrect) {
                    setText(errorMessage);
                    setTextColor(getResources().getColor(R.color.c7));
                    setBackgroundResource(errorBackGround);
                }
            }
        }
    }


    interface OnInputCompletedListener {

        /**
         * @param msg 文本框的值
         * @return 文本框中的值是否符合标准
         */
        boolean onCompletedListener(String msg);

    }

    public void setOnInputCompletedListener(OnInputCompletedListener l) {
        this.l = l;
    }
}
