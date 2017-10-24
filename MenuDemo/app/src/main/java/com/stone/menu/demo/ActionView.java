package com.stone.menu.demo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by stone on 17-10-23.
 */

public class ActionView extends ImageView {
    public ActionView(Context context) {
        super(context);
    }

    public ActionView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onVisibilityChanged(@NonNull View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        Toast.makeText(getContext(), visibility + "", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(10, 10);
    }
}
