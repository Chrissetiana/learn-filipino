package com.chrissetiana.learnfilipino;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String englishTranslation;
    private String filipinoTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private int audioResourceId;

    public Word(String engTrans, String filTrans, int audioId) {
        englishTranslation = engTrans;
        filipinoTranslation = filTrans;
        audioResourceId = audioId;
    }

    public Word(String engTrans, String filTrans, int imageId, int audioId) {
        englishTranslation = engTrans;
        filipinoTranslation = filTrans;
        imageResourceId = imageId;
        audioResourceId = audioId;
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

    public int getAudioResourceId() {
        return audioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "englishTranslation='" + englishTranslation + '\'' +
                ", filipinoTranslation='" + filipinoTranslation + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", audioResourceId=" + audioResourceId +
                '}';
    }

}
