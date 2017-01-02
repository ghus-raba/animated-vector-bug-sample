package com.example.fnagy.animateddrawabletest;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        final ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        final ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);

        final AnimatedVectorDrawableCompat drawable = AnimatedVectorDrawableCompat.create(MainActivity.this, R.drawable.vector_morph_play);
        imageView.setImageDrawable(drawable);

        final Animatable drawable2 = (Animatable) ResourcesCompat.getDrawable(getResources(), R.drawable.vector_morph_play, getTheme());
        imageView2.setImageDrawable((Drawable) drawable2);

        final Animatable drawable3 = (Animatable) imageView3.getDrawable();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawable.start();
                drawable2.start();
                drawable3.start();
            }
        });
    }
}
