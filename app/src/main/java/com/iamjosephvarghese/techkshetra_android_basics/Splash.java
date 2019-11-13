package com.iamjosephvarghese.techkshetra_android_basics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Splash extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                Toast.makeText(Splash.this, "Button Clicked!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Splash.this,MainActivity.class);
                intent.putExtra("data","data1234");
                startActivity(intent);
                finish();

            }
        });

    }
}
