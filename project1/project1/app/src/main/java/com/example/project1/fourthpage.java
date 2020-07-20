package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;

public class fourthpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);
        ImageView imageView1=(ImageView)findViewById(R.id.imageView);
        ImageView imageView2=(ImageView)findViewById(R.id.imageView1);
        ImageView imageView3=(ImageView)findViewById(R.id.imageView2);
        ImageView imageView4=(ImageView)findViewById(R.id.imageView3);
        ImageView imageView5=(ImageView)findViewById(R.id.imageView4);
        ImageView imageView6=(ImageView)findViewById(R.id.imageView5);
        ImageView imageView7=(ImageView)findViewById(R.id.imageView7);
        ImageView imageView8=(ImageView)findViewById(R.id.imageView6);
        Button button1=(Button)findViewById(R.id.button5);




        imageView1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent =  new Intent(fourthpage.this, mclarenc.class);
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent =  new Intent(fourthpage.this, chiron.class);
                startActivity(intent);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent =  new Intent(fourthpage.this, pagani.class);
                startActivity(intent);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent =  new Intent(fourthpage.this, rolls.class);
                startActivity(intent);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent =  new Intent(fourthpage.this, porche.class);
                startActivity(intent);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent =  new Intent(fourthpage.this, vulcan.class);
                startActivity(intent);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent =  new Intent(fourthpage.this, grant.class);
                startActivity(intent);
            }
        });

        imageView8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent =  new Intent(fourthpage.this, konig.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent =  new Intent(fourthpage.this, scroll.class);
                startActivity(intent);
            }
        });

    }
}
