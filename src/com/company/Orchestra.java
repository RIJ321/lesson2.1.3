package com.company;

public class Orchestra extends Music {

    private int quantity;
    private String song;
    private int verse;
    private MusicHall musicHall;
    private Musical_instrument instrument;


    public Orchestra(int nums, String chords, String place, Musical_instrument instrument, MusicHall musicHall) {
        super(nums, chords, place);
        this.instrument = instrument;
        this.musicHall = musicHall;
    }

    public Orchestra(int nums, String chords, String place, int quantity) {
        super(nums, chords, place);
        this.quantity = quantity;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("\n" +
                "Quantity: " + getQuantity() + "\n" +
                "Song: " + getSong() + "\n" +
                "Verse: " + getVerse() + "\n" +
                "Instrument: " + getInstrument() + "\n" +
                "Music hall: " + getMusicHall().getNameOfHall() + "\n" +
                "City: " + getMusicHall().getCity());
    }

    public Musical_instrument getInstrument() {
        return instrument;
    }

    public MusicHall getMusicHall() {
        return musicHall;
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

    public void playVerse(int verse, int quantity) {
        this.verse = verse;
        this.quantity = quantity;
        System.out.println("\nVERSE\n" +
                "Verse: " + verse + "\n" +
                "Quantity: " + quantity);
    }

    public void playCover(int quantity, Musical_instrument instrument) {
        this.quantity = quantity;
        System.out.println("\nCOVER\n" +
                "Instruments: " + instrument + "\n" +
                "Quantity: " + quantity + "\n");
    }

    public final void bridge(int quantity) {
        this.quantity = quantity;
        System.out.println("BRIDGE\n" + "Quantitty: " + quantity);
    }

    public void allSong(String song, int quantity) {
        this.song = song;
        this.quantity = quantity;

        System.out.println(
                "Now plays: " + song +
                        "\nQuantity: " + quantity
        );
    }

    @Override
    public void pianists() {
        super.pianists();
    }
}
