package br.com.ericpereira.utils;

public class StringUtils {

    public static boolean isNullOrEmpty(String text) {
        return text == null || text.isBlank() || text.isEmpty();
    }
}
