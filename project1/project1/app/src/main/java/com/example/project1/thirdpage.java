package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;

public class thirdpage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        Button nav = (Button)findViewById(R.id.button4);
        nav.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent =  new Intent(thirdpage.this, fourthpage.class);
                startActivity(intent);
            }
        });
    }
}
