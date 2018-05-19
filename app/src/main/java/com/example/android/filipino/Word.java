package com.example.android.filipino;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String englishTranslation;
    private String filipinoTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Word(String engTrans, String filTrans) {
        englishTranslation = engTrans;
        filipinoTranslation = filTrans;
    }

    public Word(String engTrans, String filTrans, int imageId) {
        englishTranslation = engTrans;
        filipinoTranslation = filTrans;
        imageResourceId = imageId;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }

    public String getFilipinoTranslation() {
        return filipinoTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return getImageResourceId() != NO_IMAGE_PROVIDED;
    }
}
