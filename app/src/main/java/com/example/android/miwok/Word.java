package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user want to learn.
 * It contains a default translation and Miwak translation for the word.
 * Created by ${Rami} on ${9/1/2016}.
 */

public class Word {
    /* Miwok translation for the word */
    private String mMiwakTranslation;

    /* Default  translation for the word */
    private String mDefaultTranslation;

    private Word(){}

    public Word(String defaultTranslation, String miwakTranslation){
        this.mMiwakTranslation = miwakTranslation;
        this.mDefaultTranslation = defaultTranslation;
    }

    /**
     * Get the default translation of the word
     * @return the default translation of the word
     */
    public String getMiwakTranslation(){return this.mMiwakTranslation;}

    /**
     * Get the Miwok translation of the word
     * @return the Miwok translation of the word
     */
    public String getDefaultTranslation(){return this.mDefaultTranslation;}
}
