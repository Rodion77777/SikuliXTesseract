package org.example.util;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.util.Arrays;

public class Recognizer {
    public static String getText (String pathToImage) {

        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath(Info.pathToTesseractOCR);
        tesseract.setLanguage("rus");
        tesseract.setTessVariable("tessedit_char_whitelist", "0123456789");

        String result = null;

        try {
            result = tesseract.doOCR(new File(pathToImage));
        } catch (TesseractException te) {
            System.err.println(te.getMessage());
        }

        return result;
    }
}
