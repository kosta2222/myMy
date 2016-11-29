package com.kosta.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by papa on 29.11.2016.
 */
public class Main {
        public static boolean test(String testString){
            Pattern p= Pattern.compile("[a-z]");
            Matcher m=p.matcher(testString);
            return m.matches();
        }
        public static void main(String args[]){
            System.out.println(test("k"));     //false


        }
    }


