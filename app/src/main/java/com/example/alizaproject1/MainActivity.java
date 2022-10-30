package com.example.alizaproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageview7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview7 = (ImageView) findViewById(R.id.imageView7);

        imageview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buka = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(buka);
            }
        });
    }
}