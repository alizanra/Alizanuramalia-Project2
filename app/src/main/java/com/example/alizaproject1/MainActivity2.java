package com.example.alizaproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageview10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageview10 = (ImageView) findViewById(R.id.imageView10);

        imageview10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buka2 = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(buka2);
            }
        });
    }
}