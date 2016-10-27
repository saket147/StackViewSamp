package com.example.saket.stackviewsamp;

/**
 * Created by saket on 27-Oct-16.
 */

import android.graphics.drawable.Drawable;

public class StackItems {

    public String text;
    public Drawable img;

    public StackItems(String text,Drawable photo)
    {
        this.img = photo;
        this.text = text;
    }
}
