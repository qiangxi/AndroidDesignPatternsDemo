package com.qiangxi.designpatterns.strategy;

import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.io.File;

/**
 * Created by qiang_xi on 2017/3/30 19:49.
 * 图片加载策略
 */

public interface ImageLoaderStrategy {
    void bind(ImageView imageView, String url, boolean useMemoryCache, DiskCacheStrategy diskCacheStrategy, Transformation transformation);

    void bind(ImageView imageView, Uri uri, boolean useMemoryCache, DiskCacheStrategy diskCacheStrategy, Transformation transformation);

    void bind(ImageView imageView, File file, boolean useMemoryCache,DiskCacheStrategy diskCacheStrategy, Transformation transformation);

    void bind(ImageView imageView, Integer resId, boolean useMemoryCache, DiskCacheStrategy diskCacheStrategy, Transformation transformation);

    void bind(ImageView imageView, byte[] bytes, boolean useMemoryCache, DiskCacheStrategy diskCacheStrategy, Transformation transformation);

}
