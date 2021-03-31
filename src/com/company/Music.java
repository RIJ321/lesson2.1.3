package com.company;

public class Music {

    private int nums;
    private String chords;
    private String place;


    public Music(int nums, String chords, String place) {
        this.chords = chords;
        this.nums = nums;
        this.place = place;
    }


    /*public Music(int nums, String chords, String place) {
        this.nums = nums;
        this.chords=chords;
        this.place = place;
    }*/
    public void info() {
        System.out.println("\nNums: " + nums + "\n" +
                "Chords: " + chords + "\n" +
                "Place: " + place + "\n");
    }

    public void pianists() {
        System.out.println("\nPIANO PLAYS\n" +
                "Nums: " + nums + "\n" +
                "Chords: " + chords + "\n" +
                "Place: " + place);
    }


    public int getNums() {
        return nums;
    }

    public String getChords() {
        return chords;
    }

    public String getPlace() {
        return place;
    }

}
