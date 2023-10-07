package org.example;

import org.example.util.Info;
import org.example.util.Recognizer;
import org.example.util.WriteToFile;

/**
 * Hello world!
 *
 */
public class App {
    public static void main (String[] args) {

        WriteToFile.inTXT
        (
            Recognizer.getText(Info.pathTestImage + Info.nameTestImageFile2),
            Info.pathToResultFile
        );
    }
}