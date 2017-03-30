package com.qiangxi.designpatterns;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.qiangxi.designpatterns.builder.Animal;
import com.qiangxi.designpatterns.builder.Builder;
import com.qiangxi.designpatterns.builder.Director;
import com.qiangxi.designpatterns.builder.TigerBuilder;
import com.qiangxi.designpatterns.factory.Factory;
import com.qiangxi.designpatterns.factory.FactoryImpl;
import com.qiangxi.designpatterns.factory.Product;
import com.qiangxi.designpatterns.strategy.ImageLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageLoader.bind(new ImageView(this), "");
        testBuilder();
        tesFactory();
    }

    private void tesFactory() {
        Factory factory = new FactoryImpl();
        Product product = factory.createProduct();
        //to do some thing
        //从资源文中获取一个bitmap对象
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
    }


    private void testBuilder() {
        Builder builder = new TigerBuilder();
        Director director = new Director(builder);
        director.construst("老虎", "肉", 4);
        Animal animal = builder.build();
        Log.e("testBuilder", animal.toString());
//        User user = new User.Builder(175).age(16).name("张三").sex("男").build();
//        Log.e("testBuilder", user.toString());
    }
}
