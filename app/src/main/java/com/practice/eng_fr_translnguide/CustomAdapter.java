package com.practice.eng_fr_translnguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CustomWordClass> {

    private int mColorResourceID;

    public CustomAdapter(Activity context, ArrayList<CustomWordClass> list, int colorResourceID) {
        super(context, 0, list);
        mColorResourceID = colorResourceID;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        CustomWordClass currentListItem = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.ImageView);
        if(currentListItem.hasImage())
            imageView.setImageResource(currentListItem.getImageView());
        else
            imageView.setVisibility(View.GONE);

        TextView engTView = listItemView.findViewById(R.id.engTextView);
        engTView.setText(currentListItem.getEnglishWord());

        TextView frTView = listItemView.findViewById(R.id.frTextView);
        frTView.setText(currentListItem.getFrenchWord());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
