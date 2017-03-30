package com.qiangxi.designpatterns.strategy;

import android.net.Uri;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by qiang_xi on 2017/3/30 20:00.
 * 图片加载
 */

public class ImageLoader {

    public static void bind(ImageView imageView, String url) {
        GlideImageLoaderStrategy.getInstance().bind(imageView, url);
    }

    public static void bind(ImageView imageView, Uri uri) {
        GlideImageLoaderStrategy.getInstance().bind(imageView, uri);
    }

    public static void bind(ImageView imageView, File file) {
        GlideImageLoaderStrategy.getInstance().bind(imageView, file);
    }

    public static void bind(ImageView imageView, Integer resId) {
        GlideImageLoaderStrategy.getInstance().bind(imageView, resId);
    }

    public static void bind(ImageView imageView, byte[] bytes) {
        GlideImageLoaderStrategy.getInstance().bind(imageView, bytes);
    }
}
