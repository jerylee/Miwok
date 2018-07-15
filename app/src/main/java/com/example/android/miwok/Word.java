package com.example.android.miwok;

public class Word {

    private int mImageResourceId;
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    //MAKE the App still WORKING FINE, event have some Menu don't have Input Image
    //We must have two different Constructor ( this case is Word )
    //So event another Menu/Activity don't have Image it's still working fine.

    /**
     * Construktor for get 2 input ONLY ( String Miwok word and String Default Translation)
     *
     * @param miwokTranslation   this String Value
     * @param defaultTranslation this String Value
     */
    public Word(String miwokTranslation, String defaultTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    /**
     * Constructor for get 3 different input ( 2 String and 2 Image )
     *
     * @param miwokTranslation   this String Value
     * @param defaultTranslation this String Value
     * @param ImageResourceId    this is Integer / int value
     */
    public Word(String miwokTranslation, String defaultTranslation, int ImageResourceId) {
        mImageResourceId = ImageResourceId;
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
