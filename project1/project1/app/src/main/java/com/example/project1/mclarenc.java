package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class mclarenc extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mclaren);
        final ImageView imageView1=(ImageView)findViewById(R.id.imageView);
        imageView1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Animation animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                imageView1.startAnimation(animFadeIn);

            }
        });


    }
}
