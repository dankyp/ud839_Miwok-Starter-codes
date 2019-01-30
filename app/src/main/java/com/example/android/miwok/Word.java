package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

/** Default translation for the word */
private String mDefaultTranslation;

/** Greek translation for the word */
private String mGreekTranslation;

/**Image resource ID for the word*/
private int mImageResourceId;

    /** Create a new Word object
     * @param defaultTranslation is the word in a language that the user is using e.g English
     * @param greekTranslation is the word in Greek
     */


public Word (String defaultTranslation, String greekTranslation){
    mDefaultTranslation = defaultTranslation;
    mGreekTranslation = greekTranslation;
    }

    /** Create a new Word object
     * @param defaultTranslation is the word in a language that the user is using e.g English
     * @param greekTranslation is the word in Greek
     * @param imageResourceId is the drawable resource id for the image
     */


    public Word (String defaultTranslation, String greekTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mGreekTranslation = greekTranslation;
        mImageResourceId = imageResourceId;
    }

/** Get the default translation of the word
 */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /** Get the Greek Translation of the word
     */
    public String getmGreekTranslation() {
        return mGreekTranslation;
    }

    /** Return the image resource of the word
          */
    public int getmImageResourceId() {

        return mImageResourceId;
    }
}
