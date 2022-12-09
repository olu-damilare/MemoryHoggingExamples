package org.java.staticField;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StaticFieldMemoryLeak {
    public static List<Long> list = new ArrayList<>();

    public void generateRandomValues() {
        Random random = new Random();
        for (int i = 0; i < 10000000; i++) {
            list.add(random.nextLong());
        }
    }

    public static void main(String[] args) {
        new StaticFieldMemoryLeak().generateRandomValues();
    }
}
