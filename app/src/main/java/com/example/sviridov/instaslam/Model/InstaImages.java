package com.example.sviridov.instaslam.Model;

import android.net.Uri;

/**
 * Created by Artem on 12.03.2017.
 */

public class InstaImages {

    public InstaImages(Uri imageResourseUrl) {
        ImageResourseUrl = imageResourseUrl;
    }

    public Uri getImageResourseUrl() {
        return ImageResourseUrl;
    }

    private Uri ImageResourseUrl;

}
