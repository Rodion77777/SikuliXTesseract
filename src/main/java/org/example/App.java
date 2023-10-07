package org.example;

import org.example.util.Info;
import org.example.util.Recognizer;
import org.example.util.WriteToFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 *
 */
public class App {
    public static void main (String[] args) {

        String[] images = new String[]
                {
                        Info.nameTestImageFile,
                        Info.nameTestImageFile2,
                        Info.nameTestImageFile3,
                        Info.nameTestImageFile4
                };

        for (String s : images) {
            String result = Recognizer.getText(Info.pathTestImage + s, Info.DPI);
            result = viaPattern(result);
            WriteToFile.inTXT(result, Info.pathToResultFile);
        }
    }

    public static String viaPattern (String resultText) {

        Pattern pattern = Pattern.compile("\\s(\\d{5})");
        Matcher matcher = pattern.matcher(" " + resultText);
        String foundDigits = null;

        if (matcher.find()) {
            foundDigits = matcher.group(1);
            System.out.println("[info] Распознанный пароль: " + foundDigits);
        } else {
            System.out.println("[info] Совпадение не найдено");
        }

        return foundDigits;
    }
}