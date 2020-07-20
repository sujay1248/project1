package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;

public class secondsecreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondscreen);
        Button nav = (Button)findViewById(R.id.button3);
        nav.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent =  new Intent(secondsecreen.this, thirdpage.class);
                startActivity(intent);
            }
        });
        Button nav2 = (Button)findViewById(R.id.button);
        nav2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent =  new Intent(secondsecreen.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
