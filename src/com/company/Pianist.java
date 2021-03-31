package com.company;

public final class Pianist extends Orchestra {
    public Pianist(int nums, String chords, String place) {
        super(nums, chords, place);
    }

    public void play(int verse, int age, String male) {
        super.play(verse, age, male);
        System.out.println("\n_________________\n" +
                "Verse: " + verse + "\n" +
                "Age: " + age + "\n" +
                "Male: " + male);
    }

}