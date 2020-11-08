package com.xingray.view;

public class Color {

    private int value;


    public Color() {
    }

    public Color(int value) {
        this.value = value;
    }

    public Color(int red, int green, int blue) {
        this(0, red, green, blue);
    }

    public Color(int alpha, int red, int green, int blue) {
        value = argbToValue(alpha, red, green, blue);
    }

    public int getAlpha() {
        return getAlpha(value);
    }

    public void setAlpha(int alpha) {
        value = setAlpha(value, alpha);
    }

    public double getOpacity() {
        return alphaToOpacity(getAlpha());
    }

    public int getRed() {
        return getRed(value);
    }

    public void setRed(int red) {
        value = setRed(value, red);
    }

    public int getGreen() {
        return getGreen(value);
    }

    public void setGreen(int greed) {
        value = setGreen(greed, value);
    }

    public int getBlue() {
        return getBlue(value);
    }

    public void setBlue(int blue) {
        value = setBlue(value, blue);
    }

    @Override
    public String toString() {
        return "Color{" +
                "value=" + value +
                "alpha=" + getAlpha() +
                "red=" + getRed() +
                "green=" + getGreen() +
                "blue=" + getBlue() +
                '}';
    }

    private static int argbToValue(int alpha, int red, int green, int blue) {
        return ((alpha << 24) & 0xff000000)
                + ((red << 16) & 0x00ff0000)
                + ((green << 8) & 0x0000ff00)
                + (blue & 0x000000ff);
    }

    public static int getAlpha(int value) {
        return (value & 0xff000000) >> 24;
    }

    public static int setAlpha(int value, int alpha) {
        return (alpha & 0x000000ff) << 24 + (value & 0x00ffffff);
    }

    public static int getRed(int value) {
        return (value & 0x00ff0000) >> 16;
    }

    public static int setRed(int value, int red) {
        return (red & 0x000000ff) << 16 + (value & 0xff00ffff);
    }

    public static int getGreen(int value) {
        return (value & 0x0000ff00) >> 8;
    }

    public static int setGreen(int greed, int value) {
        return (greed & 0x000000ff) << 8 + (value & 0xffff00ff);
    }

    public static int getBlue(int value) {
        return value & 0x000000ff;
    }

    public static int setBlue(int value, int blue) {
        return (blue & 0x000000ff) + (value & 0xffffff00);
    }

    public static int opacityToAlpha(double opacity) {
        return ((int) (opacity * 0xff) & 0xff);
    }

    public static double alphaToOpacity(int alpha) {
        return ((alpha & 0xff) * 1.0) / 0xff;
    }

    public static Color rgb(int red, int green, int blue) {
        return new Color(red, green, blue);
    }

    public static Color rgb(int alpha, int red, int green, int blue) {
        return new Color(alpha, red, green, blue);
    }

    public static Color rgb(double opacity, int red, int green, int blue) {
        return new Color(opacityToAlpha(opacity), red, green, blue);
    }
}
