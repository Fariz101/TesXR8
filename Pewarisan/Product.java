public class Product {
    protected String name;
    protected int number;
    protected int quantity;   
    protected double price;
  
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int quantity() {
		return this.quantity;
	}

    public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

    public double price() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {
        name="";
        number=0;
        quantity=0;
        price=0.0;
    }

    public Product(String name, int number, int quantity, double price) {
        this.name=name;
        this.number=number;
        this.quantity=quantity;
        this.price=price;

    }  

    public void print(){
        System.out.println("Name : "+name+"\nNumber : "+number+"\nQuantity : "+quantity+"\nPrice : "+price);
    }
}
