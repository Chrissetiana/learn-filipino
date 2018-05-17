package com.example.android.filipino;

public class Words {

    private String englishTranslation;
    private String filipinoTranslation;
    private int imageResourceId;

    public Words(String engTrans, String filTrans, int imageId) {
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
}
