package com.roselism.library;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by simon on 16-7-29.
 */
public class MeasureAgent extends RelativeLayout {

    private int max = 205;
    private int min = 25;

    public MeasureAgent(Context context) {
        this(context, null);
    }

    public MeasureAgent(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.measureagent, this);
        init(context);
    }

    public void init(final Context context) {

        final TextView mWeightValue = (TextView) findViewById(R.id.weight_value);
        final ObservableHorizontalScrollView scrollView = (ObservableHorizontalScrollView) findViewById(R.id.weight_scrollview);

        scrollView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) scrollView.startScrollerTask();
                return false;
            }
        });
        scrollView.setOnScrollStopListner(new ObservableHorizontalScrollView.OnScrollStopListner() {
            public void onScrollChange(int index) {
                if (index == 0) mWeightValue.setText(String.valueOf(min));
                else {
                    int value = px2dip(context, index);
                    mWeightValue.setText((value / 7 + 25) + "");
                }
            }
        });
    }

    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
