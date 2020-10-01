package com.practice.eng_fr_translnguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.cat_number);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberActIntent = new Intent(MainActivity.this, NumbersActivity.class);
                        startActivity(numberActIntent);
            }
        });

        TextView colors = (TextView) findViewById(R.id.cat_color);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorActIntent = new Intent(MainActivity.this, ColorsActivity.class);
                    startActivity(colorActIntent);
            }
        });

        TextView family = (TextView) findViewById(R.id.cat_family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyActIntent = new Intent(MainActivity.this, FamilyActivity.class);
                     startActivity(familyActIntent);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.cat_phrase);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phraseActIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                    startActivity(phraseActIntent);
            }
        });

    }
}