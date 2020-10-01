package com.practice.eng_fr_translnguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // ArrayList of Numbers
        ArrayList<CustomWordClass> numList = new ArrayList<CustomWordClass>();
        numList.add(new CustomWordClass(R.drawable.number_one,"One", "Un"));
        numList.add(new CustomWordClass(R.drawable.number_two,"Two", "Deux"));
        numList.add(new CustomWordClass(R.drawable.number_three,"Three", "Trios"));
        numList.add(new CustomWordClass(R.drawable.number_four,"Four", "Quatre"));
        numList.add(new CustomWordClass(R.drawable.number_five,"Five", "Cinq"));
        numList.add(new CustomWordClass(R.drawable.number_six,"Six", "Six"));
        numList.add(new CustomWordClass(R.drawable.number_seven,"Seven", "Sept"));
        numList.add(new CustomWordClass(R.drawable.number_eight,"Eight", "Huit"));
        numList.add(new CustomWordClass(R.drawable.number_nine,"Nine", "Neuf"));
        numList.add(new CustomWordClass(R.drawable.number_ten,"Ten", "Dix"));

        CustomAdapter numAdapter = new CustomAdapter(this, numList, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.numberListView);
        listView.setAdapter(numAdapter);
    }
}