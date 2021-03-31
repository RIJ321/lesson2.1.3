package com.company;

public class Music {

    private int nums;
    private String chords;
    private String place;
    private Musical_instrument instrument;

    public Music (int nums, String chords,String place, Musical_instrument instrument){
        this.chords = chords;
        this.nums = nums;
        this.place = place;
        this.instrument = instrument;
    }

    public Music(int nums, String chords, String place) {
        this.nums = nums;
        this.chords=chords;
        this.place = place;
    }

    public Musical_instrument getInstrument() {
        return instrument;
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
