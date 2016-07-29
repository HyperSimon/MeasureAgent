package com.roselism.measureagent;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.roselism.library.ObservableHorizontalScrollView;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private TextView mWeightValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        context = this;
//
//        mWeightValue = (TextView) findViewById(R.id.weight_value);
//        final ObservableHorizontalScrollView scrollView = (ObservableHorizontalScrollView) findViewById(R.id.weight_scrollview);
//
//        scrollView.setOnTouchListener(new View.OnTouchListener() {
//            public boolean onTouch(View v, MotionEvent event) {
//                if (event.getAction() == MotionEvent.ACTION_UP) {
//                    scrollView.startScrollerTask();
//                }
//                return false;
//            }
//        });
//        scrollView.setOnScrollStopListner(new ObservableHorizontalScrollView.OnScrollStopListner() {
//            public void onScrollChange(int index) {
//                if (index == 0) {
//                    mWeightValue.setText("25");
//                } else {
//                    int value = px2dip(context, index);
//                    mWeightValue.setText((value / 7 + 25) + "");
//                }
//            }
//        });
    }

//    public static int px2dip(Context context, float pxValue) {
//        final float scale = context.getResources().getDisplayMetrics().density;
//        return (int) (pxValue / scale + 0.5f);
//    }
}
