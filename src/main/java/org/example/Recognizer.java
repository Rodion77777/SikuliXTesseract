package org.example;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Recognizer {
    public static String getText (String pathToImage) {

        Tesseract tesseract = new Tesseract();

        String result = null;

        try {
            result = tesseract.doOCR(new File(pathToImage));
        } catch (TesseractException te) {
            System.err.println(te.getMessage());
        }

        return result;
    }
}
