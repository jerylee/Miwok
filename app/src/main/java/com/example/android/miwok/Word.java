package com.example.android.miwok;

public class Word {


    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1; //<--- set NO Image
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //MAKE the App still WORKING FINE, event have some Menu don't have Input Image
    //We must have two different Constructor ( this case is Word )
    //So event another Menu/Activity don't have Image it's still working fine.

    /**
     * Construktor for get 2 input ONLY ( String Miwok word and String Default Translation)
     *
     * @param miwokTranslation   this String Value
     * @param defaultTranslation this String Value
     * @param audioResourceId this for AudioId
     */
    public Word(String miwokTranslation, String defaultTranslation, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Constructor for get 3 different input ( 2 String and 2 Image )
     *
     * @param miwokTranslation   this String Value
     * @param defaultTranslation this String Value
     * @param imageResourceId    this is Integer / int value
     */
    public Word(String miwokTranslation, String defaultTranslation, int audioResourceId, int imageResourceId) {

        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
        mImageResourceId = imageResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    //for make option Have Image or NOT
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    //Deceleration to String so weh can reace log for checking later
    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
