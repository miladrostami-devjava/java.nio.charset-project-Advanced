package com.convert;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class EncodingConversionDemo {
    public static void main(String[] args) {

        String text = "سلام میلاد چطوری!!!";
        Charset sourceCharset = StandardCharsets.UTF_8;
        Charset targetCharset = StandardCharsets.ISO_8859_1;
        Charset targetCharset2 = StandardCharsets.US_ASCII ;

        byte[] utf8Bytes = text.getBytes(StandardCharsets.UTF_8);
        String convertBytes = new String(utf8Bytes,targetCharset);
        String convertBytes2 = new String(utf8Bytes,targetCharset2);

        System.out.println("Original text :" + text);
        System.out.println("Converted :" + convertBytes);
        System.out.println("Converted2 :" + convertBytes2);

    }
}
