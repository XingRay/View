package com.xingray.view;

public interface View {

    double getWidth();

    double getHeight();

    void invalidate();

    void onDraw(Canvas canvas);
}
