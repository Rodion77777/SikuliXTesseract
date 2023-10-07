package org.example.util;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Recognizer {
    public static String getText (String pathToImage, String dpi) {

        Tesseract tesseract = new Tesseract();

        tesseract.setDatapath(Info.pathToTesseractOCR);
        if (dpi != null) tesseract.setTessVariable("user_defined_dpi", dpi);
        tesseract.setLanguage("rus+eng");

        String result = null;

        try {
            result = tesseract.doOCR(new File(pathToImage));
        } catch (TesseractException te) {
            System.err.println(te.getMessage());
        }

        System.out.println(result);
        return result;
    }
}

//tesseract.setTessVariable("tessedit_char_whitelist", "0123456789");
//tesseract.setTessVariable("user_patterns", "\\:\\s(\\d{5})");