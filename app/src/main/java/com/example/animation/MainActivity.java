package com.example.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bu,zhen,shu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bu = findViewById(R.id.btn_bu);
        zhen = findViewById(R.id.btn_zhen);
        shu = findViewById(R.id.btn_shu);

        bu.setOnClickListener(this);
        zhen.setOnClickListener(this);
        shu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btn_bu:
                intent = new Intent(MainActivity.this,TweenAnimationActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_zhen:
                intent = new Intent(MainActivity.this,FrameAnimationActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_shu:
                intent = new Intent(MainActivity.this, ValueAnimatorActivity.class);
                startActivity(intent);
                break;
        }
    }
}
