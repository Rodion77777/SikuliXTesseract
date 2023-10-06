package org.example;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteToFile {
    public static void inTXT (String text, String pathToFile) {
        try {
            FileUtils.writeStringToFile(new File(pathToFile + "result" + Info.getTimeStamp() + ".txt"), text, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
