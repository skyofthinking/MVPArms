package io.github.skyofthinking.busline.utils;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Toolbar 配置
 * 作者： Zero
 * 时间： 2016/6/1
 */
public class ToolbarSetting {

    public final static int LEFT = 0;
    public final static int TITLE = 1;
    public final static int RIGHT = 2;

    /**
     * 左边文字
     */
    public TextView toolbarLeftText;
    /**
     * 标题栏文字
     */
    public TextView toolbarTitleText;
    /**
     * 右边文字
     */
    public TextView toolbarRightText;
    /**
     * 左边图片
     */
    public ImageView toolbarLeftImage;
    /**
     * 标题栏图片
     */
    public ImageView toolbarTitleImage;
    /**
     * 右边图片
     */
    public ImageView toolbarRightImage;


    /**
     * Toolbar TextView 赋值
     *
     * @param agr  int （ToolbarSetting.LEFT | ToolbarSetting.TITLE | ToolbarSetting.RIGHT）
     * @param text CharSequence
     */
    public void setText(int agr, CharSequence text) {
        TextView textView = null;
        switch (agr) {
            case ToolbarSetting.LEFT:
                textView = toolbarLeftText;
                break;
            case ToolbarSetting.TITLE:
                textView = toolbarTitleText;
                break;
            case ToolbarSetting.RIGHT:
                textView = toolbarRightText;
                break;
        }
        if (textView == null)
            return;
        textView.setText(text);
        if (textView.getVisibility() != View.VISIBLE)
            textView.setVisibility(View.VISIBLE);
    }

    /**
     * Toolbar TextView 赋值
     *
     * @param agr   int （ToolbarSetting.LEFT | ToolbarSetting.TITLE | ToolbarSetting.RIGHT）
     * @param resid int
     */
    public void setText(int agr, @StringRes int resid) {
        TextView textView = null;
        switch (agr) {
            case ToolbarSetting.LEFT:
                textView = toolbarLeftText;
                break;
            case ToolbarSetting.TITLE:
                textView = toolbarTitleText;
                break;
            case ToolbarSetting.RIGHT:
                textView = toolbarRightText;
                break;
        }
        if (textView == null)
            return;
        textView.setText(resid);
        if (textView.getVisibility() != View.VISIBLE)
            textView.setVisibility(View.VISIBLE);
    }

    /**
     * Toolbar ImageView 赋值
     *
     * @param agr   int （ToolbarSetting.LEFT | ToolbarSetting.TITLE | ToolbarSetting.RIGHT）
     * @param resId int
     */
    public void setImageResource(int agr, @DrawableRes int resId) {
        ImageView textView = null;
        switch (agr) {
            case ToolbarSetting.LEFT:
                textView = toolbarLeftImage;
                break;
            case ToolbarSetting.TITLE:
                textView = toolbarTitleImage;
                break;
            case ToolbarSetting.RIGHT:
                textView = toolbarRightImage;
                break;
        }
        if (textView == null)
            return;
        textView.setImageResource(resId);
        if (textView.getVisibility() != View.VISIBLE)
            textView.setVisibility(View.VISIBLE);
    }

    /**
     * @param toolbarLeftImage  ImageView
     * @param toolbarLeftText   TextView
     * @param toolbarRightImage ImageView
     * @param toolbarRightText  TextView
     * @param toolbarTitleImage ImageView
     * @param toolbarTitleText  TextView
     */
    public ToolbarSetting(ImageView toolbarLeftImage, TextView toolbarLeftText, ImageView toolbarRightImage, TextView toolbarRightText, ImageView toolbarTitleImage, TextView toolbarTitleText) {
        this.toolbarLeftImage = toolbarLeftImage;
        this.toolbarLeftText = toolbarLeftText;
        this.toolbarRightImage = toolbarRightImage;
        this.toolbarRightText = toolbarRightText;
        this.toolbarTitleImage = toolbarTitleImage;
        this.toolbarTitleText = toolbarTitleText;
    }
}
