package com.sinothk.widget.mallImageView;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

//import com.bumptech.glide.Glide;
//import com.bumptech.glide.RequestManager;
//import com.bumptech.glide.request.target.ViewTarget;

import java.util.ArrayList;

/**
 * <pre>
 *  @author 梁玉涛 (https://github.com/sinothk)
 *  @Create 2018/2/10 10:01
 *  @Project: UIPluginLib
 *  @Description: 商城中，产品详情介绍
 *  @Update:
 * <pre>
 */
public class MallImageView extends LinearLayout {

    private OnImgLongClickListener onImgLongClickListener;

    public MallImageView(Context context) {
        super(context);
    }

    public MallImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public MallImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MallImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /**
     * urls 为List形式
     *
     * @param urls
     */
    public void setImgUrls(ArrayList<String> urls, ImgLoader imgLoader) {
        if (urls == null || urls.size() == 0) {
            return;
        }

        String[] urlsArr = new String[urls.size()];
        for (int i = 0; i < urls.size(); i++) {
            urlsArr[i] = urls.get(i);
        }

        setImgUrls(urlsArr, imgLoader);
    }

    public void setImgUrls(final String[] urls, ImgLoader imgLoader) {
        if (urls == null || urls.length == 0) {
            return;
        }

        for (int i = 0; i < urls.length; i++) {

            if (urls[i] == null || urls[i].trim().length() == 0) {
                continue;
            }

            final int position = i;
            final String url = urls[i];

            ImageView myImageView = new ImageView(this.getContext());
            myImageView.setScaleType(ImageView.ScaleType.CENTER);
            myImageView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
            myImageView.setAdjustViewBounds(true);

    //        Glide.with(MainActivity.this)
    //                    .load(url)
    //                    .placeholder(loadingImg)
    //                    .error(errorImg)
    //                    .into(myImageView);

            imgLoader.onShow(myImageView, url);

            myImageView.setOnLongClickListener(new OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    if (onImgLongClickListener != null) {
                        onImgLongClickListener.imgLongClick(position, url);
                    }

                    return false;
                }
            });

            this.addView(myImageView, i);
        }
    }

    /**
     * 图片长按监听事件
     *
     * @param onImgLongClickListener
     */
    public void setOnImgLongClickListener(OnImgLongClickListener onImgLongClickListener) {
        this.onImgLongClickListener = onImgLongClickListener;
    }

    public interface OnImgLongClickListener {
        void imgLongClick(int position, String imgUrl);
    }
}
