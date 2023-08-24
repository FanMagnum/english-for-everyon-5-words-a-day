package com.lone.words;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Week1 {
    static final Logger logger = LoggerFactory.getLogger(Week1.class);
    public static void main(String[] args) {
        String[] day1 = {"one", "two", "three", "four", "five"};
        String[] day2 = {"pineapple", "grapes", "banana", "orange", "apple"};
        String[] day3 = {"green", "blue", "red", "yellow", "purple"};
        String[] day4 = {"words", "colours", "board", "teacher", "class"};
        Arrays.stream(day1).forEach(s -> logger.atInfo().log("{}", s));
        Arrays.stream(day2).forEach(s -> logger.atInfo().log("{}", s));
        Arrays.stream(day3).forEach(s -> logger.atInfo().log("{}", s));
        Arrays.stream(day4).forEach(s -> logger.atInfo().log("{}", s));
    }
}
