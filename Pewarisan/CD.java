public class CD extends Product {
    String artist;
    int numSong;
    String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CD() {
        super();
        artist="";
        numSong=0;
        label="";
    }

    public CD(String artist, int numSong, String label, String name, int number, int quantity, double price) {
        super(name, number, quantity, price);
        this.artist=artist;
        this.numSong=numSong;
        this.label=label;
    }

    public void print() {
        super.print();
        System.out.println("Artist : "+artist+"\nTotal Song : "+numSong+"\nLabel : "+label);
    }
}
