package org.cmbk.miu.cs525.lectures.lesson9.factory;

import java.util.Random;

public class RandomIntGenerator {
    private final int min, max;

    private RandomIntGenerator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static RandomIntGenerator between(int min, int max) {
        return new RandomIntGenerator(min, max);
    }

    public static RandomIntGenerator biggerThan(int min) {
        return new RandomIntGenerator(min, Integer.MAX_VALUE);
    }

    public static RandomIntGenerator smallerThan(int max) {
        return new RandomIntGenerator(0, max);
    }

    public int next() {
        return new Random().nextInt((max - min) + 1) + min;
    }
}
