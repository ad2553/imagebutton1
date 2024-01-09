package com.example.imagebutton1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
ImageView iv;
ImageButton im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.iv);
        im = findViewById(R.id.im);
    }

    public void go(View view) {
        Random rnd = new Random();
        int x = rnd.nextInt(3)+1;
        if (x == 1)
            iv.setImageResource(R.drawable.iv1);

        if (x==2)
            iv.setImageResource(R.drawable.iv2);

        if (x==3)
            iv.setImageResource(R.drawable.iv3);

    }
}