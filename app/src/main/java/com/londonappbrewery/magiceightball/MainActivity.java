package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button ask_button = findViewById(R.id.ask_button);
        final ImageView magic_ball_image = findViewById(R.id.magic_ball_image);
        final int[] magic_ball_answers = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
                                    R.drawable.ball4, R.drawable.ball5};

        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                magic_ball_image.setImageResource(magic_ball_answers[randomNumberGenerator.nextInt(5)]);
            }
        });
    }
}
