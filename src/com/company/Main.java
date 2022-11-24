package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean isDate(String input) {
        String regex = "abcdefghijklmnopqrstuv18340";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println(input + " является " + regex);
            return true;
        } else {
            System.out.println(input + " не является " + regex);
            return false;
        }
    }
    public static void main(String[] args) {
        String[] strings = {
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340"};
        for (String s:
             strings) {
            isDate(s);
        }
    }
}
