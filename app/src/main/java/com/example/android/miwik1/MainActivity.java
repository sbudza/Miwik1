package com.example.android.miwik1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);

        numbers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(intent);


            }
        });

        TextView family = (TextView) findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(intent);

            }
        });

        TextView colors = (TextView) findViewById(R.id.colors);

        colors.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(intent);
            }
        });

        TextView phrase = (TextView) findViewById(R.id.phrase);

        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PhraseActivity.class);
                startActivity(intent);
            }


        });

    }
}