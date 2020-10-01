package com.practice.eng_fr_translnguide;

import android.widget.ImageView;

public class CustomWordClass {
    private int mImageView = NO_IMAGE;
    private String mEnglishWord;
    private String mFrenchWord;
    private static final int NO_IMAGE = -1;

    public CustomWordClass(String engWord, String frWord) {
        mEnglishWord = engWord;
        mFrenchWord = frWord;
    }

    public CustomWordClass(int imageResourceID, String engWord, String frWord) {
        mImageView = imageResourceID;
        mEnglishWord = engWord;
        mFrenchWord = frWord;
    }

    public int getImageView() { return mImageView; }
    public String getEnglishWord() {
        return mEnglishWord;
    }
    public String getFrenchWord() {
        return mFrenchWord;
    }

    public boolean hasImage() {
        return mImageView != NO_IMAGE;
    }
}
