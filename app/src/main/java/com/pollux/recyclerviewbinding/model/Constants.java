package com.pollux.recyclerviewbinding.model;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.pollux.recyclerviewbinding.model.Constants.ViewType.COLLECTION_TYPE;
import static com.pollux.recyclerviewbinding.model.Constants.ViewType.PRODUCT;
import static com.pollux.recyclerviewbinding.model.Constants.ViewType.RECIPE_TYPE;

/**
 * Created by sreekumar on 7/24/17.
 */

public class Constants {

    @IntDef({COLLECTION_TYPE, RECIPE_TYPE, PRODUCT})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
        int COLLECTION_TYPE = 100;
        int RECIPE_TYPE = 200;
        int PRODUCT = 300;
    }
}
