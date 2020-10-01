package com.practice.eng_fr_translnguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        // ArrayList of Family Members
        ArrayList<CustomWordClass> famList = new ArrayList<CustomWordClass>();
        famList.add(new CustomWordClass(R.drawable.family_father,"Father", "Un"));
        famList.add(new CustomWordClass(R.drawable.family_mother,"Mother", "Deux"));
        famList.add(new CustomWordClass(R.drawable.family_older_brother,"Brother", "Trios"));
        famList.add(new CustomWordClass(R.drawable.family_older_sister,"Sister", "Quatre"));
        famList.add(new CustomWordClass(R.drawable.family_younger_brother,"GrandFather", "Un"));
        famList.add(new CustomWordClass(R.drawable.family_younger_sister,"GrandMother", "Deux"));
        famList.add(new CustomWordClass(R.drawable.family_son,"Son", "Cinq"));
        famList.add(new CustomWordClass(R.drawable.family_daughter,"Daughter", "Six"));
        famList.add(new CustomWordClass(R.drawable.family_younger_brother,"Uncle", "Huit"));
        famList.add(new CustomWordClass(R.drawable.family_younger_sister,"Aunt", "Huit"));

        CustomAdapter famAdapter = new CustomAdapter(this, famList, R.color.category_family_members);
        ListView listView = (ListView) findViewById(R.id.familyListView);
        listView.setAdapter(famAdapter);
    }
}