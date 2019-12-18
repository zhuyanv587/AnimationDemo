package com.example.animation;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameAnimationActivity extends AppCompatActivity {

    private ImageView ivFrame;
    private AnimationDrawable drawable;
    private Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        // 第1 种方式：静态设置属性
        ivFrame = findViewById(R.id.iv_progress);
        drawable = (AnimationDrawable)ivFrame.getBackground();

        // 启动帧动画
        drawable.start();

        start = findViewById(R.id.btn_start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawable.start();
            }
        });

        stop = findViewById(R.id.btn_stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawable.stop();
            }
        });

        // 第2 种方式：动态设置帧动画
//        ivFrame.setImageResource(R.drawable.frame_anim);
//        drawable = (AnimationDrawable) ivFrame.getDrawable();
//        drawable.start();

//        ivFrame.setBackgroundResource(R.drawable.frame_anim);
//        drawable = (AnimationDrawable) ivFrame.getBackground();
//        drawable.start();

        // 第3 种方式：动态创建帧动画、设置
//        drawable = createAnimation();
//        ivFrame.setImageDrawable(drawable);
//        drawable.start();
    }

    // 动态创建帧动画
    private AnimationDrawable createAnimation() {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        for(int i = 0; i < 8; i++) {
            int id = getResources().getIdentifier("wait" + i, "drawable",
                    getPackageName());
            Drawable drawable = getResources().getDrawable(id);
            animationDrawable.addFrame(drawable, 100);
        }
        return animationDrawable;
    }
}
