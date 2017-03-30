package com.qiangxi.designpatterns.strategy;

import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;

import java.io.File;

/**
 * Created by qiang_xi on 2017/3/30 20:00.
 * 图片加载
 */

public class ImageLoader {
    private ImageLoader() {
    }

    public static void bind(ImageView imageView, String url) {
        bind(imageView, url, true);
    }

    public static void bind(ImageView imageView, String url, boolean useMemoryCache) {
        bind(imageView, url, useMemoryCache, DiskCacheStrategy.ALL);
    }

    public static void bind(ImageView imageView, String url, boolean useMemoryCache,
                            DiskCacheStrategy diskCacheStrategy) {
        bind(imageView, url, useMemoryCache, diskCacheStrategy,
                new CenterCrop(imageView.getContext()));
    }

    public static void bind(ImageView imageView, String url, boolean useMemoryCache,
                            DiskCacheStrategy diskCacheStrategy, Transformation transformation) {
        GlideImageLoaderStrategy.getInstance().bind(imageView, url, useMemoryCache,
                diskCacheStrategy, transformation);
    }

    public static void bind(ImageView imageView, Uri uri) {
        bind(imageView, uri, true);
    }

    public static void bind(ImageView imageView, Uri uri, boolean useMemoryCache) {
        bind(imageView, uri, useMemoryCache, DiskCacheStrategy.ALL);
    }

    public static void bind(ImageView imageView, Uri uri, boolean useMemoryCache,
                            DiskCacheStrategy diskCacheStrategy) {
        bind(imageView, uri, useMemoryCache, diskCacheStrategy,
                new CenterCrop(imageView.getContext()));
    }

    public static void bind(ImageView imageView, Uri uri, boolean useMemoryCache,
                            DiskCacheStrategy diskCacheStrategy, Transformation transformation) {
        GlideImageLoaderStrategy.getInstance().bind(imageView, uri, useMemoryCache,
                diskCacheStrategy, transformation);
    }

    public static void bind(ImageView imageView, File file) {
        bind(imageView, file, true);
    }

    public static void bind(ImageView imageView, File file, boolean useMemoryCache) {
        bind(imageView, file, useMemoryCache, DiskCacheStrategy.ALL);
    }

    public static void bind(ImageView imageView, File file, boolean useMemoryCache,
                            DiskCacheStrategy diskCacheStrategy) {
        bind(imageView, file, useMemoryCache, diskCacheStrategy,
                new CenterCrop(imageView.getContext()));
    }

    public static void bind(ImageView imageView, File file, boolean useMemoryCache,
                            DiskCacheStrategy diskCacheStrategy, Transformation transformation) {
        GlideImageLoaderStrategy.getInstance().bind(imageView, file, useMemoryCache,
                diskCacheStrategy, transformation);
    }

    public static void bind(ImageView imageView, Integer resId) {
        bind(imageView, resId, true);
    }

    public static void bind(ImageView imageView, Integer resId, boolean useMemoryCache) {
        bind(imageView, resId, useMemoryCache, DiskCacheStrategy.ALL);
    }

    public static void bind(ImageView imageView, Integer resId, boolean useMemoryCache,
                            DiskCacheStrategy diskCacheStrategy) {
        bind(imageView, resId, useMemoryCache, diskCacheStrategy,
                new CenterCrop(imageView.getContext()));
    }

    public static void bind(ImageView imageView, Integer resId, boolean useMemoryCache,
                            DiskCacheStrategy diskCacheStrategy, Transformation transformation) {
        GlideImageLoaderStrategy.getInstance().bind(imageView, resId, useMemoryCache,
                diskCacheStrategy, transformation);
    }

    public static void bind(ImageView imageView, byte[] bytes) {
        bind(imageView, bytes, true);
    }

    public static void bind(ImageView imageView, byte[] bytes, boolean useMemoryCache) {
        bind(imageView, bytes, useMemoryCache, DiskCacheStrategy.ALL);
    }

    public static void bind(ImageView imageView, byte[] bytes, boolean useMemoryCache,
                            DiskCacheStrategy diskCacheStrategy) {
        bind(imageView, bytes, useMemoryCache, diskCacheStrategy,
                new CenterCrop(imageView.getContext()));
    }

    public static void bind(ImageView imageView, byte[] bytes, boolean useMemoryCache,
                            DiskCacheStrategy diskCacheStrategy, Transformation transformation) {
        GlideImageLoaderStrategy.getInstance().bind(imageView, bytes, useMemoryCache,
                diskCacheStrategy, transformation);
    }
}
