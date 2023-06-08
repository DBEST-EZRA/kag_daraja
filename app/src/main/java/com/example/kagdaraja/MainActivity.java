package com.example.kagdaraja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Animation topAnim, bottomAnim;
    ImageView image;
    TextView one,two,three;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //animations

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //animated content
        image = findViewById(R.id.imageView);
        one = findViewById(R.id.textView1);
        two = findViewById(R.id.textView);
        three = findViewById(R.id.textView2);

        image.setAnimation(topAnim);
        one.setAnimation(bottomAnim);
        two.setAnimation(bottomAnim);
        three.setAnimation(bottomAnim);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), dashboard.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}