package com.company;

public final class Pianist extends Orchestra {

    private int quantity;
    private String male;

    public Pianist(int nums, String chords, String place, int quantity) {
        super(nums, chords, place, quantity);
        this.quantity = quantity;
    }

    public String getMale() {
        return male;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Male: " + male);
    }

    public final void pianists(String male) {
        super.pianists();
        this.male = male;
        System.out.println("Male: "+ male);
    }
}