package com.practice.eng_fr_translnguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        // ArrayList of Colors
        ArrayList<CustomWordClass> colList = new ArrayList<CustomWordClass>();
        colList.add(new CustomWordClass(R.drawable.color_red,"Red", "Rogue"));
        colList.add(new CustomWordClass(R.drawable.color_green,"Green", "Vert"));
        colList.add(new CustomWordClass(R.drawable.color_yellow,"Yellow", "Jaune"));
        colList.add(new CustomWordClass(R.drawable.color_blue,"Blue", "Bleu"));
        colList.add(new CustomWordClass(R.drawable.color_gray,"Grey", "Gris"));
        colList.add(new CustomWordClass(R.drawable.color_black,"Black", "Noir"));
        colList.add(new CustomWordClass(R.drawable.color_brown,"Brown", "Brun"));
        colList.add(new CustomWordClass(R.drawable.color_white,"White", "Blanc"));

        CustomAdapter colAdapter = new CustomAdapter(this, colList, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.colorListView);
        listView.setAdapter(colAdapter);
    }
}