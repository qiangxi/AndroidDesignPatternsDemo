package com.qiangxi.designpatterns.strategy;

import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.io.File;

/**
 * Created by qiang_xi on 2017/3/30 20:01.
 * GlideImageLoaderStrategy
 */

public class GlideImageLoaderStrategy implements ImageLoaderStrategy {
    private GlideImageLoaderStrategy() {
    }

    public static GlideImageLoaderStrategy getInstance() {
        return InstanceHolder.STRATEGY;
    }

    private static class InstanceHolder {
        private static final GlideImageLoaderStrategy STRATEGY = new GlideImageLoaderStrategy();
    }

    @Override
    public void bind(ImageView imageView, String url, boolean useMemoryCache,
                     DiskCacheStrategy diskCacheStrategy, Transformation transformation) {
        Glide.with(imageView.getContext()).load(url).skipMemoryCache(!useMemoryCache)
                .diskCacheStrategy(diskCacheStrategy).into(imageView);
    }

    @Override
    public void bind(ImageView imageView, Uri uri, boolean useMemoryCache,
                     DiskCacheStrategy diskCacheStrategy, Transformation transformation) {
        Glide.with(imageView.getContext()).load(uri).skipMemoryCache(!useMemoryCache)
                .diskCacheStrategy(diskCacheStrategy).into(imageView);
    }

    @Override
    public void bind(ImageView imageView, File file, boolean useMemoryCache,
                     DiskCacheStrategy diskCacheStrategy, Transformation transformation) {
        Glide.with(imageView.getContext()).load(file).skipMemoryCache(!useMemoryCache)
                .diskCacheStrategy(diskCacheStrategy).into(imageView);
    }

    @Override
    public void bind(ImageView imageView, Integer resId, boolean useMemoryCache,
                     DiskCacheStrategy diskCacheStrategy, Transformation transformation) {
        Glide.with(imageView.getContext()).load(resId).skipMemoryCache(!useMemoryCache)
                .diskCacheStrategy(diskCacheStrategy).into(imageView);
    }

    @Override
    public void bind(ImageView imageView, byte[] bytes, boolean useMemoryCache,
                     DiskCacheStrategy diskCacheStrategy, Transformation transformation) {
        Glide.with(imageView.getContext()).load(bytes).skipMemoryCache(!useMemoryCache)
                .diskCacheStrategy(diskCacheStrategy).into(imageView);
    }
}
