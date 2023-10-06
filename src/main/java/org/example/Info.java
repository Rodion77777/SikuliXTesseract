package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Info {
    public static final String pathTestImage = "src/main/resources/";
    public static final String nameTestImageFile = "testImage.jpg";
    public static final String pathToResultFile = "src/main/resources/";

    public static String getTimeStamp () {
        return new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss")
                .format(new Date());
    }
}
