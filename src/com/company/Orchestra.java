package com.company;

public class Orchestra extends Music {

    private int quantity;
    private String song;
    private int verse;
    private Musical_instrument instrument;

    public Orchestra(int nums, String chords, String place, Musical_instrument instrument) {
        super(nums, chords, place, instrument);
        System.out.println("Quantity: " + nums + "\n" +
                "Place: " + place + "\n" +
                "Instrument: " + instrument);
    }

    public Orchestra(int nums, String chords, String place) {
        super(nums, chords, place);
    }

    public void play(int verse, int quantity) {
        this.verse = verse;
        this.quantity = quantity;
        System.out.println(
                "\n___________\n" +
                        "Verse: " + verse +
                        "\nQuantity: " + quantity);
    }

    public void play(int quantity, Musical_instrument instrument) {
        this.verse = verse;
        this.quantity = quantity;
        System.out.println(
                "\n___________\n" + "\n" +
                        "Instruments: " + instrument + "\n" +
                        "Quantity: " + quantity+"\n");
    }

    public void play(String song, int quantity) {
        this.song = song;
        this.quantity = quantity;

        System.out.println(
                "Now plays: " + song +
                        "\nQuantity: " + quantity
        );
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSong() {
        return song;
    }

    public int getVerse() {
        return verse;
    }

    protected void play(int verse, int age, String male) {

    }
}
