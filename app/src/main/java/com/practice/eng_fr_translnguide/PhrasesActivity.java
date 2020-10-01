package com.practice.eng_fr_translnguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        // ArrayList of Phrases
        ArrayList<CustomWordClass> colList = new ArrayList<CustomWordClass>();
        colList.add(new CustomWordClass("Red", "Un"));
        colList.add(new CustomWordClass("Green", "Deux"));
        colList.add(new CustomWordClass("Yellow", "Trios"));
        colList.add(new CustomWordClass("Blue", "Quatre"));
        colList.add(new CustomWordClass("Grey", "Cinq"));
        colList.add(new CustomWordClass("Black", "Six"));
        colList.add(new CustomWordClass("Brown", "Sept"));
        colList.add(new CustomWordClass("White", "Huit"));

        CustomAdapter phraseAdapter = new CustomAdapter(this, colList, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.phraseListView);
        listView.setAdapter(phraseAdapter);
    }
}