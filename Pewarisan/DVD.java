public class DVD extends Product {
    int length;
    String rating;
    String studio;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public DVD(){
        super();
        length=0;
        rating="";
        studio="";

    }

    public DVD(int length, String rating, String studio, String name, int number, int quantity, double price) {
        super(name, number, quantity, price);
        this.length=length;
        this.rating=rating;
        this.studio=studio;
    }

    public void print() {
        super.print();
        System.out.println("Lenghth: "+length+"\nRating : "+rating+"\nStudio : "+studio);
    }
}
